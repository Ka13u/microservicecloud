package com.code.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.code.springcloud.entity.Dept;
import com.code.springcloud.service.DeptService;

import java.util.List;

@RestController
public class DeptController
{
	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		return service.list();
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")   //不符合AOP思想
	public Dept get(@PathVariable("id") Long id)
	{
		Dept dept = service.get(id);
		if(dept == null){
			throw new RuntimeException("该ID：" + id + "没有对应信息");
		}
		return dept;
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id)
	{
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应信息,--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}

}
