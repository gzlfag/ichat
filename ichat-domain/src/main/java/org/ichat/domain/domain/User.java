package org.ichat.domain.domain;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Table("users")
@Data
@Builder
public class User {
	
	@PrimaryKey
	private UserKey key;
	
	private String account;
	
	private String password;
	
}
