package org.ichat.domain.config;

import java.util.Arrays;
import java.util.List;

import org.ichat.domain.config.cassandra.CassandraConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;

import com.datastax.driver.core.ProtocolVersion;

@Configuration
@ComponentScan(basePackages = "org.ichat.domain.config")
@EnableConfigurationProperties
public class IChatCassandraConfig extends AbstractCassandraConfiguration {

	@Autowired
	private CassandraConfig cassandraConfig;

	@Override
	protected String getKeyspaceName() {
		return cassandraConfig.getKeyspace();
	}

	@Override
	protected ProtocolVersion getProtocolVersion() {
		return ProtocolVersion.V3;
	}

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE_IF_NOT_EXISTS;
	}

	@Override
	protected String getContactPoints() {
		return cassandraConfig.getContactpoints();
	}

	@Override
	protected int getPort() {
		return cassandraConfig.getPort();
	}

	@Override
	protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
		CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(getKeyspaceName())
				.ifNotExists();
		return Arrays.asList(specification);
	}

	@Override
	public String[] getEntityBasePackages() {
		return new String[] { "org.ichat.domain.domain" };
	}

}
