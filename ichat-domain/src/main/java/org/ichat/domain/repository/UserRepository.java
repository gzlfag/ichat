package org.ichat.domain.repository;

import java.util.List;

import org.ichat.domain.domain.User;
import org.ichat.domain.domain.UserKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, UserKey> {
	
	List<User> findByKeyName(String name);
}
