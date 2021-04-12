package in.sts.myfirstproject.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("setconfig.xml");
		
		Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer);
		if(context!=null)
		{
			context.close();
		}
	}	
}
