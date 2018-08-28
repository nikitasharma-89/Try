package Package;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
	
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession(); 
/*------------------------------------------------------------------------------------------------------------------------------------------------------ 
																					insert/save		*/
		 Vendor v =new Vendor();
		 
         v.setVendorId(800);
         v.setVendorName("oriflame swedan");

Customer c1=new Customer();

          c1.setCustomerId(1200);
          c1.setCustomerName("ryan");

Customer c2=new Customer();

          c2.setCustomerId(000);
          c2.setCustomerName("jessica");           

     Customer c3=new Customer();

          c3.setCustomerId(0100);
          c3.setCustomerName("timber");

// one-to-many
          	Set s=new HashSet();

		     s.add(c1);
		     s.add(c2);
		     s.add(c3);         

		     v.setCustomerchildren(s);
             c1.setParentObject(v);
			  c2.setParentObject(v);
			  c3.setParentObject(v);
			  
			
			  
			
			 session.save(c1); //---one to many
			  //session.save(v);---------Many to One 
		 
/*---------------------------------------------------------------------------------------------------------------------------------------------------------
		 																			delete - many to one 
		 
		 Customer c=(Customer)session.get(Customer.class, 1000);
		 session.delete(c);
---------------------------------------------------------------------		delete - one to many --------------------------------------------
		
		/* Vendor v=(Vendor)session.get(Vendor.class, 100);
		 session.delete(v);*/
		 

		 
		 		
		 	Transaction tx = session.beginTransaction();
			 tx.commit();

			 session.close();
			 System.out.println("One To Many Bi-Directional is Done..!!");
			 factory.close();

	}

}
