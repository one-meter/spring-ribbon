package com.zzz.demo.springribbon.controller;

import com.zzz.demo.springribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/29 14:08
 * @since v1.0.0
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/")
	public String hello() {
		return helloService.hiService();
	}

}
