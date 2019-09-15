package guru.springframework.springmvcrest.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;



@Service
public class CustomerServiceImpl implements CustomerService{
	
	private final CustomerRepository customerRespository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRespository = customerRepository;
	}

	@Override
	public Customer findCustomerById(Long id) {
		System.out.println("id  :" + id);
		return customerRespository.findById(id).get();
	}

	@Override
	public List<Customer> findAllCustomers() {
		return customerRespository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRespository.save(customer);
	}

}
