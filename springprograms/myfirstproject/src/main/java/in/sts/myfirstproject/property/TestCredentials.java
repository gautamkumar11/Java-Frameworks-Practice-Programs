package in.sts.myfirstproject.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCredentials {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("propertyconfig.xml");
		
		Credentials  credentials  = (Credentials)context.getBean("credentials");
		System.out.println(credentials);
		if(context!=null)
		{
			context.close();
		}
	}

}
