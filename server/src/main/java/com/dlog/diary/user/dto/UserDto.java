package com.dlog.diary.user.dto;

import java.sql.Date;

import com.dlog.diary.user.entity.Goal;
import com.dlog.diary.user.entity.User;
import com.dlog.diary.user.type.LoginType;
import com.dlog.diary.user.type.UserSexType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class UserDto {
	
	@ApiModelProperty(required=true, value="사용자 ID", example="0000")
	private String userId;
	
	@ApiModelProperty(required=true, value="성별", example="FEMALE")
	private UserSexType sex;
	
	@ApiModelProperty(value="키", example="160")
	private int height;
	
	@ApiModelProperty(value="몸무게", example="50")
	private int weight;
	
	@ApiModelProperty(value="생년월일", example="2020-07-01")
	private Date birth;
	
	@ApiModelProperty(value="닉네임", example="헬린이")
	private String nickname;
	
	@ApiModelProperty(required=true, value="로그인타입", example="KAKAOTALK")
	private LoginType loginType;
	
	@ApiModelProperty(required=true, value="토큰", example="?")
	private String refreshToken;
	
	@ApiModelProperty(required=true, value="식별값", example="?")
	private String uniqId;
	
	@ApiModelProperty(value="목표 몸무게", example="160")
	private int targetWeight;
	
	@ApiModelProperty(value="프로필 사진", example="url")
	private String profileImage;
	
	public UserDto() {
		
	}
	
	public UserDto(User user, Goal goal) {
		this.userId = user.getUserId();
		this.sex = user.getSex();
		this.height = user.getHeight();
		this.weight = user.getWeight();
		this.birth = user.getBirth();
		this.nickname = user.getNickname();
		this.loginType = user.getLoginType();
		this.refreshToken = user.getRefreshToken();
		this.uniqId = user.getUniqId();
		this.targetWeight = goal.getTargetWeight();
	}
	
}
