package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.service.JDBCConnectionService;
import com.jt.service.JDBCServiceB;
import com.jt.service.JDBCServiceC;

@RestController
public class JDBCController {
	
	@Autowired
	private JDBCConnectionService jdbcService;
	
	@Autowired
	private JDBCServiceB jdbcServiceB;
	
	@Autowired
	private JDBCServiceC jdbcServiceC;
	
	@RequestMapping("/jdbcTest")
	public JDBCConnectionService jdbcTest() {
		System.out.println(jdbcService);
		return jdbcService;
	}
	@RequestMapping("/jdbcTestB")
	public JDBCServiceB jdbcTestB() {
		return jdbcServiceB;
	}
	
	@RequestMapping("/jdbcTestC")
	public JDBCServiceC jdbcTestC() {
		return jdbcServiceC;
	}
	
}
