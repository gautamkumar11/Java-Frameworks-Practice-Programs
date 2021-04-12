package in.sts.myfourthproject.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = null;
    	context = new ClassPathXmlApplicationContext("in/sts/myfourthproject/autowiring/autowiringconfig.xml");
    	
    	Student student = (Student)context.getBean("student");
    	System.out.println(student);
    	if(context!=null)
    	{
    		context.close();
    	}
    }
}
