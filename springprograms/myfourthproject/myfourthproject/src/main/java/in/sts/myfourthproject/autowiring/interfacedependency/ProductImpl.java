package in.sts.myfourthproject.autowiring.interfacedependency;

import org.springframework.stereotype.Component;

@Component
public class ProductImpl implements Product {

	public int getProduct() {
		System.out.println("Retreving all products from database");
		return 50;
	}

}
