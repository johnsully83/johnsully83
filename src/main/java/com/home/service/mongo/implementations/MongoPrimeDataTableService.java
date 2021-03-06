package com.home.service.mongo.implementations;

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

@Service("mongoPrimeDataTableService")
public class MongoPrimeDataTableService extends AbstractMongoDataTableService<MongoPrime, Integer, MongoPrimeView> {

	@Autowired
	public MongoPrimeDataTableService(@Qualifier("primeMongoDao") MongoDao<MongoPrime, Integer> primeMongoDao) {
		super(primeMongoDao);
	}

	@Override
	protected List<MongoPrimeView> convertNonEmptyDtosToViews(List<MongoPrime> records) {
		List<MongoPrimeView> views = new ArrayList<MongoPrimeView>();
		
		for(MongoPrime prime : records) {
			MongoPrimeView view = new MongoPrimeView();
			
			view.setCardinality(prime.getId());
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
		Query query = new Query().with(new Sort(Direction.DESC, "_id")).limit(10000);
		
		return getMongoDao().query(query);
	}

}
