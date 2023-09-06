package com.jsp.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.mvc.Dao.UserInformationDao;
import com.jsp.mvc.Model.UserInformation;

@Controller
public class TestController 
{

	
	@Autowired
	private UserInformationDao userInformationDao;
	@RequestMapping("/hello")
	//@ResponseBody
	public String  hello()
	{
		return "LoginInformation";
	}
	
	@RequestMapping("/user")
	public String input(@RequestParam int userId,String userName,String userMobileNo,String userEmailId,
			String userPassword,String userGender,String userCourse,Model model)
	{
		System.out.println("user Id: "+userId);
		System.out.println("user Name: "+userName);
		System.out.println("user MobileNo: "+userMobileNo);
		System.out.println("user EmailId: "+userEmailId);
		System.out.println("user password: "+userPassword);
		System.out.println("user Gender: "+userGender);
		System.out.println("user course: "+userCourse);
		model.addAttribute("id",userId);
		model.addAttribute("name",userName);
		model.addAttribute("mobile",userMobileNo);
		model.addAttribute("email",userEmailId);
		model.addAttribute("password",userPassword);
		model.addAttribute("gender",userGender);
		model.addAttribute("course",userCourse);
		
		 return "ShowDetails";
	
	}
		@RequestMapping("/inObject")
		public String storeTheValuesInObject(UserInformation userInformation,Model model)
		{
			System.out.println("user Id: "+userInformation.getUserId());
			System.out.println("user Name: "+userInformation.getUserName());
			System.out.println("user MobileNo: "+userInformation.getUserMobileNo());
			System.out.println("user EmailId: "+userInformation.getUserEmailId());
			System.out.println("user Password: "+userInformation.getUserPassword());
			System.out.println("user Gender: "+userInformation.getUserGender());
			System.out.println("user Course: "+userInformation.getUserCourse());
		
		
		
		int result=userInformationDao.registration(userInformation);
		if(result!=0)
		{
			model.addAttribute("msg","Data Inserted");
		}
		else
		{
			model.addAttribute("msg", "Data Inserted");
			
		}
		return "Details";
		
		}	





		@RequestMapping("/login1")
		public void callLogin(UserInformation userInformation)
		{
			UserInformation login = userInformationDao.login(userInformation);
			if( login!=null)
			{
				System.out.println("login successfully....!!");
			}
			else
			{
				System.out.println("Invalid Details"+" ");
			}
		
		}
}
		
		
		
		

		
