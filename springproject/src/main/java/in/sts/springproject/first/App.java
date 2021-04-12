package in.sts.springproject.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	 //using BeanFactory
    	 Resource r=new ClassPathResource("applicationContext.xml");  
         BeanFactory factory=new XmlBeanFactory(r);  
    	 Vehicle vehicle = (Vehicle)factory.getBean("vehicle");
         vehicle.drive();
         
    	 */
    	
    	 ClassPathXmlApplicationContext context = null;
         context = new ClassPathXmlApplicationContext("VehicleConfig1.xml");
    	
         Vehicle vehicle = (Vehicle)context.getBean("vehicle");
         vehicle.drive();
         
         if(context!=null)
         {
        	 context.close();
         }
    }
}
