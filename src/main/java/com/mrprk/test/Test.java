package com.mrprk.test;

import org.hibernate.SessionFactory;

import com.mrprk.config.HibernateUtils;

public class Test {

	public static void main(String[] args) {

		/*
		 * here two different session-factory created [we have to create one session
		 * factory because it is heavy weight
		 */

		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();
		System.out.println(sessionFactory1 + "  " + sessionFactory2);

	}

}
