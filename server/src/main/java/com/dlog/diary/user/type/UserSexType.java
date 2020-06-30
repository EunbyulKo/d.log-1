package com.dlog.diary.user.type;

public enum UserSexType {
	MALE("남자"),
	FEMALE("여자");
	
	private final String description;

	UserSexType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
