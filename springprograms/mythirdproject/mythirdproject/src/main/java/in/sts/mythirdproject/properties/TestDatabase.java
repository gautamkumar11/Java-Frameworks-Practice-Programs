package in.sts.mythirdproject.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatabase {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("in/sts/mythirdproject/dependency/DependencyConfig.xml");
   	
        DatabaseConfiguration databaseConfiguration = (DatabaseConfiguration)context.getBean("dbconfig");
        System.out.println(databaseConfiguration);
        
        if(context!=null)
        {
       	 context.close();
        }

	}

}
