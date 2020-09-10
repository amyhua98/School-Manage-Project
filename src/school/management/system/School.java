package school.management.system;

import java.util.List;
/*
    The purpose of this class is to accommodate all teachers, students, money earned from the student's fees and money
    spent on teacher's salary
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalEarned;
    private int totalSpent;

    /**
     * Return list of teachers
     * @return teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getTotalEarned() {
        return totalEarned;
    }

    public void setTotalEarned(int totalEarned) {
        this.totalEarned = totalEarned;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(int totalSpent) {
        this.totalSpent = totalSpent;
    }

    /**
     * Object for school
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalEarned = 0;
        totalSpent = 0;
    }
}
