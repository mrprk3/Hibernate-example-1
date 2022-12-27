package com.mrprk.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mrprk.Song;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Song.class);

			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

}
