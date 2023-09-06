package com.jsp.mvc.RowMapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.mvc.Model.UserInformation;

public class UserInformationRowMappingImp implements RowMapper<UserInformation>
{

	public UserInformation mapRow(ResultSet rs, int rowNum) throws SQLException {
	 UserInformation userinformation=new UserInformation();
	 userinformation.setUserId(rs.getInt(1));
	 userinformation.setUserName(rs.getString(2));
	 userinformation.setUserMobileNo(rs.getString(3));
	 userinformation.setUserEmailId(rs.getString(4));
	 userinformation.setUserPassword(rs.getString(5));
	 userinformation.setUserGender(rs.getString(6));
	 userinformation.setUserCourse(rs.getString(7));
		return userinformation;
	}

}
