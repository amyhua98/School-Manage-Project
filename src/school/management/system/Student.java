package school.management.system;
/*
    The purpose of this class is to track students id, name, grade, fees paid and fees total
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * Used to set the student's grade
     * @param grade
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Used to update the student's fees paid
     * @param fees
     */
    public void updateFeesPaid (int payments){
        feesPaid +=payments;
    }
}

