package org.MH.action;

import com.opensymphony.xwork2.ActionSupport;

import org.MH.dao.impl.*;
import org.MH.entity.News;
import org.MH.service.BeansSupport;


public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//定义封装请求参数
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() throws Exception
	{

			return SUCCESS;

	}
}
