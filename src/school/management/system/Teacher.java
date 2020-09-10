package school.management.system;
/*
    This purpose of this class is to track teacher's id, name and salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Return teacher's id
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     * Returns teacher's id
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Used to set the teacher's salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }
}
