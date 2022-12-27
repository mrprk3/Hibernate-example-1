package com.mrprk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * Configuration , SessionFactory, Session this 3 things need to remember
 * session we will be getting from a SessionFactory and SessionFactory is like data-source 
 * To create data-source inside hibernate u need Session-Factory and session factory we are getting from Configuration
 *
 */
public class App {
	public static void main(String[] args) {

//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Song.class);
//
//		// create session factory
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//
//		// initialize
//		Session session = sessionFactory.openSession();
//
//		Song song1 = new Song();
//		song1.setId(2);
//		song1.setSongName("Dil toh pagal hai");
//		song1.setArtist("Udit Narayan");
//		session.beginTransaction();
//		session.save(song1);
//		session.getTransaction().commit();
//		System.out.println("hey your song has been saved... please check database");
	}
}
