package com.home.dao.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.home.dao.MongoDao;
import com.home.model.cloud.MongoCloudTable;

public class SimpleMongoDao<T extends MongoCloudTable<PK>, PK extends Comparable<PK>> implements MongoDao<T, PK> {
	
	@Autowired @Qualifier("mongoTemplate")
	private MongoOperations mongoOperations;
	
	private final Class<T> entityClass;

	public SimpleMongoDao(Class<T> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	@Override
	public void add(T record) {
		checkCollectionExists();
		
		mongoOperations.insert(record);
	}

	@Override
	public T merge(T record) {
		checkCollectionExists();
		
		mongoOperations.save(record);
		
		List<T> results = mongoOperations.find(new Query(Criteria.where("id").is(record.getId())), entityClass);
		
		return results.get(0);
	}

	@Override
	public void remove(T record) {
		checkCollectionExists();
		
		mongoOperations.remove(record);
	}

	@Override
	public T findByID(PK id) {
		checkCollectionExists();
		
		return mongoOperations.findById(id, entityClass);
	}

	@Override
	public T find(PK key) {
		checkCollectionExists();
		
		return mongoOperations.findOne(new Query(Criteria.where("id").is(key)), entityClass);
	}

	@Override
	public List<T> findAll() {
		checkCollectionExists();
		
		return mongoOperations.findAll(entityClass);
	}

	@Override
	public List<T> query(Criteria criteria) {
		checkCollectionExists();
		
		if(criteria == null) {
			criteria = new Criteria();
		}
		
		return mongoOperations.find(new Query(criteria), entityClass);
	}
	
	@Override
	public List<T> query(Criteria criteria, Sort sort) {
		checkCollectionExists();
		
		if(criteria == null) {
			criteria = new Criteria();
		}
		
		if(sort == null) {
			sort = new Sort("pk");
		}
		
		return mongoOperations.find(new Query(criteria).with(sort), entityClass);
	}
	
	@Override
	public List<T> query(Criteria criteria, Sort sort, Integer limit) {
		checkCollectionExists();
		
		if(criteria == null) {
			criteria = new Criteria();
		}
		
		if(sort == null) {
			sort = new Sort("pk");
		}
		
		return mongoOperations.find(new Query(criteria).with(sort).limit(limit), entityClass);
	}

	@Override
	public List<T> query(Query query) {
		checkCollectionExists();
		
		return mongoOperations.find(query, entityClass);
	}

	private void checkCollectionExists() {
		if(!mongoOperations.collectionExists(entityClass)) {
			mongoOperations.createCollection(entityClass);
		}
	}

}
