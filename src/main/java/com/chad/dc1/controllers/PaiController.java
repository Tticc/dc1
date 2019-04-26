package com.chad.dc1.controllers;


import java.net.InetAddress;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;


@Controller
public class PaiController {


	

	/*
	@RequestMapping("/")
	public @ResponseBody RestResult indexHM(HttpSession session){
		System.out.println("1111");

		//return "index";
		return new RestResult();
	}
	*/
	@RequestMapping("/")
	public @ResponseBody JSONObject indexHM(HttpSession session){
		System.out.println("1111");
		JSONObject temp = new JSONObject();
		
		InetAddress ia=null;
		try {
			ia=ia.getLocalHost();
			String localname=ia.getHostName();
			String localip=ia.getHostAddress();
			temp.put("server name",localname);
			temp.put("server ip",localip);
			System.out.println("本机名称是："+ localname);
			System.out.println("本机的ip是 ："+localip);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		//return "index";
		return temp;
	}
	
	//@RequestMapping("/error")
	public String error(){
		System.out.println("1111");

		return "error";
	}
	
	
	//@ResponseBody默认值为
	@RequestMapping("/pai")
	public String index(HttpSession session, Model model){
		model.addAttribute("who", "Chad");
		//List<User> li = us.getAllUser();
		return "greet/hello";
	}
    @RequestMapping("/otf")
	public String orderToFace(HttpSession session){
		return "order/index";
	}
	
	@RequestMapping("/lu")
	public String listUser(HttpSession session, Model model) {
		return "user/userlist";
	}
}

class RestResult{
	String id = "ooo";
	String name = "res";
}
