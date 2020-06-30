package com.dlog.diary.user.entity;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import com.dlog.diary.user.dto.UserDto;
import com.dlog.diary.user.type.LoginType;
import com.dlog.diary.user.type.UserSexType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Alias("user")
@Data
@ApiModel
public class User {
	
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
	
	public User() {
		
	}
	
	public User(UserDto userDto) {
		this.userId = userDto.getUserId();
		this.sex = userDto.getSex();
		this.height = userDto.getHeight();
		this.weight = userDto.getWeight();
		this.birth = userDto.getBirth();
		this.nickname = userDto.getNickname();
		this.loginType = userDto.getLoginType();
		this.refreshToken = userDto.getRefreshToken();
		this.uniqId = userDto.getUniqId();
	}
	
}
