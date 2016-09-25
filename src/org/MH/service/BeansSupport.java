package org.MH.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansSupport {

	private ApplicationContext ctx;
	
	public BeansSupport(){
		this.ctx = new ClassPathXmlApplicationContext("beans.xml");
	}

	public ApplicationContext getCtx() {
		return ctx;
	}
	
}
