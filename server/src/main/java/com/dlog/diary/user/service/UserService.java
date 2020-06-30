package com.dlog.diary.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dlog.diary.user.dto.UserDto;
import com.dlog.diary.user.entity.Goal;
import com.dlog.diary.user.entity.User;
import com.dlog.diary.user.mapper.GoalMapper;
import com.dlog.diary.user.mapper.UserMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	GoalMapper goalMapper;
	
	public void setUser(String parameters) {
		try{
			UserDto userDto = new ObjectMapper().readValue(parameters, UserDto.class);
			//사용자 ID 생성 생각해보기 
			//userDto.setUserID(???);
			
			User user = new User(userDto);
			Goal goal = new Goal(userDto);
			//goal 생성 여부 신경써야할듯
			
			userMapper.setUser(user);
			goalMapper.setGoal(goal);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void setUser(UserDto userDto) {
		try{
//			UserDto userDto = new ObjectMapper().readValue(parameters, UserDto.class);
			//사용자 ID 생성 생각해보기 
			//userDto.setUserID(???);
			
			User user = new User(userDto);
			Goal goal = new Goal(userDto);
			//goal 생성 여부 신경써야할듯
			
			userMapper.setUser(user);
			goalMapper.setGoal(goal);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void putUser(String parameters) {
		try{
			UserDto userDto = new ObjectMapper().readValue(parameters, UserDto.class);
			
			User user = new User(userDto);
			Goal goal = new Goal(userDto);
			//goal 생성 여부 신경써야할듯
			
			userMapper.setUser(user);
			goalMapper.setGoal(goal);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public UserDto getUser(String userId) {
		UserDto userDto = null;
		try{
			User user = userMapper.getUser(userId);
			Goal goal = goalMapper.getGoalByUserId(userId);
			
			userDto = new UserDto(user, goal);
			//프로필 사진도 같이 반환
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return userDto;
	}
	
	public void removeUser(String userId) {
		try{
			userMapper.removeUser(userId);
			goalMapper.removeGoalByUserId(userId);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
