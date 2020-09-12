package school.management.system;
/*
    The purpose of this class is to track student's id, name, grade, fees paid and fees total.
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
     * Return student's id
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     * Returns student's id
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return student's grade
     * @return
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Return fees paid by the student
     * @return
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * Returns fees total of the student
     * @return
     */
    public int getFeesTotal() {
        return feesTotal;
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
     * @param payments
     */
    public void payFees (int payments){
        feesPaid +=payments;
        School.updateTotalEarned(feesPaid);
    }

    /**
     *
     * @return remaining fees left to paid
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString(){
        return "Student's name: " + name +
                "\nTotal fees paid so far: $" + feesPaid;
    }
}

