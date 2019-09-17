package Model;

public class Name {
	private String firstName;
    private String middleName;
    private String lastName;

    public Name() {
    }
/*
 *constructor use to get first name , middle name, and last name
 */
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
/**
 * takes in argument firstname and last name
 * @param firstName
 * @param lastName
 */
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 /**
  * takes in parameter firstname only
  * @param firstName
  */
    public Name(String firstName) {
        this.firstName = firstName;
    }
/**
 * this method gets firstname
 * @return firstname
 */
    public String getFirstName() {
        return firstName;
    }
/**
 * this method takes in parameter firstname and set it to the firstname
 * @param firstName
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * this method gets middlename
     * @return middlename
     */
    public String getMiddleName() {
        return middleName;
    }
    /**
     * this method takes in parameter middlename and set it to the middlename
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * this method gets lastname
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * this method takes in parameter lastname and set it to the lastname
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
