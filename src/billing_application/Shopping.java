package billing_application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.java.model.ConnectionFactory;
import com.java.model.Details;

public class Shopping {
public static double sum;
	
	
	public static int mobile()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 mobiles");
		 System.out.println("enter number of mobiles :");
		 int number = sc.nextInt();
		 int m =number*15000;
		 sum+=m;
         System.out.println(m);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return m;
	}
	
	public static int laptop()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 laptops");
		 System.out.println("enter number of laptop :");
		 int number = sc.nextInt();
		 int n =number*40000;
		 sum+=n;
         System.out.println(n);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return n;
	}
 
	public static int headset()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 headset");
		 System.out.println("enter number of headset :");
		 int number = sc.nextInt();
		 int o =number*40000;
		 sum+=o;
         System.out.println(o);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return o;
	}
	
	
	public static int smartwatch()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 smartwatch");
		 System.out.println("enter number of smartwatch :");
		 int number = sc.nextInt();
		 int p =number*40000;
		 sum+=p;
         System.out.println(p);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return p;
	}
	
	public static int speaker()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 speaker");
		 System.out.println("enter number of speaker :");
		 int number = sc.nextInt();
		 int q =number*40000;
		 sum+=q;
         System.out.println(q);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return q;
	}
	
	
	public static int stove()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 stove");
		 System.out.println("enter number of stove :");
		 int number = sc.nextInt();
		 int m =number*10000;
		 sum+=m;
         System.out.println(m);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return m;
	}
	
	public static int oven()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 oven");
		 System.out.println("enter number of oven :");
		 int number = sc.nextInt();
		 int n =number*5500;
		 sum+=n;
         System.out.println(n);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return n;
	}
 
	public static int grinder()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 grinder");
		 System.out.println("enter number of grinder :");
		 int number = sc.nextInt();
		 int o =number*4300;
		 sum+=o;
         System.out.println(o);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return o;
	}
	
	public static int dishes()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 dishes ");
		 System.out.println("enter number of dishes :");
		 int number = sc.nextInt();
		 int p =number*1250;
		 sum+=p;
         System.out.println(p);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return p;
	}
	
	public static int floormat()
	{
		
		 Scanner sc= new Scanner(System.in);
		 float before =100;
		 float after;
		 float quantity;
		 System.out.println("avaliable 100 floormat");
		 System.out.println("enter number of floormat :");
		 int number = sc.nextInt();
		 int q =number*440;
		 sum+=q;
         System.out.println(q);
         after=number;
		 quantity = before-after;
			System.out.println(quantity+"left quantity");
			return q;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("-----WELCOME TO THE STORE-----");
		System.out.println("==================================");
		System.out.println("1-ELECTRONICS");
		System.out.println("2-KITCHEN");
		System.out.println("===================================");
		
		while(true) {
		System.out.println(" please enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
	    switch(choice) {
	    case 1:
	    	System.out.println("===SELECTED CHOICE IS ELECTRONIC===");
	    	Connection connection = ConnectionFactory.getConnection();
	        try {
	            System.out.println("");
	            Statement statement = connection.createStatement();
	            ResultSet re =statement.executeQuery("SELECT * FROM product_details.electronics;");
//	            System.out.println("ItemId  Name  cost  Quantity");
	            while (re.next()) {
	                
	                System.out.print(re.getInt(1)+"    ");
	                System.out.print(re.getString(2)+"   ");
	                System.out.print(re.getInt(3)+"   ");
	                System.out.println(re.getInt(4));
	                }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }     
	        
	    	System.out.println("selected choice item");
	    	Scanner sc1 = new Scanner(System.in);
	    	int item1 = sc.nextInt();
	    	
	    	if(item1==111) {
	    		
	    		mobile();
	    	    }
	    	
	    		if(item1==222) {
	    			
	    		laptop();
	    		}
	    	
	    		if(item1==333) {
	    			
	            headset();
	    		}

	    		if(item1==444) {
	    			
	            smartwatch();
	    		}

	    		if(item1==555) {
	    			
	                speaker();
	    		}
	           
	    		else
	    			System.out.println("entered code is invalid");
         
	    	break;
	    case 2:
	    	System.out.println("===SELECTED CHOICE IS KITCHEN===");
	    	
	    	Connection connection1 = ConnectionFactory.getConnection();
	        try {
	            System.out.println("");
	            Statement statement = connection1.createStatement();
	            ResultSet re =statement.executeQuery("SELECT * FROM product_details.kitchen;");
//	            System.out.println("ItemId  Name  cost  Quantity");
	            while (re.next()) {
	                
	                System.out.print(re.getInt(1)+"    ");
	                System.out.print(re.getString(2)+"   ");
	                System.out.print(re.getInt(3)+"   ");
	                System.out.println(re.getInt(4));
	                }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }     
	        
	    	
	    	System.out.println("selected choice item");
	    	Scanner sc2 = new Scanner(System.in);
	    	int item2 = sc.nextInt();
	    	
               if(item2==111) {
	    		
	    		stove();
	    	    }
	    	
	    		if(item2==222) {
	    			
	    		oven();
	    		}
	    	
	    		if(item2==333) {
	    			
	            grinder();
	    		}

	    		if(item2==444) {
	    			
	            dishes();
	    		}

	    		if(item2==555) {
	    			
	                floormat();
	    		}
	           
	    		else
	    			System.out.println("entered code is invalid");
         
	    	break;
       
        
       
        default:
        	System.out.println("invalid value");
	    }
	    
	    System.out.println("enter 1 to continue or any key to break");
		int con=sc.nextInt();
		   if(con==1){
			   continue;
			   }
	      
	       else{
	    	  
	           System.out.println("thank you and visit again");
	           break;}
		
		}
		System.out.println(sum+ "total amount");
	}
	
}
