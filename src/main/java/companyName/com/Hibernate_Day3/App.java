package companyName.com.Hibernate_Day3;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import companyName.com.Hibernate_Day3.entity.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		String fname,lname,address;
//		
//		Scanner obj = new Scanner(System.in);
//		
//		System.out.print("\nEnter First Name : ");
//		
//		fname=obj.nextLine();
//			
//		System.out.print("\nEnter Last Name : ");
//				
//		lname=obj.nextLine();
//			
//		System.out.print("\nEnter Address : ");
//				
//		address=obj.nextLine();
//		
//		Customer cus = new Customer(fname, lname, address);
		Query query = session.createQuery("from Customer");
		List<Customer> list = query.list();
		
		for(Customer cus:list){
			
			System.out.println(cus);
		}
		
//		session.save(cus);
		tx.commit();
		session.close();
		
		System.out.println("Data Inserted Succesfully");

    }
}
