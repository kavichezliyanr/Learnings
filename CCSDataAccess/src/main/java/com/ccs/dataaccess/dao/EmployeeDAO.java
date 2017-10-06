/**
 * 
 */
package com.ccs.dataaccess.dao;

import java.util.List;

import com.ccs.dataaccess.domain.Employee;

/**
 * @author C728472
 *
 */
public interface EmployeeDAO {
	
	public void addUser(Employee employee);
	
	public void deleteUser();
	
	public List<Employee> getUsers();
	
	public Employee getUser(int UserId);
	
	public void updateUsers();

}
