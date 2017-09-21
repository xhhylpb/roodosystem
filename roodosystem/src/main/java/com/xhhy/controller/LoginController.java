package com.xhhy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xhhy.bean.UserBean;
import com.xhhy.service.UserService;
import com.xhhy.util.State;

@Controller
@SessionAttributes({"ub"})
public class LoginController {

	@Autowired
	private UserService us;
	
	@RequestMapping("/login")
	public String login(String loginName,String password,Model m){
		UserBean ub = us.login(loginName, password);
		if(ub != null){
			if(ub.getDel() == State.DELETE){
				m.addAttribute("msg","您的账号已禁用!");
				return "/login.jsp";
			}else{
				m.addAttribute("ub", ub);
				return "/index.jsp";
			}
		}else{
			System.out.println("nihao"+"hello");
			m.addAttribute("msg", "账号或密码错误");
			return "/login.jsp";
		}
	}
}
