package com.net.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.net.mapper.UserMappper;
import com.net.service.IUserService;
import com.net.service.base.BaseService;

@Component("userService")
public class UserServiceImpl extends BaseService implements IUserService {

	@Override
	public List<Map<String, Object>> qeuryAllUser() throws Exception {
		UserMappper mapper = writeSqlSession.getMapper(UserMappper.class);
		return mapper.qeuryAllUser();
	}
}
