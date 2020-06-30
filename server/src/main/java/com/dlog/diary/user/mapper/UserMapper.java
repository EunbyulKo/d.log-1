package com.dlog.diary.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dlog.diary.user.entity.User;

@Mapper
@Repository
public interface UserMapper {
	
	public abstract User getUser(String userId) throws Exception;
	
	public abstract Integer setUser(User user) throws Exception;
	
	public abstract Integer removeUser(String userId) throws Exception;
	
}
