package View;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Classes;
import Model.Modules;
import Model.Student;
public class Main {

	public static void main(String[] args) {
	

	
		        Classes c1 = new Classes();
		        c1.setClassID("SDH2-A");


		      

		        Student s1 = new Student("Colan", "Michael","Barry", "Colan@mycit.ie", 894111112, "05/12/1994");
		        Student s2 = new Student("Ivan", "Chris ","O'Brien", "ivan@gmail.com", 892222222, "15/12/1996");
		        Student s3 = new Student("Hamza", "Ali ","Khan", "hamza@gmail.com", 833333333, "12/12/1997");

		        c1.addStudent(s1);
		        c1.addStudent(s2);
		        c1.addStudent(s3);

		        Modules m1 = new Modules("OOP",70);
		        Modules m2 = new Modules("OOAD",60);
		        Modules m3 = new Modules("Non Linear",65);
		        Modules m4 = new Modules("C",80);
		        Modules m5 = new Modules("Maths",65);
		        Modules m6 = new Modules("NoSQL",85);

		        s1.addModule(m1);
		        s1.addModule(m2);
		        s1.addModule(m3);
		        s1.addModule(m4);
		        s1.addModule(m5);
		        s1.addModule(m6);
		        s2.addModule(m1);
		        s2.addModule(m2);
		        s2.addModule(m3);
		        s2.addModule(m4);
		        s2.addModule(m5);
		        s2.addModule(m6);
		        s3.addModule(m1);
		        s3.addModule(m2);
		        s3.addModule(m3);
		        s3.addModule(m4);
		        s3.addModule(m5);
		        s3.addModule(m6);

		        s1.changeMark("OOP", 80);
		        s2.changeMark("NoSQL", 70);
		        s3.changeMark("Maths", 70);
		        
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
		                addItems.setString(1, s2.getFirstName());
		                addItems.setString(2, s2.getMiddleName());
		                addItems.setString(3, s2.getLastName());
		                addItems.setString(4, s2.getEmail());
		                addItems.setInt(5, s1.getPhone());
		                addItems.setString(6, s2.getDob());
		                int i = addItems.executeUpdate();
		                System.out.println("Congo");
		                addItems = connection.prepareCall("INSERT INTO oopproject.module(modulename,Grade ) VALUES(?,?)");
		                addItems.setString(1, m1.getName());
		                addItems.setInt(2, m1.getGrade());
		            
		                int i1 = addItems.executeUpdate();
		                System.out.println("Congo");
		              
		                
		                addItems = connection.prepareCall("INSERT INTO oopproject.classes(ClassName ) VALUES(?)");
		                addItems.setString(1, c1.getClassID());
		             
		            
		                int i11 = addItems.executeUpdate();
		                System.out.println("Congo");
		                //Removing items like module student and classess
		                
		                connection.close();
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        }
		    
	
}





	}
		        

