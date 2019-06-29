package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.model.Employee;
import com.employee.model.Leave;
import com.employee.repository.LeaveRepository;
import com.employee.services.LeaveService;

@Component
public class LeaveServiceImpl implements LeaveService {
	@Autowired
	private LeaveRepository repository;

    
	
	public Leave putLeave(Leave leave) throws ServiceException {
		try {
			
			Leave leaveObj = repository.save(leave);
			return leaveObj;

		} catch (Exception e) {
			return null;
		}
	}

	public List<Leave> getAll() {

	
	  return repository.findAll();
		

	}

	public Optional<Leave> getid(long id) {

		return repository.findById(id);

	}
	
	//public Optional<Employee>postleaveid(employeeId) 

	public Leave update(Leave leave) {

try {
			
			Leave leaveObj = repository.save(leave);
			return leaveObj;

		} catch (Exception e) {
			return null;
		}
	}
	


	public void deleteall() {

		repository.deleteAll();

	}

}
