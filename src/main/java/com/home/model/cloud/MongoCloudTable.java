package com.home.model.cloud;


public interface MongoCloudTable<PK extends Comparable<PK>> extends CloudTable<PK> {

	public String getId();
	
	public void setId(String id);
	
}
