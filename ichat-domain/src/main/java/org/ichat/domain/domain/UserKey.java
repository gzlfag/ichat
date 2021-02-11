package org.ichat.domain.domain;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import lombok.Builder;
import lombok.Data;

@PrimaryKeyClass
@Data
@Builder
public class UserKey implements Serializable{
	
	private static final long serialVersionUID = -8336341112128266495L;

	@PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED)
	private UUID id;
	
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
	private String name;
}
