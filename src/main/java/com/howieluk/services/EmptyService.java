package com.howieluk.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.howieluk.mappers.EmptyMapper;
import com.howieluk.pojo.User;

@Service
@Transactional
public class EmptyService {
	
	@Autowired
	EmptyMapper emptyMapper;
	
	public List<User> getAll() {
		return this.emptyMapper.getAll();
	}
	
}
