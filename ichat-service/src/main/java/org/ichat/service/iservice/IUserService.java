package org.ichat.service.iservice;

import java.util.UUID;

import org.ichat.service.bo.UserBo;

public interface IUserService {
	
	UUID createUser(UserBo bo);
	
}
