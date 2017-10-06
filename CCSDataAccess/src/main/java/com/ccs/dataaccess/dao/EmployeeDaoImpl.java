/**
 * 
 */
package com.ccs.dataaccess.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ccs.dataaccess.domain.Employee;
import com.ccs.utils.HibernateUtils;

/**
 * @author C728472
 *
 */
public class EmployeeDaoImpl implements EmployeeDAO {
	
	private static EmployeeDAO employeeDAO;
	
	/**
	 * 
	 */
	private EmployeeDaoImpl(){	
	}
	
	/**
	 * @return
	 */
	public static EmployeeDAO getInstance(){
		if(employeeDAO==null){
			employeeDAO=new EmployeeDaoImpl();
		}
		return employeeDAO;	
	}



	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getUsers() {
		Session session = HibernateUtils.getSession();    
        Query query = session.createQuery("from Employee");
        List<Employee> employees =  query.list();
        session.close();
        return employees;
	}

	public void updateUsers() {
		// TODO Auto-generated method stub
		
	}

	public Employee getUser(int UserId) {
		return null;
		
	}

	public void addUser(Employee employee) {
	Session session=HibernateUtils.getSession();
	Transaction tx=session.beginTransaction();
	session.save(employee);
	tx.commit();		
	}

}
