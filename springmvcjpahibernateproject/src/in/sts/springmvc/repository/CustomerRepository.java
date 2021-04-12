package in.sts.springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import in.sts.springmvc.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	

}
