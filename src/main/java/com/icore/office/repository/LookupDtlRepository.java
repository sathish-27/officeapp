package com.icore.office.repository;

import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icore.office.domin.LookupDtl;

@Repository
public interface LookupDtlRepository extends CrudRepository<LookupDtl, Integer>,QuerydslPredicateExecutor<LookupDtl>{

	public LookupDtl save(LookupDtl dtl);
	
	public List<LookupDtl> findByLookupGroup_LookupGroupCode(String lookupGroupCode);
	
	public List<LookupDtl> findByLookupDtlId(Integer lookupdtlid);
	
	public List<LookupDtl>  findByDetailCode(String lookupDtlCode);
	
	public LookupDtl findByLookupGroup_LookupGroupCodeAndDetailCode(String lookupGroupCode,String lookupdtlCode);
	
	public void delete (LookupDtl lookupDtl);
}
