package hiberdemo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee em = new Employee();
    	EmployeeName emName = new EmployeeName();
    	
    	emName.setFname("Dona");
    	emName.setLname("Mariya");
    	
    	em.setId(007);
//    	em.setName(emName);
    	em.setCountry("India");
    	equipment eq= new equipment();
    	eq.setId(2);
    	eq.setName("bdf");
    	
    	em.setEq(eq);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(equipment.class);
    	SessionFactory factory = config.buildSessionFactory();
    	
    	Session se = factory.openSession();
    	Transaction tx = se.beginTransaction();
    	
    	se.save(em);
    	se.save(eq);
    	tx.commit();
//    	System.out.println("hello world");
    	
    	
    	
    }
}





