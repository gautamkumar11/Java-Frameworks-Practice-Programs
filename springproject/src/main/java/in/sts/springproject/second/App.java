package in.sts.springproject.second;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("VehicleConfig2.xml");
		
		Vehicle vehicle = (Vehicle)context.getBean("bike");
		vehicle.drive();
		
		Tyre tyre = (Tyre)context.getBean("tyre");
		System.out.println(tyre.getBrand());
		
		 if(context!=null)
         {
        	 context.close();
         }
	}

}
