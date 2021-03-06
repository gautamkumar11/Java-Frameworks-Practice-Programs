package in.sts.springdatajpaproject;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	List<Customer> findByLastName(String lastName);
}
