package com.home.model.cloud.mongo;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.home.model.cloud.MongoCloudTable;
import com.home.model.cloud.jpa.Prime;

@Document(collection="MongoPrime")
public class MongoPrime implements MongoCloudTable<Integer>  {
	private static final long serialVersionUID = 7411914084961501339L;
	
	@Id
	private String id;
	private Integer pk;
	private Date dateAdded = new Date();
	private Date dateLastModified = new Date();
	private Boolean isDeleted = false;

	private BigInteger prime;
	
	public MongoPrime() {
		super();
	}

	public MongoPrime(String id, Integer pk, Date dateAdded,
			Date dateLastModified, Boolean isDeleted, BigInteger prime) {
		super();
		this.id = id;
		this.pk = pk;
		this.dateAdded = dateAdded;
		this.dateLastModified = dateLastModified;
		this.isDeleted = isDeleted;
		this.prime = prime;
	}

	public MongoPrime(Prime prime) {
		super();
		this.id=prime.getPk().toString();
		this.pk=prime.getPk();
		this.prime=prime.getPrime();
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

	public BigInteger getPrime() {
		return prime;
	}

	public void setPrime(BigInteger prime) {
		this.prime = prime;
	}

	@Override
	public String toString() {
		return "MongoPrime [id=" + id + ", pk=" + pk + ", dateAdded="
				+ dateAdded + ", dateLastModified=" + dateLastModified
				+ ", isDeleted=" + isDeleted + ", prime=" + prime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime
				* result
				+ ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
		result = prime * result
				+ ((this.prime == null) ? 0 : this.prime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MongoPrime other = (MongoPrime) obj;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (dateLastModified == null) {
			if (other.dateLastModified != null)
				return false;
		} else if (!dateLastModified.equals(other.dateLastModified))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (pk == null) {
			if (other.pk != null)
				return false;
		} else if (!pk.equals(other.pk))
			return false;
		if (prime == null) {
			if (other.prime != null)
				return false;
		} else if (!prime.equals(other.prime))
			return false;
		return true;
	}

}
