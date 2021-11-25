package com.ssafy.happyhouse.model.dto;

// 관심지역 (동)
public class InterestedApt {
	// 회원 ID
	private String id;
	
	// 관심지역 아파트 코드
	private String aptCode;
	
	// 관심지역 아파트 이름 / 별칭
	private String aptName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAptCode() {
		return aptCode;
	}

	public void setAptCode(String aptCode) {
		this.aptCode = aptCode;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	@Override
	public String toString() {
		return "InterestedApt [id=" + id + ", aptCode=" + aptCode + ", aptName=" + aptName + "]";
	}

	

	
}