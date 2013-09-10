package com.home.events.prime.simple;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.EntityNotFoundException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.home.dao.MongoDao;
import com.home.events.prime.PrimeFinder;
import com.home.model.cloud.jpa.Prime;
import com.home.model.cloud.mongo.MongoPrime;
import com.home.service.model.DtoService;

@Service("primeFinder")
public class SimplePrimeFinder implements PrimeFinder {
	private final Logger log = Logger.getLogger(SimplePrimeFinder.class);

	private final DtoService<Prime, Integer> primeDtoService;
	private final MongoDao<MongoPrime, Integer> primeMongoDao;
	
	@Autowired
	public SimplePrimeFinder(@Qualifier("primeDtoService") DtoService<Prime, Integer> primeDtoService,
			MongoDao<MongoPrime, Integer> primeMongoDao) {
		super();
		this.primeDtoService=primeDtoService;
		this.primeMongoDao=primeMongoDao;
	}
	
	@Override
	public void find() {
		log.info("Beginning prime finding...");
		Prime prime;
		try {
			prime = primeDtoService.findOne("1=1", "prime DESC");
		} catch(EntityNotFoundException e) {
			prime = new Prime(BigInteger.valueOf(2));
			prime = primeDtoService.merge(prime);
			
			MongoPrime mongoPrime = new MongoPrime(prime);
			primeMongoDao.merge(mongoPrime);
		}
		
		while(true) {
			Prime nextPrime = getNextPrime(prime);
			nextPrime = primeDtoService.merge(nextPrime);

			MongoPrime mongoPrime = new MongoPrime(prime);
			primeMongoDao.merge(mongoPrime);
			if(nextPrime.getPrime().subtract(BigInteger.ONE).mod(BigInteger.valueOf(173)).equals(BigInteger.ZERO)) {
				log.info("Prime: "+nextPrime.getPrime());
			}
			prime = nextPrime;
		}
	}

	private Prime getNextPrime(Prime prime) {
		BigInteger largestCurrentPrime = prime.getPrime();
		
		if(largestCurrentPrime.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
			largestCurrentPrime = largestCurrentPrime.add(BigInteger.ONE);
		} else {
			largestCurrentPrime = largestCurrentPrime.add(BigInteger.valueOf(2));
		}
		
		while(isNotPrime(largestCurrentPrime)) {
			largestCurrentPrime = largestCurrentPrime.add(BigInteger.valueOf(2));
		}
		
		return new Prime(largestCurrentPrime);
	}

	private boolean isNotPrime(BigInteger value) {
		BigDecimal decimalValue = new BigDecimal(value);
		
		BigInteger max = new BigDecimal(Math.sqrt(decimalValue.doubleValue())).setScale(0, BigDecimal.ROUND_UP).toBigInteger();
		
		for(BigInteger check = BigInteger.valueOf(3); check.compareTo(max) <=0; check = check.add(BigInteger.valueOf(2))) {
			if(value.mod(check).compareTo(BigInteger.valueOf(0)) == 0) {
				return true;
			}
		}
		
		return false;
	}

}