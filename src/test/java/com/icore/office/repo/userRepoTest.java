package com.icore.office.repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.icore.office.domin.User;
import com.icore.office.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT, properties = { "spring.profiles.active: test" })

public class userRepoTest {

	
	@Autowired
	private UserRepository repository;
	
	
	@Test
	public void save() {
		User user=new User(); 
	}
}
