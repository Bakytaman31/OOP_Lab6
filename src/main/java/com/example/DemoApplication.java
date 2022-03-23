package com.example;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.utils.HibernateUtil;
import org.hibernate.Session;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.close();
//		HibernateUtil.shutdown();
		SpringApplication.run(DemoApplication.class, args);
	}

}
