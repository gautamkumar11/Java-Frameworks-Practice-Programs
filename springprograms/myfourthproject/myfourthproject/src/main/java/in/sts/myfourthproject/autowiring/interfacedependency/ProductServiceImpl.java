package in.sts.myfourthproject.autowiring.interfacedependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productServiceImpl")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private Product product;
	
	public void displayProducts() {
		
		int totalProducts = product.getProduct();
		System.out.println("Products per page : "+totalProducts/5);
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
