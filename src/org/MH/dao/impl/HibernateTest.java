package org.MH.dao.impl;

import org.MH.dao.HibernateDaoSupport;
import org.MH.entity.*;

public class HibernateTest extends HibernateDaoSupport {

	public HibernateTest() {
		super();
	}
	
	public void saveMessage(){
		News n = new News();
		System.out.println("ʵ�������ݿ�ʼ");
		n.setTitle("����title");
		n.setContent("����Content");
		System.out.println("ʵ�������ݽ���");
		super.session.save(n);
		super.transaction.commit();
		System.out.println("�������");
		super.session.close();
		super.sf.close();
		
	}

}
