package org.ichat.front.controller;

import java.util.List;

import org.ichat.front.convertor.UserVBConvertor;
import org.ichat.front.vo.UserVo;
import org.ichat.service.bo.UserBo;
import org.ichat.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	public String createUsers(UserVo userVo) {
		
		UserBo userBo = UserVBConvertor.trans(userVo);
		
		return userService.createUser(userBo).toString();
	}
	
	public List<UserVo> getUsersByName() {
		return null;
	}
}
