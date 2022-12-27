package com.mrprk.ap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mrprk.Song;
import com.mrprk.config.HibernateUtils;

public class UpdateApp {

	public static void main(String[] args) {
		/*
		 * Configuration configuration = new Configuration(); configuration.configure();
		 * configuration.addAnnotatedClass(Song.class);
		 */

		SessionFactory buildSessionFactory = HibernateUtils.getSessionFactory();

		Session session = buildSessionFactory.openSession();

		Song song = session.get(Song.class, 1);
		song.setSongName("Hare Krishna");

		session.beginTransaction();
		session.update(song);
		session.getTransaction().commit();

	}

}
