package org.ichat.service.iservice;

import java.util.List;
import java.util.UUID;

import org.ichat.service.bo.UserBo;

public interface IUserService {
	
	UUID createUser(UserBo bo);
	
	List<UserBo> getUserByName(String name);
}
