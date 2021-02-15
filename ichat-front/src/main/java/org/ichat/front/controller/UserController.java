package org.ichat.front.controller;

import java.util.List;

import org.ichat.front.convertor.UserVBConvertor;
import org.ichat.front.vo.UserVo;
import org.ichat.service.bo.UserBo;
import org.ichat.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping
	public String createUsers(@RequestBody @Validated UserVo userVo, BindingResult bindingResult) {
		UserBo userBo = UserVBConvertor.trans(userVo);
		return userService.createUser(userBo).toString();
	}
	
	@GetMapping(path = "/{name}")
	public List<UserVo> getUsersByName(@PathVariable("name") String name) {
		return null;
	}
	
}
