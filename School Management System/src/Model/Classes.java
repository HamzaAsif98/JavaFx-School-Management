package Model;

import java.util.ArrayList;

public class Classes {
/**
 * creating attributes and list of students in class
 */
	 private String classID;
	    private ArrayList<Student> listOfStudents;

	    public Classes(){
	        listOfStudents = new ArrayList<Student>();
	    }
	    /**
	     * takes in Class ID
	     * @param id
	     */
	    public Classes(int id){
	        listOfStudents = new ArrayList<Student>();
	    }
	    /**
	     * takes in student as parameter and add them to the list
	     * @param s
	     */
	    public void addStudent(Student s) {
	        listOfStudents.add(s);}
/**
 * takes in student id and remove a student by id
 * @param StudentId
 */
	    public void removeStudent(int StudentId) {
	        for (int i = 0; i <listOfStudents.size();i++) {
	            if (listOfStudents.get(i).getPhone() == StudentId) {
	                listOfStudents.remove(i);
	            }
	        }
	    }
/**
 * this method returns the value of students in the list
 * @return listOfStudent
 */
	    public ArrayList<Student> returnList() {
	        return this.listOfStudents;
	    }
/**
 * gets class ID 
 * @return classID
 */
	    public String getClassID() {
	        return classID;
	    }
/**
 * sets class ID to a desired value
 * @param classID
 */
	    public void setClassID(String classID) {
	        this.classID = classID;
	    }
	}
