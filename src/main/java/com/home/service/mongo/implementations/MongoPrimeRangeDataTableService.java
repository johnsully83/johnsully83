package com.home.service.mongo.implementations;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.home.dao.MongoDao;
import com.home.model.cloud.mongo.MongoPrime;
import com.home.model.datatable.JQueryDataTableParameter;
import com.home.model.datatable.structure.ColumnConfiguration;
import com.home.model.datatable.structure.enums.Searchable;
import com.home.model.datatable.structure.enums.Sortable;
import com.home.model.datatable.structure.enums.Visible;
import com.home.model.datatable.structure.simple.SimpleColumn;
import com.home.model.datatable.structure.simple.SimpleColumnConfiguration;
import com.home.model.datatable.view.MongoPrimeView;
import com.home.service.mongo.AbstractMongoDataTableService;
import com.home.utility.Utility;

@Service("mongoPrimeRangeDataTableService")
public class MongoPrimeRangeDataTableService extends
		AbstractMongoDataTableService<MongoPrime, Integer, MongoPrimeView> {

	@Autowired
	public MongoPrimeRangeDataTableService(@Qualifier("primeMongoDao") MongoDao<MongoPrime, Integer> primeMongoDao) {
		super(primeMongoDao);
	}

	@Override
	protected List<MongoPrimeView> convertNonEmptyDtosToViews(List<MongoPrime> records) {
		List<MongoPrimeView> views = new ArrayList<MongoPrimeView>();
		
		for(MongoPrime prime : records) {
			MongoPrimeView view = new MongoPrimeView();
			
			view.setCardinality(Utility.forceParseInteger(prime.getId()));
			view.setValue(prime.getPrime().toString());
			
			views.add(view);
		}
		
		return views;
	}

	@Override
	protected ColumnConfiguration convertEntityToColumns(MongoPrimeView row) {
		ColumnConfiguration columnConfig = new SimpleColumnConfiguration();
		
		columnConfig.setColumn(0, new SimpleColumn(Visible.YES, Sortable.YES, row.getCardinality(),
			Searchable.YES, row.getCardinality().toString()));
		columnConfig.setColumn(1, new SimpleColumn(Visible.YES, Sortable.YES, row.getValue(),
				Searchable.YES, row.getValue()));
		
		return columnConfig;
	}

	@Override
	protected List<MongoPrime> query(JQueryDataTableParameter parameters) {
		if(parameters.getFromPrime() == null || parameters.getToPrime() == null
				|| parameters.getToPrime() <= 0) {
			Query query = new Query().limit(1000).with(new Sort(Direction.DESC, "pk"));
			
			return getMongoDao().query(query);
		} else {
			Query query = Query.query(
					where("pk").gte(parameters.getFromPrime()).lte(parameters.getToPrime()))
				.limit(1000).with(new Sort(Direction.DESC, "id"));

			return getMongoDao().query(query);
		}
	}

}
