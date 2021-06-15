package in.sts.tableperhierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import in.sts.tableperconcrete.Contract_Employee_tpc;
import in.sts.tableperconcrete.Employee_tpc;
import in.sts.tableperconcrete.Regular_Employee_tpc;

public class StoreTest {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    	
		configuration.addAnnotatedClass(Employee_tph.class)
    				.addAnnotatedClass(Regular_Employee_tph.class)
    				.addAnnotatedClass(Contract_Employee_tph.class);
    	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	

    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	 
        Session session = sessionFactory.openSession();  
          
         Transaction t = session.beginTransaction();    
            
            Employee_tph e1=new Employee_tph();    
            e1.setName("Gaurav Chawla");    
          //  e1.setId(1);  
            
            Regular_Employee_tph e2=new Regular_Employee_tph();    
            e2.setName("Vivek Kumar");    
            e2.setSalary(50000);    
            e2.setBonus(5); 
           // e2.setId(2);
                
            Contract_Employee_tph e3=new Contract_Employee_tph();    
            e3.setName("Arjun Kumar");    
            e3.setPay_per_hour(1000);    
            e3.setContract_duration("15 hours");    
          //  e3.setId(3);  
            
            session.persist(e1);    
            session.persist(e2);    
            session.persist(e3);    
                
            t.commit();    
            session.close();    
            System.out.println("success");        

	}

}
