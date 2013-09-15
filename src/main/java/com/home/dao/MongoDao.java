package com.home.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.home.model.cloud.MongoCloudTable;

public interface MongoDao<T extends MongoCloudTable<PK>, PK extends Comparable<PK>> {
	
	public void add(T record);
	
	public T merge(T record);
	
	public void remove(T record);
	
	public T findByID(String id);
	
	public T find(PK key);

	public List<T> findAll();
	
	public List<T> query(Criteria criteria);
	
	public List<T> query(Criteria criteria, Sort sort);

	public List<T> query(Criteria criteria, Sort sort, Integer limit);

	public List<T> query(Query query);

}
