package com.icore.office.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icore.office.domin.LookupDtl;

@Repository
public interface LookupDtlRepository extends CrudRepository<LookupDtl, Integer>,QuerydslPredicateExecutor<LookupDtl>{

}
