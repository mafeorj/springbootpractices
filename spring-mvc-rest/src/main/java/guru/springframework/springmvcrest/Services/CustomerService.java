package guru.springframework.springmvcrest.Services;

import java.util.List;

import guru.springframework.springmvcrest.domain.Customer;



public interface CustomerService {
	
	Customer findCustomerById(Long id);
	
	List<Customer> findAllCustomers();
	
	Customer saveCustomer(Customer customer);

}
