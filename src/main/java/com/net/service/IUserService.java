package com.net.service;

import java.util.List;
import java.util.Map;

public interface IUserService {

	/** query all users **/
	public List<Map<String, Object>> qeuryAllUser() throws Exception;
}
