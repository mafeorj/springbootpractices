package guru.springframework.springmvcrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.springmvcrest.domain.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	
}
