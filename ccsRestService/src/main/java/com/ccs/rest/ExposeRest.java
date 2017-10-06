/**
 * 
 */
package com.ccs.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ccs.dataaccess.dao.EmployeeDaoImpl;
import com.ccs.dataaccess.domain.Employee;

/**
 * @author C728472
 *
 */
@Path("/EmployeeDetails")
public class ExposeRest {
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Employee> getAllUserDetails(){
		List<Employee> employees = EmployeeDaoImpl.getInstance().getUsers();
	   return employees;
	}

}
