package com.home.model.cloud.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.home.model.cloud.MongoCloudTable;

@Document(collection="MongoCountry")
public class MongoCountry implements MongoCloudTable<Integer> {
	private static final long serialVersionUID = 2805152574282976239L;

	@Id
	private String id;

	@Indexed(unique=true)
	private String name;
	private Boolean hasStates=true;
	
	public MongoCountry() {
		super();
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHasStates() {
		return hasStates;
	}

	public void setHasStates(Boolean hasStates) {
		this.hasStates = hasStates;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Country [");
		builder.append("id="+id+", ");
		builder.append("name="+name+", ");
		builder.append("hasStates="+hasStates);
		builder.append("]");
		
		return builder.toString();
	}

}
