package guru.springframework.springmvcrest.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;




@Component
public class BootStrapData implements CommandLineRunner{

	private final CustomerRepository customerRespository;
	
	
	public BootStrapData(CustomerRepository customerRespository) {
		this.customerRespository = customerRespository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Loading Customer Data");
		
		Customer c1 = new Customer();
		c1.setFirstname("Michale");
		c1.setLastname("Weston");
		customerRespository.save(c1);
		
		Customer c2 = new Customer();
		c2.setFirstname("sam");
		c2.setLastname("axe");
		customerRespository.save(c2);
		
		Customer c3 = new Customer();
		c3.setFirstname("Fiona");
		c3.setLastname("Glennan");
		customerRespository.save(c3);
		
		System.out.println("Customer Saved: "+ customerRespository.count());
		
		
	}


	

}
