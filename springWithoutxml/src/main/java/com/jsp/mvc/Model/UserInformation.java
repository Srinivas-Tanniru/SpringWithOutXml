package com.jsp.mvc.Model;

import org.springframework.beans.factory.annotation.Autowired;

public class UserInformation 
{
	private int userId;
	private String userName;
	private String userMobileNo;
	private String userEmailId;
	private String userPassword;
	private String userGender;
	private String userCourse;
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserCourse() {
		return userCourse;
	}
	public void setUserCourse(String userCourse) {
		this.userCourse = userCourse;
	}
	@Override
	public String toString() {
		return "UserInformation [userId=" + userId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
				+ ", userEmailId=" + userEmailId + ", userPassword=" + userPassword + ", userGender=" + userGender
				+ ", userCourse=" + userCourse + "]";
	}
	
	
}
