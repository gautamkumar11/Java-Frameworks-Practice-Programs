package in.sts.myfifthproject.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = null;
    	context = new AnnotationConfigApplicationContext(AppConfig.class);
    	 
    	Alien a1 = context.getBean(Alien.class);
    	System.out.println("calling show........");
    	a1.show();
    	
    	AfterReturnExample ar = context.getBean(AfterReturnExample.class);
    	System.out.println("calling m........");
    	ar.m();
    	
    	AfterThrowingExample at = context.getBean(AfterThrowingExample.class);
    	System.out.println("calling validate........");
    	try {
    		at.validate(19);        	
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	 System.out.println("calling validate again..."); 
    	try {
    		at.validate(11);        	
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	
    	if(context!=null)
    	{
    		context.close();
    	}
    }
}
