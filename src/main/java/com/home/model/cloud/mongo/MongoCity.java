package com.home.model.cloud.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.home.model.cloud.MongoCloudTable;

@Document(collection="MongoCity")
public class MongoCity implements MongoCloudTable<Integer> {
	private static final long serialVersionUID = 2791988850037856989L;

	@Id
	private String id;

	@Indexed(unique=true)
	private String name;
	@DBRef
	@Indexed
	private MongoCountry country;
	@DBRef
	@Indexed
	private MongoState state;
	
	public MongoCity() {
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
	
	public MongoCountry getCountry() {
		return country;
	}

	public void setCountry(MongoCountry country) {
		this.country = country;
	}

	public MongoState getState() {
		return state;
	}

	public void setState(MongoState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("City [");
		builder.append("id="+id+", ");
		builder.append("name="+name+", ");
		builder.append("country="+country);
		builder.append("state="+state);
		builder.append("]");
		
		return builder.toString();
	}

}
