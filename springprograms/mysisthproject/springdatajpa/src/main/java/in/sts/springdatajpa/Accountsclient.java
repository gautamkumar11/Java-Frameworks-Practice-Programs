package in.sts.springdatajpa;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Accountsclient 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	AccountDao accountdao = context.getBean("accountsDaoBean",AccountDao.class);
    	accountdao.createAccount(123456789, "Gautam", 2000);
    	accountdao.createAccount(20, "Rishi ", 35000);  
    	 System.out.println("Accounts created");  
    }
}
