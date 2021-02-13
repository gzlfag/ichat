package org.ichat.front.convertor;

import java.util.UUID;

import org.ichat.front.vo.UserVo;
import org.ichat.service.bo.UserBo;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;

public class UserVBConvertor {

	public static UserBo trans(@NonNull UserVo userVo) {
		UserBo userBo = UserBo.builder().build();

		BeanUtils.copyProperties(userVo, userBo, new String[] { "id" });
		userBo.setId(UUID.fromString(userVo.getId()));

		return userBo;
	}

	public static UserVo trans(@NonNull UserBo userBo) {
		UserVo userVo = UserVo.builder().build();

		BeanUtils.copyProperties(userBo, userVo, new String[] { "id" });
		userVo.setId(userBo.getId().toString());
		
		return userVo;
	}
}
