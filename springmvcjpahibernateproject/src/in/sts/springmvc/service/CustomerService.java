package in.sts.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sts.springmvc.entity.Customer;
import in.sts.springmvc.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	public void save(Customer customer)
	{
		repo.save(customer);
	}
	
	public List<Customer> listAll()
	{
		List<Customer> listCustomer = (List<Customer>) repo.findAll();
		
		return listCustomer;
	}
	
	public Customer get(int id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}

}
