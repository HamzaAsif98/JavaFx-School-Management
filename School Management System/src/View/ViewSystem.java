package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.DatabaseInsertRemove;
import Model.Student;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewSystem extends Application {

	Connection conn;
	@Override
	public void start(Stage primaryStage) throws Exception {
		/**
		 * creating all the required textfield ,buttons, textarea and vboxes
		 */
		TabPane main = new TabPane();
		Tab tab1 = new Tab("STUDENTS");
		Tab tab4 = new Tab("MODULES");
		Tab tab2 = new Tab("TEACHERS");
		Tab tab3 = new Tab("Classes");
		main.getTabs().addAll(tab1, tab2,tab3,tab4);
		
		
		VBox vbox1 = new VBox();
		VBox vbox2 = new VBox();
		VBox vbox3 = new VBox();
		VBox vbox4 = new VBox();
		HBox h1=new HBox();
		HBox h2=new HBox();
		HBox h3=new HBox();
		Label l1 = new Label ("Welcome To Student Management System");
		Label l2 = new Label ("Welcome To Teachers Management System");
		Label l3 = new Label ("Welcome To Module Management System");
		Label l4 = new Label ("Welcome To Class Management System");
		
		Label ls1 = new Label ("Student ID : ");
		Label ls2 = new Label ("First Name : ");
		Label ls3= new Label ("Middle Name");
		Label ls4 = new Label ("Last Name : ");
		Label ls5 = new Label ("Email Address : ");
		Label ls6= new Label ("Phone No : ");
		Label ls7 = new Label ("Date Of Birth : ");
		
		
		
		Scene mainPage = new Scene(main, 1280, 720); 
		
		
		TextArea text1 = new TextArea();
		TextArea text2 = new TextArea();
		TextArea text3 = new TextArea();
		TextArea text4 = new TextArea();
		
		TextField mname = new TextField();
		mname.setMaxWidth(200);
		mname.setPromptText("Module Name");
		TextField mID = new TextField();
		mID.setMaxWidth(200);
		mID.setPromptText("Module ID");
		TextField grade = new TextField();
		grade.setMaxWidth(200);
		grade.setPromptText("Grade");
		
		

		Button addm = new Button("Add Module");                     
		addm.setMinWidth(200);
		Button delm = new Button("Remove Module");                     
		delm.setMinWidth(200);
		Button dism = new Button("Display Modules");                     
		dism.setMinWidth(200);
		Button upg = new Button("Update Grade for Module");                     
		upg.setMinWidth(200);
		Button exit3 = new Button("Exit");                                    
		exit3.setMinWidth(50);
		
		
		TextField sID = new TextField();
		sID.setMaxWidth(200);
		sID.setPromptText("Student ID ");
		TextField sfname = new TextField();
		sfname.setMaxWidth(200);
		sfname.setPromptText("Student First Name");
		TextField smname = new TextField();
		smname.setMaxWidth(200);
		smname.setPromptText("Student Middle Name");
		TextField slname = new TextField();
		slname.setMaxWidth(200);
		slname.setPromptText("Student Last Name");
		TextField email = new TextField();
		email.setMaxWidth(200);
		email.setPromptText("Student Email Address");
		TextField phonenumber = new TextField();
		phonenumber.setMaxWidth(200);
		phonenumber.setPromptText("Student Phone Number");
		TextField dob = new TextField();
		dob.setMaxWidth(200);
		dob.setPromptText("Student Date of Birth");
		
		Button addStu = new Button("Add Student");  
		addStu.setMinWidth(200);
		Button disStu = new Button("Display Students");                     
		disStu.setMinWidth(200);
		Button delstu = new Button("Remove Student");                     
		delstu.setMinWidth(200);
		Button exit2 = new Button("Exit");                                    
		exit2.setMinWidth(50);
		
		
		
		
		
		TextField tID = new TextField();
		tID.setMaxWidth(200);
		tID.setPromptText("Teacher ID");
		TextField tFName = new TextField();
		tFName.setMaxWidth(200);
		tFName.setPromptText("Teacher First Name");
		TextField tMName = new TextField();
		tMName.setMaxWidth(200);
		tMName.setPromptText("Teacher Middle Name");
		TextField tLName = new TextField();
		tLName.setMaxWidth(200);
		tLName.setPromptText("Teacher Last Name");
		TextField teacheremail = new TextField();
		teacheremail.setMaxWidth(200);
		teacheremail.setPromptText("Teacher Email Address");
		TextField tphonenumber = new TextField();
		tphonenumber.setMaxWidth(200);
		tphonenumber.setPromptText("Teacher Phone Number");
		TextField degQual = new TextField();
		degQual.setMaxWidth(200);
		degQual.setPromptText("Degree Qualification"); 
		
		
		Button addTea = new Button("Add Teacher");                     
		addTea.setMinWidth(200);  
		Button disTea = new Button("Display Teacher");                     
		disTea.setMinWidth(200);
		Button deltea = new Button("Remove Teacher");                     
		disTea.setMinWidth(200);
		Button uptea = new Button("Update Teacher Details");                     
		uptea.setMinWidth(200);
		Button exit1 = new Button("Exit");                                    
		exit1.setMinWidth(50);
		
		
		TextField classname = new TextField();
		classname.setMaxWidth(200);
		classname.setPromptText("Class Name "); 
		TextField classid = new TextField();
		classid.setMaxWidth(200);
		classid.setPromptText("Class ID");
		
		
		Button addclass = new Button("Add Class");                     
		addclass.setMinWidth(200);
		Button remclass = new Button("Remove Class");                     
		remclass.setMinWidth(200); 
		Button discla = new Button("Display Classes");                     
		disStu.setMinWidth(200);
		Button exit = new Button("Exit");                                    
		exit.setMinWidth(50);
		
		

		
	

		
		h1.getChildren().addAll(ls1,sID,ls2,sfname,ls3,smname,ls4,slname);
		h1.setSpacing(50);
		h2.getChildren().addAll(ls5,email, ls6,phonenumber, ls7,dob);
		h2.setSpacing(50);
		h3.getChildren().addAll(addStu, disStu,delstu,exit);
		h3.setSpacing(20);
		vbox1.getChildren().addAll(l1,h1,h2,h3,text1);
		vbox1.setAlignment(Pos.TOP_CENTER);
		vbox2.getChildren().addAll( tFName, tMName, tLName, teacheremail, tphonenumber, degQual, addTea, disTea,tID,deltea,uptea, exit1,text2);
		vbox2.setAlignment(Pos.TOP_CENTER);
		vbox3.getChildren().addAll(classname,addclass,remclass,classid,discla,exit2,text3);
		vbox3.setAlignment(Pos.TOP_CENTER);
		vbox4.getChildren().addAll(mname,grade,addm,delm,mID,dism,upg,exit3,text4);
		vbox4.setAlignment(Pos.TOP_CENTER);
		tab1.setContent(vbox1);
		tab2.setContent(vbox2);
		tab3.setContent(vbox3);
		tab4.setContent(vbox4);


		addStu.setOnAction(e-> {

			/**
			 *Getting values from the GUI - parts of Name - first name, middle name, last name
			 */
			String firstName = sfname.getText();
			String middleName = smname.getText();
			String lastName = slname.getText();

			/**
			 * Getting values from the GUI - date of birth, email and phone number
			 */

			String email1 = email.getText();
			String phoneNumber = phonenumber.getText();
			String dateOfBirth = dob.getText();

			/**
			 * DatabaseInsertRemoveClass to the method savestudent - THIS MEANS THAT THERE IS A METHOD INSIDE YOUR DATABASE CLASS(DATABASTE INSERT REMOVE) CALL SAVE STUDENT GO TO THAT CLASS AND CHECK IT
			 */
			DatabaseInsertRemove.insertStudent(firstName, middleName, lastName, email1, phoneNumber ,dateOfBirth); // THIS LINE SAVE THE STUDENT DETAILS
			/**
			 * Once the add button is clicked clear and uncheck all the textab3oxes and checkboxes
			 */
			sfname.clear();
			smname.clear();
			slname.clear();
			email.clear();
			phonenumber.clear();
			dob.clear();
			text1.clear();

		});

		delstu.setOnAction(e-> {
			String idstudent = sID.getText();
			DatabaseInsertRemove.removeStudent(Integer.parseInt(idstudent)); //I AM REMOVING STUDENT BY INTEGER
			sID.clear();
			text1.clear();

		});

		disStu.setOnAction(e-> {
			try {
				DatabaseInsertRemove.displayStudents(text1);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("Errorrr");
			}
		});

		addTea.setOnAction(e-> {

			/**
			 *Getting values from the GUI - parts of Name - first name, middle name, last name
			 */
			String firstName = tFName.getText();
			String middleName = tMName.getText();
			String lastName = tLName.getText();

			/**
			 * Getting values from the GUI - date of birth, email and phone number
			 */

			String email1 = teacheremail.getText();
			String phoneNumber = tphonenumber.getText();
			String Degree = degQual.getText();

			/**
			 * DatabaseInsertRemoveClass to the method savestudent - THIS MEANS THAT THERE IS A METHOD INSIDE YOUR DATABASE CLASS(DATABASTE INSERT REMOVE) CALL SAVE STUDENT GO TO THAT CLASS AND CHECK IT
			 */
			DatabaseInsertRemove.insertTeacher(firstName, middleName, lastName, email1, phoneNumber ,Degree); // THIS LINE SAVE THE STUDENT DETAILS
			/**
			 * Once the add button is clicked clear and uncheck all the textab3oxes and checkboxes
			 */
			tFName.clear();
			tMName.clear();
			tLName.clear();
			teacheremail.clear();
			tphonenumber.clear();
			degQual.clear();
			text2.clear();

		});
		deltea.setOnAction(e-> {
			String tutorID = tID.getText();
			DatabaseInsertRemove.removeteacher(Integer.parseInt(tutorID)); //I AM REMOVING Teacher BY INTEGER
			tID.clear();
			text2.clear();

		});
		disTea.setOnAction(e-> {
			try {
				DatabaseInsertRemove.displayTeacher(text2);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}


		});

		uptea.setOnAction(e->{
			String degreeQual = degQual.getText();
			String personID = tID.getText();
			DatabaseInsertRemove.updateTeacher(degreeQual, personID);
			degQual.clear();
			tID.clear();
			text2.clear();
		});

		addclass.setOnAction(e-> {


			String ClassName = classname.getText();

			DatabaseInsertRemove.insertClass(ClassName); 

			classname.clear();

		});
		remclass.setOnAction(e-> {
			String ClassID = classid.getText();
			DatabaseInsertRemove.removeClass(Integer.parseInt(ClassID)); 
			classid.clear();
			text3.clear();

		});
		discla.setOnAction(e-> {

			try {
				DatabaseInsertRemove.displayclass(text3);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 


		});
		addm.setOnAction(e-> {


			String modulename = mname.getText();
			String grade1 = grade.getText();

			DatabaseInsertRemove.insertmodule(modulename,grade1); 

			mname.clear();
			grade.clear();
			text4.clear();

		});
		delm.setOnAction(e-> {
			String moduleID = mID.getText();
			DatabaseInsertRemove.removemodule(Integer.parseInt(moduleID)); 
			mID.clear();
			text4.clear();

		});
		dism.setOnAction(e-> {
			try {
				DatabaseInsertRemove.displaymodule(text4);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 

		});
		upg.setOnAction(e->{
			String Grade = grade.getText();
			String ID = mID.getText();
			DatabaseInsertRemove.updatemodule(Grade, ID);
			grade.clear();
			mID.clear();
			text4.clear();
		});



		exit.setOnAction(e->{
			primaryStage.close();                                              
		});
		exit1.setOnAction(e->{
			primaryStage.close();                                              
		});
		exit2.setOnAction(e->{
			primaryStage.close();                                              
		});
		exit3.setOnAction(e->{
			primaryStage.close();                                              
		});

		primaryStage.setTitle("Project");                                          
		primaryStage.setScene(mainPage);                                                    
		primaryStage.show();  
		text1.requestFocus();
		primaryStage.show();

	}



	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch (ClassNotFoundException e){
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		Connection conn;

		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject?useTimezone=true&serverTimezone=UTC","root", "root");
			System.out.println("Connection successful");
		}catch (SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return;
		}


		launch(args);

	}


}
