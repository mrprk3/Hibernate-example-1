package com.mrprk.ap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mrprk.Song;
import com.mrprk.config.HibernateUtils;

public class DeleteApp {
	public static void main(String[] args) {
		SessionFactory buildSessionFactory = HibernateUtils.getSessionFactory();

		Session session = buildSessionFactory.openSession();

		Song song = session.get(Song.class, 1);
		session.beginTransaction();
		session.delete(song);
		session.getTransaction().commit();
	}

	/*
	 * private static SessionFactory getSessionFactory() { Configuration
	 * configuration = new Configuration(); configuration.configure();
	 * configuration.addAnnotatedClass(Song.class);
	 * 
	 * SessionFactory buildSessionFactory = configuration.buildSessionFactory();
	 * return buildSessionFactory; }
	 */

}
