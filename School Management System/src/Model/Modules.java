package Model;

public class Modules {
	private String name;
    private int grade;
/**
 * empty constructor
 */
    public Modules() {}
/**
 * constructor taking in name of module
 * @param name
 */
    public Modules(String name) {
        this.name = name;
    }
/**
 * constructor parameter taking grade and name of module
 * @param name
 * @param grade
 */
    public Modules(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
/**
 * gets name of module
 * @return name
 */
    public String getName() {
        return name;
    }
/**
 * set the name to a desire value
 * @param name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * getsGrade of Student
 * @return grade
 */
    public int getGrade() {
        return grade;
    }
/**
 * take in parameter grade and set it to particular value
 * @param grade
 */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}

