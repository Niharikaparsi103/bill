package com.java.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	static Connection connection=null;
	  public static Connection getConnection()
	  {
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1111","root","root");
		      return connection; 
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
		  return connection;
}
}
