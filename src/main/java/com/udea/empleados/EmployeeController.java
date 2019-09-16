package com.udea.empleados;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
@RequestMapping("/empleados")
public class EmployeeController {
    
 @Autowired
 private EmployeeRepository employeeRepository;
    
   @RequestMapping("/")
	String home() {
		return "Bienvenidos a la UdeA ";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Employee> get(@PathVariable String employeeId) {
		return employeeRepository.findById(employeeId);
	}
           
     @RequestMapping(method=RequestMethod.GET,value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
     public Iterable<Employee> empleados() {
         return employeeRepository.findAll();
     }
  
}
