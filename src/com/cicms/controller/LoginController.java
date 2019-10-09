package com.cicms.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cicms.pojo.User;
import com.cicms.service.LoginService;

@Controller
@RequestMapping(value="/")
public class LoginController {  
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login")
	public String login(User user,HttpSession session){
		User user1 = loginService.login(user);
		if(user1!=null){
			session.setAttribute("user", user1);
			if(user1.getJurisdiction()==1){
				//医生
				return "redirect:Dindex.jsp";
			}else if(user1.getJurisdiction()==2){
				//药师
				return "redirect:Mindex.jsp";
			}else{
				//管理员
				return "redirect:index.jsp";
			}
		}else{
			return "login.jsp";
		}
	}
}
