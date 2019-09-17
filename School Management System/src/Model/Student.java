package Model;

public class Student extends Person {
	  private String dob;
	    private Modules listOfModules[];
	    private int noOfModules;
/**
 * student constructot without parameters
 */
	    public Student() {
	        listOfModules = new Modules[6];
	        noOfModules = 0;
	    }
/**
 * takes in parameter constructor
 * @param firstName
 * @param middleName
 * @param lastName
 * @param email
 * @param phone
 * @param dob
 */
	    public Student(String firstName, String middleName, String lastName, String email, int phone, String dob) {
	        super(firstName, middleName, lastName, email, phone);
	        this.dob = dob;
	        listOfModules = new Modules[6];
	        noOfModules = 0;
	    }
/**
 * takes in parameter constructor in case there is no middlename
 * @param firstName
 * @param lastName
 * @param email
 * @param phone
 * @param dob
 */
	    public Student(String firstName, String lastName, String email, int phone, String dob) {
	        super(firstName, lastName, email, phone);
	        this.dob = dob;
	        listOfModules = new Modules[6];
	        noOfModules = 0;
	    }
	    /**
	     * there is no lastname
	     * @param firstName
	     * @param email
	     * @param phone
	     * @param dob
	     */
	    public Student(String firstName, String email, int phone, String dob) {
	        super(firstName, email, phone);
	        this.dob = dob;
	        listOfModules = new Modules[6];
	        noOfModules = 0;
	    }
/**
 * takes in parameter and add the modules to a student
 * @param m
 */
	    public void addModule(Modules m) {
	        if (noOfModules >= 6) {
	            System.out.println("You cannot add more modules");
	        }
	        else {
	            listOfModules[noOfModules] = m;
	            noOfModules++;
	        }
	    }
/**
 * takes in module name and updated marks and assign those marks to student
 * @param moduleName
 * @param newGrade
 */
	    public void changeMark(String moduleName, int newGrade) {
	        for (int i = 0;i<listOfModules.length;i++) {
	            if (listOfModules[i].getName().contentEquals(moduleName)) {
	                listOfModules[i].setGrade(newGrade);
	            }
	        }
	    }
/**
 * gets date of birth of student
 * @return date of birth
 */
	    public String getDob() {
	        return dob;
	    }
	    /**
	     * takes in DOB as parameter to set date of birth to desire value
	     * @param dob
	     */

	    public void setDob(String dob) {
	        this.dob = dob;
	    }
/**
 * gets the list of module teach in class
 * @return listOfModules
 */
	    public Modules[] getListOfModules() {
	        return listOfModules;
	    }
/**
 * takes in parameter to set the listOfModules to desire value
 * @param listOfModules
 */
	    public void setListOfModules(Modules[] listOfModules) {
	        this.listOfModules = listOfModules;
	    }
/**
 * this method gets count of modules
 * @return noOfmodules
 */
	    public int getNoOfModules() {
	        return noOfModules;
	    }
/**
 * take in parameter and sets it to desire value
 * @param noOfModules
 */
	    public void setNoOfModules(int noOfModules) {
	        this.noOfModules = noOfModules;
	    }
	}