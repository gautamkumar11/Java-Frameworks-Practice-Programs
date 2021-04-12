package in.sts.myfourthproject.autowiring.interfacedependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("in/sts/myfourthproject/autowiring/interfacedependency/productConfig.xml");
		
		ProductServiceImpl productServiceImpl = (ProductServiceImpl) context.getBean("productServiceImpl");
		productServiceImpl.displayProducts();

		if(context!=null) {
			context.close();
		}
	}

}
