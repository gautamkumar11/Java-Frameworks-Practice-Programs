package in.sts.HibMapRel;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop lap = new Laptop();
    	lap.setLid(115);
    	lap.setLname("HP");
    	
    	Student stud = new Student();
    	stud.setRollno(10);
    	stud.setName("Anshu");
    	stud.setMarks(90);
    	
    
    	   
    	stud.getLaptop().add(lap);
    	lap.getStudent().add(stud);
    	System.out.println(stud);

    	
    	/*
    	StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	
    	Metadata metadata = new MetadataSources(reg).getMetadataBuilder().build();
    	
    	SessionFactory factory = metadata.getSessionFactoryBuilder().build(); 
    	Session session = factory.openSession();
    	*/
    	
    	
    	Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	

    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(stud);
    	session.save(lap);
    	session.getTransaction().commit();
    	System.out.println("successfully saved");    
    	sessionFactory.close();  
    	session.close(); 
    	
    }
}
