package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DatabaseInsertRemove {
/**
 * takes in parameter and add student to the database
 * @param firstname
 * @param middlename
 * @param lastname
 * @param email
 * @param phonenumber
 * @param DOB
 */
	  public static void insertStudent( String firstname,String middlename, String lastname, String email, String phonenumber,String DOB) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver Not found: Please import");
	            e.printStackTrace();
	            return;
	        }
	        Connection connection;

	        try{
				connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
				System.out.println("Connection successful");
			}catch (SQLException e){
				System.out.println("Connection Failed");
				e.printStackTrace();
				return;
			}
	        if (connection != null) {   //checks that the connection is not null(there is a connection)
	            PreparedStatement addItems;
	            try {
	                addItems = connection.prepareCall("INSERT INTO oopproject.student(firstname, middlename,lastname,email,phonenumber,DOB ) VALUES(?,?,?,?,?,?)");
	                addItems.setString(1, firstname);
	                addItems.setString(2, middlename);
	                addItems.setString(3, lastname);
	                addItems.setString(4, email);
	                addItems.setString(5, phonenumber);
	                addItems.setString(6, DOB);



	                int i = addItems.executeUpdate();

	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }


	    /**
	     * Remove a student by id. First we check the database connection. Then we query with delete and close the connection to the database
	     */
	    public static void removeStudent(int studentID)  {

	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
	        if (connection != null) {

	            PreparedStatement removeStudent;
	        try{
	            removeStudent = connection.prepareCall("DELETE FROM oopproject.student where studentID = ?");
	            removeStudent.setInt(1, studentID);

	            int i = removeStudent.executeUpdate();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        }
	    }
	   /**
	    * Display student details in a textarea with throw exception
	    * @param tas
	    * @throws SQLException
	    */
	    public static void displayStudents(TextArea tas) throws SQLException { 


	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}

	  if(connection!=null) {

		  try {

				Statement st = connection.createStatement();
				String qy = "Select * from student";
				ResultSet rs = st.executeQuery(qy);	
				while(rs.next()){  
					tas.appendText( rs.getString(1)+" : "+rs.getString(2)+" "
							+rs.getString(3)+" "+rs.getString(4)+" , "+rs.getString(5)+" , "
							+rs.getString(6)+" "+rs.getString(7)+"\n"); 
				}	
				st.close();
			}catch(Exception io) {
				System.out.println("Error" +io);
			}			
		
	  }
	    }
	   /**
	    * Adding Teacher to the database with taking in parameter
	    * @param firstname
	    * @param middlename
	    * @param lastname
	    * @param email
	    * @param phonenumber
	    * @param Degree
	    */
	    public static void insertTeacher( String firstname,String middlename, String lastname, String email, String phonenumber,String Degree) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver Not found: Please import");
	            e.printStackTrace();
	            return;
	        }
	        Connection connection;

	        try{
				connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
				System.out.println("Connection successful");
			}catch (SQLException e){
				System.out.println("Connection Failed");
				e.printStackTrace();
				return;
			}
	        if (connection != null) {   //checks that the connection is not null(there is a connection)
	            PreparedStatement addItems;
	            try {
	                addItems = connection.prepareCall("INSERT INTO oopproject.tutor(firstname, middlename,lastname,email,phonenumber,Degree ) VALUES(?,?,?,?,?,?)");
	                addItems.setString(1, firstname);
	                addItems.setString(2, middlename);
	                addItems.setString(3, lastname);
	                addItems.setString(4, email);
	                addItems.setString(5, phonenumber);
	                addItems.setString(6, Degree);



	                int i = addItems.executeUpdate();

	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }


	    /**
	     * Remove a teacher by id. First we check the database connection. Then we query with delete and close the connection to the database
	     */
	    public static void removeteacher(int tutorID)  {

	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
	        if (connection != null) {

	            PreparedStatement removeStudent;
	        try{
	            removeStudent = connection.prepareCall("DELETE FROM oopproject.tutor where tutorID = ?");
	            removeStudent.setInt(1, tutorID);

	            int i = removeStudent.executeUpdate();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        }
	    }
	    /**
		    * Display teacher details in a textarea with throw exception
		    * @param tas
		    * @throws SQLException
		    */
	    public static void displayTeacher(TextArea tas) throws SQLException { 


	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}

	  if(connection!=null) {

			Statement st = connection.createStatement();
			String qy = "Select * from Tutor";
			ResultSet rs = st.executeQuery(qy);	
			while( rs.next()){  
				tas.appendText( rs.getString(1)+" "+rs.getString(2)+" "
						+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "
						+rs.getString(6)+" "+rs.getString(7)+"\n");     			           			                
			
			}				
			st.close();
			
	  }
	  }
	 /**
	  * update teachers degree by recognising them from tutorid
	  * @param Degree
	  * @param tutorID
	  */
	    public static void updateTeacher(String Degree, String tutorID) {

	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
		        if (connection != null){
					PreparedStatement updateTeacher;
				try {
					
					updateTeacher = connection.prepareCall(" Update tutor set Degree = ? where tutorID = ?");
					updateTeacher.setString(1, Degree);
					updateTeacher.setString(2, tutorID);
					int j = updateTeacher.executeUpdate();
					connection.close();
					
				}catch (Exception io) {
					System.out.println("Error" +io);
				}
			}
			}
	   /**
	    *   
	     * Save a class inside the class database. Checks connection, open it and insert values passed
	    * @param className
	    */
	    public static void insertClass( String className) {
	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
	        if (connection != null) {
	            PreparedStatement  saveClass;
	            try {
	                saveClass = connection.prepareCall("INSERT INTO oopproject.classes( ClassName) VALUES(?)");
	                saveClass.setString(1, className);


	                int i =  saveClass.executeUpdate();

	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	   
	    /**
	     * Remove a class. Checks the connection then open it, then query it with a delete, so we can remove from the class table
	     * @param ClassID
	     */

	    public static void removeClass(int ClassID)  {

	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
	        if (connection != null) {

	            PreparedStatement removeClass;
	            try{
	            removeClass = connection.prepareCall("DELETE FROM oopproject.classes where ClassID = ?");
	            removeClass.setInt(1, ClassID);

	            int i = removeClass.executeUpdate();


	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	    /**
	    * Display classes details in a textarea with throw exception
	    * @param tas
	    * @throws SQLException
	    */
	    public static void displayclass(TextArea tas) throws SQLException { 


	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}

	  if(connection!=null) {

			Statement st = connection.createStatement();
			String qy = "Select * from classes";
			ResultSet rs = st.executeQuery(qy);	
			while( rs.next()){  
				tas.appendText( rs.getString(1)+" "+rs.getString(2)+"\n");    			           			                
			
			}				
			st.close();
			
	  }
	  }
	    /**
	     * Adds modules details to a database
	     * @param modulename
	     * @param Grade
	     */
	    public static void insertmodule( String modulename,String Grade) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver Not found: Please import");
	            e.printStackTrace();
	            return;
	        }
	        Connection connection;

	        try{
				connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
				System.out.println("Connection successful");
			}catch (SQLException e){
				System.out.println("Connection Failed");
				e.printStackTrace();
				return;
			}
	        if (connection != null) {   //checks that the connection is not null(there is a connection)
	            PreparedStatement addItems;
	            try {
	                addItems = connection.prepareCall("INSERT INTO oopproject.module(modulename,Grade) VALUES(?,?)");
	                addItems.setString(1, modulename);
	                addItems.setString(2, Grade);
	              



	                int i = addItems.executeUpdate();

	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
/**
 * remove module from database to recognise through module id
 * @param moduleID
 */
	    public static void removemodule(int moduleID)  {

	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
	        if (connection != null) {

	            PreparedStatement removeClass;
	            try{
	            removeClass = connection.prepareCall("DELETE FROM oopproject.module where moduleID = ?");
	            removeClass.setInt(1, moduleID);

	            int i = removeClass.executeUpdate();


	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	    /**
		    * Display moduloe details in a textarea with throw exception
		    * @param tas
		    * @throws SQLException
		    */
	    public static void displaymodule(TextArea tas) throws SQLException { 


	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}

	  if(connection!=null) {

			Statement st = connection.createStatement();
			String qy = "Select * from module";
			ResultSet rs = st.executeQuery(qy);	
			while( rs.next()){  
				tas.appendText( rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n");    			           			                
			
			}				
			st.close();
			
	  }
	  }
	   /**
	    * Updates marks in the table with input as module id and changed grade
	    * @param Grade
	    * @param mID
	    */
	    public static void updatemodule(String Grade, String mID) {

	    	 try {

		            Class.forName("com.mysql.cj.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC Driver Not found: Please import");
		            e.printStackTrace();
		            return;
		        }
		        Connection connection;

		        try{
					connection = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
					System.out.println("Connection successful");
				}catch (SQLException e){
					System.out.println("Connection Failed");
					e.printStackTrace();
					return;
				}
		        if (connection != null){
					PreparedStatement updateTeacher;
				try {
					
					updateTeacher = connection.prepareCall(" Update module set Grade = ? where moduleID = ?");
					updateTeacher.setString(1, Grade);
					updateTeacher.setString(2, mID);
					int j = updateTeacher.executeUpdate();
					connection.close();
					
				}catch (Exception io) {
					System.out.println("Error" +io);
				}
			}
			}
}
