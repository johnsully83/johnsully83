package com.home.model.cloud;

import java.io.Serializable;


public interface MongoCloudTable<PK extends Comparable<PK>> extends Serializable {

	public String getId();
	
	public void setId(String id);
	
}
