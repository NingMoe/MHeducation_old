package org.MH.dao.impl;

import org.MH.dao.HibernateDaoSupport;
import org.MH.entity.*;

public class HibernateTest extends HibernateDaoSupport {

	public HibernateTest() {
		super();
	}
	
	public void saveMessage(){
		News n = new News();
		System.out.println("实例化数据开始");
		n.setTitle("我是title");
		n.setContent("我是Content");
		System.out.println("实例化数据结束");
		super.session.save(n);
		super.transaction.commit();
		System.out.println("保存结束");
		super.session.close();
		super.sf.close();
		
	}

}
