package org.ichat.service.serviceImpl;

import java.util.UUID;

import org.ichat.domain.repository.UserRepository;
import org.ichat.service.bo.UserBo;
import org.ichat.service.convertor.UserConvertor;
import org.ichat.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UUID createUser(UserBo bo) {
		return userRepository.save(UserConvertor.trans(bo)).getKey().getId();
	}

}
