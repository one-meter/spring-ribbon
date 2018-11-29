package com.zzz.demo.springribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/29 14:06
 * @since v1.0.0
 */
@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;

	public String hiService() {
		return restTemplate.getForObject("http://SERVICE-WEB/web_test", String.class);
	}

}
