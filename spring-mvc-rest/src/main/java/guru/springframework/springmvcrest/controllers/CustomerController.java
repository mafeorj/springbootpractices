package guru.springframework.springmvcrest.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import guru.springframework.springmvcrest.domain.*;

import guru.springframework.springmvcrest.Services.CustomerService;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {
	
	public static final String BASE_URL = "/api/v1/customers";
	
	private final CustomerService customerService;
	
	public CustomerController (CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping 
	List<Customer> getAllCustomers(){
		return customerService.findAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		System.out.println(id + "id in controller");
		return customerService.findCustomerById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer saveCustomer (@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
		
	}

}
