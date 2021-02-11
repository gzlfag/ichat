package org.ichat.service;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.ichat.service.bo.UserBo;
import org.ichat.service.config.ServiceTestConfig;
import org.ichat.service.iservice.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceTestConfig.class)
public class UserServiceTest {
	
	@Autowired
	private IUserService userService;
	
	@Test
	public void createUser() {
		
		UUID id = UUID.randomUUID();
		
		UserBo userBo = UserBo.builder().id(id).account("accountTest").name("nameTest")
				.password("7895123").build();
		UUID newid = userService.createUser(userBo);
		assertEquals(newid, id);
	}
	
}
