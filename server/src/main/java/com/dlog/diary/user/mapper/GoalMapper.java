package com.dlog.diary.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dlog.diary.user.entity.Goal;

@Mapper
@Repository
public interface GoalMapper {
	
	public abstract List<Goal> getAllGoalList() throws Exception;
	
	public abstract Goal getGoal(String goalId) throws Exception;
	
	public abstract Goal getGoalByUserId(String userId) throws Exception;
	
	public abstract Integer setGoal(Goal goal) throws Exception;
	
	public abstract Integer removeGoal(String goalId) throws Exception;
	
	public abstract Integer removeGoalByUserId(String userId) throws Exception;
	
}
