package in.sts.hibfetch;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
       Student stdnt = null;
       Laptop laptop = null;
       Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       
       ServiceRegistry serviceregistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
       
       SessionFactory sessionfactory = config.buildSessionFactory(serviceregistry);
       
       //session1 starts here
       Session session1 =  sessionfactory.openSession();
       
       session1.beginTransaction();
       
       System.out.println("====session1 starts FetchType.EAGER and First Level Cache here=========");
       stdnt = (Student)session1.get(Student.class, 1);
       
       System.out.println(stdnt);
       
       stdnt = (Student)session1.get(Student.class, 1);
       
       System.out.println(stdnt);
       
       System.out.println("=======session1 ends here======");
       session1.getTransaction().commit();
       session1.close();   
       
       //session2 starts here SecondLevelCache
       Session session2 =  sessionfactory.openSession();
       session2.beginTransaction();
       System.out.println("===========session2 starts SecondLevelCache here==========");
       
       laptop= (Laptop)session2.get(Laptop.class, 1);
       
       System.out.println(laptop);
       
       
       System.out.println("==========session2 ends here===========");
       session2.getTransaction().commit();
       session2.close();   
       
       
     //session3 starts here SecondLevelCache
       Session session3 =  sessionfactory.openSession();
       session3.beginTransaction();
       System.out.println("===========session3 starts SecondLevelCache here==========");
       
       laptop= (Laptop)session3.get(Laptop.class, 1);
       
       System.out.println(laptop);
       
      
       
       System.out.println("==========session3 ends here===========");
       session3.getTransaction().commit();
       session3.close(); 
       
       //----=========== starts of SecondLevelCache using sqlquery here==========-------
       //session4 starts
       Session session4 =  sessionfactory.openSession();
       session4.beginTransaction();
      
       System.out.println("===========session4 starts SecondLevelCache using SQLQuery here==========");
       Query q1 = session4.createQuery("from Laptop where lid = 2");
       q1.setCacheable(true);
       laptop = (Laptop)q1.uniqueResult();
       System.out.println(laptop);
       
       session4.getTransaction().commit();
       session4.close(); 
       System.out.println("===========session4 ends SecondLevelCache using sqlquery here==========");
       
       //session5 starts
       Session session5 =  sessionfactory.openSession();
       session5.beginTransaction();
      
       System.out.println("===========session5 starts SecondLevelCache using SQLQuery here==========");
       Query q2 = session5.createQuery("from Laptop where lid = 2");
      
       laptop = (Laptop)q2.uniqueResult();
       System.out.println(laptop);
       q2.setCacheable(true);
       session5.getTransaction().commit();
       session5.close(); 
       System.out.println("===========session5 ends SecondLevelCache using sqlquery here==========");
       
       //----=========== ends of SecondLevelCache using sqlquery here==========-------
    }
}
