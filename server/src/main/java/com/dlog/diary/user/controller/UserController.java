package com.dlog.diary.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dlog.diary.user.dto.UserDto;
import com.dlog.diary.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/user")
@Api(value="사용자 API")
public class UserController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="사용자 추가")
	public Map<String, Object> setUser(@RequestBody UserDto parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		userService.setUser(parameters); // 결과값을 리턴하도록은 해야겠다...
		
		//로그인 후 로그인 정보 반환 예정
		
		return result;	
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="사용자 수정")
	public Map<String, Object> putUser(@RequestBody String parameters) {
		Map<String, Object> result = new HashMap<String, Object>();
		userService.putUser(parameters);
		return result;	
	}

	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="사용자 조회")
	@ApiParam(name = "사용자 ID", value = "userId", required = true, example="0000")
	public Map<String, Object> getUser(String userId) throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("user", userService.getUser(userId));
		return result;
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="사용자 삭제")
	@ApiParam(name = "사용자 ID", value = "userId", required = true, example="0000")
	public Map<String, Object> removeUser(String userId) throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		userService.removeUser(userId);
		return result;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login(String userId) throws Exception {
		//작업예정
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public void logout(String userId) throws Exception {
		//작업예정
	}
	
}
