package in.sts.demospringmvcgradle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sts.demospringmvcgradle.entity.Product;
import in.sts.demospringmvcgradle.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> listAll()
	{
		return productRepo.findAll();
	}
	
	public void save(Product product) {
		productRepo.save(product);
	}
	
	public Product get(int id)
	{
		return productRepo.findById(id).get();
	}
	
	public void delete(int id)
	{
		productRepo.deleteById(id);
	}
	
}
