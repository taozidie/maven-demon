package com.net.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface UserMappper {

	@Select("select * from maven_user ")
	public List<Map<String, Object>> qeuryAllUser();
	
}
