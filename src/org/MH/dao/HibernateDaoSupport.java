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
		
		//ʵ����Configuration
		this.conf = new Configuration().configure(); 
		this.serviceRegistry = new ServiceRegistryBuilder()
		.applySettings(conf.getProperties()).build();
		//��Configuration����SessionFactory
		sf = conf.buildSessionFactory(this.serviceRegistry);
		//����session
		this.session = sf.openSession();
		//��ʼ����
		this.transaction = this.session.beginTransaction();
		
	}
}
