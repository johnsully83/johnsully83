package com.home.model.cloud.mongo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.home.model.cloud.MongoCloudTable;

@Document(collection="MongoCountry")
public class MongoCountry implements MongoCloudTable<Integer> {
	private static final long serialVersionUID = 2805152574282976239L;

	@Id
	private String id;
	private Integer pk;
	private Date dateAdded = new Date();
	private Date dateLastModified = new Date();
	private Boolean isDeleted = false;

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
		builder.append("pk="+id+", ");
		builder.append("dateAdded="+dateAdded+", ");
		builder.append("dateLastModified="+dateLastModified+", ");
		builder.append("isDeleted="+isDeleted+", ");
		builder.append("name="+name+", ");
		builder.append("hasStates="+hasStates);
		builder.append("]");
		
		return builder.toString();
	}

}
