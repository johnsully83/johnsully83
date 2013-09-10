package com.home.dao;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.home.model.cloud.CloudTable;

public interface MongoDao<T extends CloudTable<PK>, PK extends Comparable<PK>> {
	
	public void add(T record);
	
	public T merge(T record);
	
	public void delete(T record);
	
	public void remove(T record);
	
	public T findByID(String id);
	
	public T find(PK key);

	public List<T> findAll();
	
	public List<T> query(Criteria criteria);

	public List<T> query(Query query);

}
