package org.ichat.front.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVo {
	
	private String name;
	
	private String account;
	
	private String id;
	
	private String password;
	
}
