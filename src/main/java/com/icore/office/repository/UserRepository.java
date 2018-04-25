package com.icore.office.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icore.office.domin.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>,QuerydslPredicateExecutor<User> {

	/*@SuppressWarnings("unchecked")
	public User save (User user);
	
	public User FindByUserId(Integer integer);
	
	public void delete(User user);*/
}
