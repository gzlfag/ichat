package org.ichat.service.bo;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBo {

	private UUID id;

	private String name;

	private String account;

	private String password;

}
