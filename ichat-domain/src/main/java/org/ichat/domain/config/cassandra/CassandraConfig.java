package org.ichat.domain.config.cassandra;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "cassandra")
@PropertySource("classpath:cassandra.properties")
@Data
public class CassandraConfig {

	private String contactpoints;

	private int port;
	
	private String keyspace;
}
