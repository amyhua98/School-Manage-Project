package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Teacher Lizzy = new Teacher(1, "Lizzy", 500);
        Teacher Melissa = new Teacher(2, "Melissa", 700);
        Teacher Alan = new Teacher(3, "Alan", 650);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(Alan);


        Student Tam = new Student(1,"Tam", 3);
        Student Alex = new Student(2,"Alex", 5);
        Student Naomi = new Student(3,"Naomi", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Tam);
        studentList.add(Alex);
        studentList.add(Naomi);

        School ghs = new School(teacherList, studentList);
        System.out.println("GHS has earned $" + ghs.getTotalEarned());

        Teacher Megan = new Teacher(4, "Megan", 900);
        ghs.addTeacher(Megan);

        Tam.payFees(5500);
        Alex.payFees(3000);
        Naomi.payFees(6000);

        Student Kayla = new Student(4, "Kayla", 7);
        ghs.addStudent(Kayla);

        System.out.println("GHS has earned $" + ghs.getTotalEarned());

        System.out.println("-----MAKING SCHOOL PAY SALARY-----");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + Lizzy.getName() + " and now has $" + ghs.getTotalEarned());

        Melissa.receiveSalary(Melissa.getSalary());
        System.out.println("GHS has spent for salary to " + Melissa.getName() + " and now has $" + ghs.getTotalEarned());

        Alan.receiveSalary(Alan.getSalary());
        System.out.println("GHS has spent for salary to " + Alan.getName() + " and now has $" + ghs.getTotalEarned());

        System.out.println(Tam);
        System.out.println(Alan);

        System.out.println(teacherList);
        System.out.println(studentList);

    }
}
