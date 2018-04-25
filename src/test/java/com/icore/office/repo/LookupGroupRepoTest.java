package com.icore.office.repo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.icore.office.domin.LookupGroup;
import com.icore.office.repository.LookupGroupRepositroy;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT, properties = { "spring.profiles.active: dev" })
public class LookupGroupRepoTest {

	@Autowired
	private LookupGroupRepositroy lookupgroup;
	
	
	@Test
	public void testsave() {
		LookupGroup group=new LookupGroup();
		group.setLookupGroupCode("test");
		group.setLookupGroupDescription("firest test");
		group=lookupgroup.save(group);
		assertNotNull(group);
	}
	
}
