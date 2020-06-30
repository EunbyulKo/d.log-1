package com.dlog.diary.user.entity;

import java.sql.Date;
import java.util.Calendar;

import org.apache.ibatis.type.Alias;

import com.dlog.diary.user.dto.UserDto;
import com.dlog.diary.user.type.GoalStateType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Alias("goal")
@Data
@ApiModel
public class Goal {
	
	@ApiModelProperty(required=true, value="목표 ID", example="00000")
	private String goalId;
	
	@ApiModelProperty(required=true, value="사용자 ID", example="0000")
	private String userId;
	
	@ApiModelProperty(required=true, value="제목", example="5kg 감량")
	private String title;
	
	@ApiModelProperty(required=true, value="목표 몸무게", example="50")
	private int targetWeight;
	
	@ApiModelProperty(required=true, value="상태", example="TO_DO")
	private GoalStateType state;
	
	@ApiModelProperty(required=true, value="시작일", example="2020-07-01")
	private Date startDt;
	
	@ApiModelProperty(required=true, value="종료일", example="2020-07-09")
	private Date endDt;
	
	public Goal() {
		
	}
	
	public Goal(UserDto userDto) {
		Calendar cal = Calendar.getInstance();
	    
		//삭제
		this.goalId = "00000";
		
		this.userId = userDto.getUserId();
		this.title = "목표몸무게";
		this.targetWeight = userDto.getTargetWeight();
		this.state = GoalStateType.PAUSED;
		this.startDt = new java.sql.Date(cal.getTimeInMillis());
		this.endDt = new java.sql.Date(cal.getTimeInMillis());
	}
	
}
