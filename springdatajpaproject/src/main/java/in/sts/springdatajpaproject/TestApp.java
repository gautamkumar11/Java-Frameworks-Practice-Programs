package in.sts.springdatajpaproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
    	appContext.scan("in.sts.springdatajpaproject");
    	appContext.refresh();
    	
    	CustomerService customerService = (CustomerService) appContext.getBean("customerService");
    	customerService.test();
    	
    	appContext.close();
    }
}
