package in.sts.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//to insert data
    	TeacherName tname = new TeacherName();
    	tname.setFname("Rakesh");
    	tname.setMname("Kumar");
    	tname.setLname("Yadav");
    	
    	Teacher tobj = new Teacher();
    	tobj.setId(102);
    	tobj.setName(tname);
    	tobj.setMob(7028870790d);
    	tobj.setDepartment("IT");
    
    
    	
    	Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory factory = config.buildSessionFactory(reg);
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();	
    	session.save(tobj);
    	
    	//Teacher teacher = (Teacher)session.get(Teacher.class, 101); //fetch data from mysql
    	//System.out.println(teacher);								//print the data fetched from mysql
    	tx.commit();
    	System.out.println("successfully saved");    
        factory.close();  
        session.close(); 
       
    }
}
