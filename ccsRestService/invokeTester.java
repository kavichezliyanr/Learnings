/**
 * 
 */
package com.ccs.utils;

import java.util.Date;

import org.hibernate.Session;

import com.ccs.dataaccess.domain.Employee;

/**
 * @author C728472
 *
 */
public class invokeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

				System.out.println("Maven + Hibernate + Oracle");
				Session session = HibernateUtils.getSession();

				session.beginTransaction();
				Employee user = new Employee();

				user.setUserId(100);
				user.setUserName("superman");
				user.setCreatedBy("system");
				user.setCreateDate(new Date());
				user.setAdmin(true);
				user.setEmail("email@gmail.com");
				user.setPhoneNo("9790234691");
				user.setPassword("password");
				session.save(user);
				session.getTransaction().commit();
			}
	}
