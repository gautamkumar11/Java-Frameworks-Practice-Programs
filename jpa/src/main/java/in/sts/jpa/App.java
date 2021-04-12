package in.sts.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	//Scientist sct = em.find(Scientist.class, 1);
    	
    	//System.out.println(sct);
    	
    	Scientist s1 = new Scientist();
    	s1.setId(7);
    	s1.setName("Gautam Kumar");
    	s1.setAge(22);
    	
    	Scientist s2 = new Scientist();
    	s2.setId(8);
    	s2.setName("Rakesh Kumar");
    	s2.setAge(23);
    	
    	
    	em.getTransaction().begin();
    	
    	em.persist(s1);
    	em.persist(s2);
    	
    	em.getTransaction().commit();
    	
    	emf.close();  
        em.close(); 
    }
}
