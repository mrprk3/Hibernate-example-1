package com.mrprk.ap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mrprk.Song;
import com.mrprk.config.HibernateUtils;

public class CreateApp {

	public static void main(String[] args) {
		// load the config file
		/*
		 * Configuration configuration = new Configuration();
		 * configuration.configure("hibernate.cfg.xml");
		 * configuration.addAnnotatedClass(Song.class);
		 * 
		 * // create session factory SessionFactory buildSessionFactory =
		 * configuration.buildSessionFactory();
		 */
		// initialization or open session
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Song song = new Song();
		song.setId(3);
		song.setArtist("Atim");
		song.setSongName("Never give up");

		session.beginTransaction();
		session.save(song);
		session.getTransaction().commit();
		System.out.println("new song has been added...");
	}

}
