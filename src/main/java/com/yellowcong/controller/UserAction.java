package com.yellowcong.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
	//调用用户的Add方法
	public String add(){
		return SUCCESS;
	}
}
