package com.sp.app.service;

import org.springframework.stereotype.Service;

import com.sp.app.model.Demo;
@Service
public interface DemoService {
	public void insertDemo(Demo dto) throws Exception;

}
