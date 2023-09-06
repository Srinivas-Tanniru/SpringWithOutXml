package com.jsp.mvc.Dao;

import org.springframework.stereotype.Component;

import com.jsp.mvc.Model.UserInformation;

public interface UserInformationDao 
{
		public int  registration(UserInformation userInformation);
		public UserInformation login(UserInformation userInformation);
		public void updatePassword();
		
}
