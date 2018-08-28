package Package;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession(); 
		 
		  /* 	-----------------------------------------------update - one to many
			
		 	Vendor v=(Vendor)session.get(Vendor.class, 400);
			 	v.setVendorName("maria ");
			 	Set s=v.getCustomerchildren();
			 	Iterator it=s.iterator();
			 	
			 	while(it.hasNext())
			 	{
			 			Customer c=(Customer) it.next();
			 		
			 			c.setCustomerName("sansa");
			 			
			 		Customer c1=(Customer)it.next();
			 			c1.setCustomerId(3000);
			 			c1.setCustomerName("ginni");
			 			
			 			Customer c3=(Customer)it.next();
			 			c3.setCustomerId(4000);
			 			c3.setCustomerName("mandeep");
			 			session.update(v);
			 		}
		----------------------------------------------------update - many to one---------------------------------------------------------
			 
			 
			 Customer c=(Customer)session.get(Customer.class,1500);
			 Vendor v=c.getParentObject();
			 v.setVendorName("danny");
			 session.update(v);
			 			
		-----------------------------------------------------------------------------------------------------------------------------------------
		 																				//get - one to many 
			
					Vendor v=(Vendor)session.get(Vendor.class, 100);
					System.out.println(v.getVendorName());
					System.out.println(v.getVendorId());
					
					Set s1 = v.getCustomerchildren();
					Iterator it = s1.iterator();
					
					while(it.hasNext())
					{
					Customer c = (Customer)it.next();
					System.out.println(c.getCustomerId());
					System.out.println(c.getCustomerName());
					
					}
					-------------------------------------------------------------get- many to one------------------------------------------------
					
					Customer c=(Customer)session.get(Customer.class, 1000);
					
					Vendor v=c.getParentObject();
					System.out.println(v.getVendorId());
					System.out.println(v.getVendorName());
					
-------------------------------------------------------------------------------------------------------------------------------------------*/
			 																								
			 
		Transaction tx = session.beginTransaction();
		 tx.commit();

		 session.close();
		 System.out.println("One To Many Bi-Directional is Done..!!");
		 factory.close();

}

}

	