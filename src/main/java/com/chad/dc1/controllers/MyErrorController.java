package com.chad.dc1.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/error")
public class MyErrorController implements ErrorController{

	@Override
	public String getErrorPath() {
		return "error";
	}
	@RequestMapping
	public @ResponseBody String error() {
		return getErrorPath();
	}
}
