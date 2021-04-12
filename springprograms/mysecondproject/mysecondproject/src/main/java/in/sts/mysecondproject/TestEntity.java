package in.sts.mysecondproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class TestEntity 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = null;
    	context = new ClassPathXmlApplicationContext("entityconfig.xml");
    	
    	Entity entity = (Entity)context.getBean("entity");
    	System.out.println(entity);
    	if(context!=null)
    	{
    		context.close();
    	}
    }
}
