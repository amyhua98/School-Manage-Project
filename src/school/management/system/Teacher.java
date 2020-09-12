package school.management.system;
/*
    This purpose of this class is to track teacher's id, name and salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
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
     * Returns the teacher's salary
     * @return salary
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * Set the teacher's salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to salary and removes from totalEarned from school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalSpent(salary);
    }

    @Override
    public String toString(){
        return "Teacher's name: " + name +
                "\nTotal salary earned so far: $" + salaryEarned;
    }
}
