package com.icore.office.repository;

import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icore.office.domin.LookupGroup;
@Repository
public interface LookupGroupRepositroy extends CrudRepository<LookupGroup, Integer>,QuerydslPredicateExecutor<LookupGroup> {

	public LookupGroup save(LookupGroup lookupGroup);
	
	public List<LookupGroup> findByLookupGroupCode(String lookupGroupCode);
	
	public LookupGroup findByLookupGroupId(Integer lookupGroupId);
	
}
