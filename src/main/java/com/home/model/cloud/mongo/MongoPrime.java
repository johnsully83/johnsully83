package com.home.model.cloud.mongo;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.home.model.cloud.MongoCloudTable;
import com.home.model.cloud.jpa.Prime;

@Document(collection="Prime")
public class MongoPrime implements MongoCloudTable<Integer> {
	private static final long serialVersionUID = 7411914084961501339L;
	
	@Id
	@Indexed
	private String id;

	private BigInteger prime;
	
	public MongoPrime() {
		super();
	}

	public MongoPrime(String id, BigInteger prime) {
		super();
		this.id = id;
		this.prime = prime;
	}

	public MongoPrime(Prime prime) {
		super();
		this.id=prime.getPk().toString();
		this.prime=prime.getPrime();
	}


	public MongoPrime(BigInteger prime) {
		super();
		this.prime = prime;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getPrime() {
		return prime;
	}

	public void setPrime(BigInteger prime) {
		this.prime = prime;
	}

}
