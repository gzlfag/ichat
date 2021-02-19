package org.ichat.service.convertor;

import org.ichat.domain.domain.User;
import org.ichat.domain.domain.UserKey;
import org.ichat.service.bo.UserBo;
import org.springframework.lang.NonNull;

public class UserConvertor {
	
	private UserConvertor() {
		throw new IllegalStateException("Utility class");
	}
	
	public static UserBo trans(@NonNull User user) {
		UserKey uk = user.getKey();
		return UserBo.builder().id(uk.getId()).account(user.getAccount()).password(user.getPassword())
				.name(uk.getName()).build();
	}

	public static User trans(@NonNull UserBo userBo) {
		UserKey uk = UserKey.builder().id(userBo.getId()).name(userBo.getName()).build();
		return User.builder().key(uk).account(userBo.getAccount()).password(userBo.getPassword()).build();
	}
}
