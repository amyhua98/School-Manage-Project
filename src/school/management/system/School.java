package school.management.system;

import java.util.List;
/*
    The purpose of this class is to accommodate all teachers, students, money earned from the student's fees and money
    spent on teacher's salary
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalEarned;
    private static int totalSpent;

    /**
     *
     * @return teachers list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the list of teachers
     * @param teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return students list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the list of students
     * @param student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned
     */
    public int getTotalEarned() {
        return totalEarned;
    }

    /**
     * Update total money earned
     * @param moneyEarned
     */
    public static void updateTotalEarned(int moneyEarned) {
        totalEarned += moneyEarned;
    }

    /**
     *
     * @return total money spent
     */
    public int getTotalSpent() {
        return totalSpent;
    }

    /**
     * Update money spent on the school from the teacher's salary only.
     * @param moneySpent
     */
    public static void updateTotalSpent(int moneySpent) {
        totalEarned -= moneySpent;
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
