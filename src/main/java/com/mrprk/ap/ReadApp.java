package com.mrprk.ap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mrprk.Song;
import com.mrprk.config.HibernateUtils;

public class ReadApp {

	public static void main(String[] args) {

		/*
		 * Configuration configuration = new Configuration(); configuration.configure();
		 * configuration.addAnnotatedClass(Song.class);
		 */

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		// get or load use to retrieve data from db
		session.beginTransaction();
		Song song = session.get(Song.class, 1);
		Song song1 = session.load(Song.class, 2);
		session.getTransaction().commit();

		System.out.println(song);
		System.out.println(song1);

	}

}
