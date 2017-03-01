package com.jiely.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里我们使用RestController  （等待于 @Controller 和 @RequestBody）
 * @author Angel -- 守护天使
 * @version v.0.1
 * @date 2016年12月10日
 */
@RestController
public class HelloController {
	
	/**
	 * 在这里我们使用@RequestMapping 建立请求映射:
	 * http://127.0.0.1:8080/hello
	 * @return yy
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "hello-2016-12-111.v.jpa";
	}

	@RequestMapping("/hello1")
	public String hello1(){
		return "1133322";
	}
	

}
