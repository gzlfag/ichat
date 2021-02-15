package org.ichat.front.vo;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVo {
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String account;
	
	private String id;
	
	@NotBlank
	private String password;
	
}
