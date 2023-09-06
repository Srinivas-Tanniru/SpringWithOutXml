package com.jsp.mvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.jsp.mvc.Model.UserInformation;
import com.jsp.mvc.RowMapping.UserInformationRowMappingImp;
@Component
public class UserInformationDaoImp implements UserInformationDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int  registration(UserInformation userInformation) 
	{
		String insert="insert into userloginform (userId, userName, userMobileNo, userEmailId, userPassword, userGender, userCourse)values(?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(insert,userInformation.getUserId(),userInformation.getUserName(),userInformation.getUserMobileNo(),userInformation.getUserEmailId(),
				userInformation.getUserPassword(),userInformation.getUserGender(),userInformation.getUserCourse());
			
					return result;
		
	}

	public UserInformation login( UserInformation userInformation) 
	{
		String select="select * from userloginform where userEmailId=? and userPassword=?";
		try {
			
		UserInformation object = jdbcTemplate.queryForObject(select, new UserInformationRowMappingImp(),userInformation.getUserEmailId(),userInformation.getUserPassword());
		return object;
		
		}
		catch (Exception e) 
		{

		    return null;
		}
		
		
	}

	public void updatePassword()
	{
		// String update="update userloginform set user"
		
	}

}
