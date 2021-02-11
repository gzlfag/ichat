package org.ichat.domain;

import java.util.UUID;

import org.ichat.domain.config.IChatCassandraConfig;
import org.ichat.domain.domain.User;
import org.ichat.domain.domain.UserKey;
import org.ichat.domain.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IChatCassandraConfig.class)
@EnableCassandraRepositories(basePackages = "org.ichat.domain.repository")
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void insertTest() {
		UserKey uk = UserKey.builder().id(UUID.randomUUID()).name("satori").build();
		User user = User.builder().account("guyuhan66").password("7895123").key(uk).build();
		System.out.println(userRepository.insert(user));
	}
}
