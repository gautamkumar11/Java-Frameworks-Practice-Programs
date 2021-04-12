package in.sts.springdatajpaproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("customerService")
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	public void test() {
		
		Customer newCustomer = new Customer();
		newCustomer.setFirstName("Gautam");
		newCustomer.setLastName("verma");
		
		repository.save(newCustomer);
		// Find a customer by ID
		Optional<Customer> result= repository.findById(4);
		System.out.println(result);
		
		// Find customers by last name
		List<Customer> customers = repository.findByLastName("kumar");
		for (Customer customer : customers) 
		{ 
			System.out.println(customer);
		}
		
		 // List all customers
		Iterable<Customer> iterator = repository.findAll();
		for (Customer customer : iterator) 
		{ 
			System.out.println(customer);
		}
		
		// Count number of customer
		long count = repository.count();
		System.out.println("Total number Of Customer = "+count);
	}
}
