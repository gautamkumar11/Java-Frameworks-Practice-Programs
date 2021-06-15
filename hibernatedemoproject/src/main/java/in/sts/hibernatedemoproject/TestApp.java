package in.sts.hibernatedemoproject;


import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import in.sts.hibernatedemoproject.entities.Employee;

public class TestApp 
{
    public static void main( String[] args )
    {
    	Employee employee = new Employee();
    	employee.setId(5);
    	employee.setName("Rakesh");
    	employee.setAddress("Nagpur");
    	
    	Properties properties = new Properties();
    	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
    	properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
    	properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/mydb");
    	properties.put("hibernate.connection.username", "root");
    	properties.put("hibernate.connection.password", "root");
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hbm2ddl.auto", "update");
    	
    	
    	Configuration config = new Configuration();
    	config.setProperties(properties);
    	config.addAnnotatedClass(Employee.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	
    	SessionFactory factory =  config.buildSessionFactory(reg);
    	Session session = factory.openSession();
    	session.beginTransaction();
    	
    	
    	session.save(employee);
    	
    	
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
