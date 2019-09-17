package Model;

public class Person extends Name{

	private String email;
    private int phone;
/**
 * empty constructor
 */
    public Person() {}
/**
 * constructor taking parameter
 * @param firstName
 * @param middleName
 * @param lastName
 * @param email
 * @param phone
 */
    public Person(String firstName, String middleName, String lastName, String email, int phone) {
        super(firstName, middleName, lastName);
        this.email = email;
        this.phone = phone;
    }
/**
 * in case person have no middle name constructor
 * @param firstName
 * @param lastName
 * @param email
 * @param phone
 */
    public Person(String firstName, String lastName, String email, int phone) { 
        super(firstName, lastName);
        this.email = email;
        this.phone = phone;
    }
    
    public Person(String firstName, String email, int phone) { // in case Person has no middle name
        super(firstName);
        this.email = email;
        this.phone = phone;
    }
/**
 * get email address of person
 * @return email address
 */
    public String getEmail() {
        return email;
    }
/**
 * takes in parameter and set that to email
 * @param email
 */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * get phonenumber of person
     * @return phonenumber
     */
    public int getPhone() {
        return phone;
    }
    /**
     * takes in parameter int and set that to phone
     * @param phonenumber
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

}


