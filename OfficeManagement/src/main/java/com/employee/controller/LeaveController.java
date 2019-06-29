package com.employee.controller;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exception.ServiceException;
import com.employee.model.Employee;
import com.employee.model.Leave;
import com.employee.service.impl.LeaveServiceImpl;


@RestController
@RequestMapping("leave")
public class LeaveController {
	
	@Autowired
	private LeaveServiceImpl service;
 
	
	  @PostMapping("employee/{id}/leave")
	    public Leave putLeave(@PathVariable Employee employee, @RequestBody Leave put)  {	
			return service.putLeave(put);
		}
	
	  @GetMapping("employee/{id}/leave")
		public Optional<Leave> getById(@PathVariable long id) {
			return service.getid(id);
		}
	  

	  
	  
	  
//	@GetMapping("employee/{id}/leave")
//	public Leave putLeave(@RequestBody Leave put) throws ServiceException {	
//		return service.putLeave(put);
//	}

//	@GetMapping("all")
//	public List<Leave> getAll() {
//		return service.getAll();
//	}

//	@PutMapping("{id}")
//	public Leave update(@PathVariable long id, @RequestBody Leave update) {
//		return service.update(update);
//	}
//
//	@DeleteMapping
//	public void delete() {
//		service.deleteall();
//	}

}
