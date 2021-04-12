package in.sts.myfirstproject.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("mapconfig.xml");
		
		Country country = (Country)context.getBean("country");
		System.out.println(country);
		if(context!=null)
		{
			context.close();
		}
	}

}
