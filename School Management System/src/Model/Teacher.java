package Model;

public class Teacher extends Person{
	private String degreeQualification;
/**
 * An Empty Constructor
 */
    public Teacher() {}
/**
 * Constructor for Degree Qualification
 * @param degreeQualification
 */
    public Teacher(String degreeQualification) {
        this.degreeQualification = degreeQualification;
    }
    /**
     * takes in parameter constructor
     * @param firstName
     * @param middleName
     * @param lastName
     * @param email
     * @param phone
     * @param degreeQualification
     */

    public Teacher(String firstName, String middleName, String lastName, String email, int phone, String degreeQualification) {
        super(firstName, middleName, lastName, email, phone);
        this.degreeQualification = degreeQualification;
    }
    /**
     * if teacher have no middle name use this constructor
     * @param firstName
     * @param lastName
     * @param email
     * @param phone
     * @param degreeQualification
     */

    public Teacher(String firstName, String lastName, String email, int phone, String degreeQualification) { // in case person has no middle name
        super(firstName, lastName, email, phone);
        this.degreeQualification = degreeQualification;
    }
    /**
     * if teacher have no last name
     * @param firstName
     * @param email
     * @param phone
     * @param degreeQualification
     */
    public Teacher(String firstName, String email, int phone, String degreeQualification) { // in case person has no middle name or last name
        super(firstName, email, phone);
        this.degreeQualification = degreeQualification;
    }
/**
 * get degree of Qualification of teacher
 * @return degree qualification
 */
    public String getDegreeQualification() {
        return degreeQualification;
    }
/**
 * pass in parameter to set value to desired value
 * @param degreeQualification
 */
    public void setDegreeQualification(String degreeQualification) {
        this.degreeQualification = degreeQualification;
    }

}
