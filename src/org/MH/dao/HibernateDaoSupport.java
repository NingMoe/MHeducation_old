package org.MH.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateDaoSupport {

	protected Configuration conf; 
	protected ServiceRegistry serviceRegistry;
	protected SessionFactory sf;
	protected Session session;
	protected Transaction transaction;
	protected HibernateDaoSupport(){
		
		//实例化Configuration
		this.conf = new Configuration().configure(); 
		this.serviceRegistry = new ServiceRegistryBuilder()
		.applySettings(conf.getProperties()).build();
		//以Configuration创建SessionFactory
		sf = conf.buildSessionFactory(this.serviceRegistry);
		//创建session
		this.session = sf.openSession();
		//开始事务
		this.transaction = this.session.beginTransaction();
		
	}
}
