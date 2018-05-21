package org.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClassAnnotation {
	 private SessionFactory sessionFactory;
     private Session session;
     private Transaction transaction;
     
     @Before
     public void before() {
         sessionFactory = new Configuration().configure().buildSessionFactory();// 创建SessionFactory对象
         session = sessionFactory.openSession();// 获取Session对象
         transaction = session.beginTransaction();// 开启事务
     }
      
     @After
     public void after() {
         transaction.commit();// 提交事务
         session.close();// 关闭Session
         sessionFactory.close();// 关闭SessionFactory
     }
     
     @Test
     public void testAnnotation() {
         System.out.println("执行成功...");
     }
     
}
