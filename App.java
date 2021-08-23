package org.gma.tutorial.jpa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		String str = s.nextLine();
		String arr[]=new String[str.length()];
		String reverse="";
		
		for(int i=arr.length-1;i>0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		if(reverse.equals(str))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    public static void main( String[] args )
//    {
//    	User user = new User();
//    	user.setName("Aung Aung ");
//    	user.setAddress("Ygn");
//    	
//    	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jpa_tutorial");
//        EntityManager em = emfactory.createEntityManager();
//        
//        List<Object[]> userObjectList=  em.createNamedQuery("user.inquireAllNative").getResultList();
//        
//        List<User> userList = new ArrayList<User>();
//        
//        for(Object[] obj :userObjectList) {
//        	User u = new User();
//        	u.setId(Long.parseLong(obj[0].toString()));
//        	u.setName(obj[1].toString());
//        	u.setAddress(obj[2].toString());
//        	userList.add(user);
//        }
//        
//        em.close();
//        emfactory.close();
//        
//        for(User u : userList ) {
//        	System.out.println(u);
//        }
//    }

