package com.example.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mu.JSONResult;

@RestController
public class UserController {

	// 路由映射到/users
	@RequestMapping(value = "/users", produces = "application/json;charset=UTF-8")
	public String usersList() {

		ArrayList<String> users = new ArrayList<String>() {
			
			private static final long serialVersionUID = 1L;

			{
				add("freewolf");
				add("tom");
				add("jerry");
			}
		};

		return JSONResult.fillResultString(0, "", users);
	}

	@RequestMapping(value = "/hello", produces = "application/json;charset=UTF-8")
	public String hello() {
		ArrayList<String> users = new ArrayList<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add("what a fuck");
			}
		};
		return JSONResult.fillResultString(0, "", users);
	}

	@RequestMapping(value = "/world", produces = "application/json;charset=UTF-8")
	public String world() {
		ArrayList<String> users = new ArrayList<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add("fuck");
			}
		};
		return JSONResult.fillResultString(0, "", users);
	}
}
