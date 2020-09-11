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
        System.out.println("GHS has earned " + ghs.getTotalEarned());
    }
}
