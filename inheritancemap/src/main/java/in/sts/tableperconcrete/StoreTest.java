package in.sts.tableperconcrete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class StoreTest {

	public static void main(String[] args) {
Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Employee_tpc.class).addAnnotatedClass(Regular_Employee_tpc.class).addAnnotatedClass(Contract_Employee_tpc.class);
    	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	

    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	 
        Session session = sessionFactory.openSession();  
          
        Transaction t = session.beginTransaction();    
            
            Employee_tpc e1=new Employee_tpc();    
            e1.setName("Gautam Kumar");    
           // e1.setId(4);  
            
            Regular_Employee_tpc e2=new Regular_Employee_tpc();    
            e2.setName("Rahul Kumar");    
            e2.setSalary(50000);    
            e2.setBonus(5); 
          //  e2.setId(5);
                
            Contract_Employee_tpc e3=new Contract_Employee_tpc();    
            e3.setName("Rakesh Kumar");    
            e3.setPay_per_hour(1000);    
            e3.setContract_duration("15 hours");    
         //   e3.setId(6);  
            
            session.persist(e1);    
            session.persist(e2);    
            session.persist(e3);    
                
            t.commit();    
            session.close();    
            System.out.println("success");        

	}

}
