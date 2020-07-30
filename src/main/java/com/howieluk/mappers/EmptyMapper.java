package com.howieluk.mappers;

import java.util.List;

import com.howieluk.pojo.User;

public interface EmptyMapper {
	/**
	 * 获取所有用户
	 * @return 用户列表
	 */
	public List<User> getAll();
}
