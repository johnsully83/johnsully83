package com.home.model.cloud.mongo;

import java.util.Date;

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
	private Integer pk;
	private Date dateAdded = new Date();
	private Date dateLastModified = new Date();
	private Boolean isDeleted = false;

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

	@Override
	public Integer getPk() {
		return pk;
	}

	@Override
	public void setPk(Integer pk) {
		this.pk = pk;
	}

	@Override
	public Date getDateAdded() {
		return dateAdded;
	}

	@Override
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public Date getDateLastModified() {
		return dateLastModified;
	}

	@Override
	public void setDateLastModified(Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@Override
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@Override
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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
		builder.append("pk="+id+", ");
		builder.append("dateAdded="+dateAdded+", ");
		builder.append("dateLastModified="+dateLastModified+", ");
		builder.append("isDeleted="+isDeleted+", ");
		builder.append("name="+name+", ");
		builder.append("country="+country);
		builder.append("state="+state);
		builder.append("]");
		
		return builder.toString();
	}

}
