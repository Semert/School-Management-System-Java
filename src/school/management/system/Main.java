package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",2500);
        Teacher Jack = new Teacher(2,"Jack",3700);
        Teacher Primo = new Teacher(3,"Primo",4600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(Jack);
        teacherList.add(Primo);


        Student Daniel = new Student(1,"Daniel",4);
        Student Adam = new Student(2,"Adam",12);
        Student Geralt = new Student(3,"Geralt",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Daniel);
        studentList.add(Adam);
        studentList.add(Geralt);




        School highSchool = new School(teacherList,studentList);

        Teacher Megan = new Teacher(6,"Megan", 900);

        highSchool.addTeacher(Megan);


        Daniel.payFees(5000);
        Adam.payFees(6000);
        System.out.println("highSchool has earned $"+ highSchool.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("highSchool has spent for salary to " + lizzy.getName()
        +" and now has $" + highSchool.getTotalMoneyEarned());

        Primo.receiveSalary(Primo.getSalary());
        System.out.println("highSchool has spent for salary to " + Primo.getName()
                +" and now has $" + highSchool.getTotalMoneyEarned());


        System.out.println(Adam);

        Jack.receiveSalary(Jack.getSalary());

        System.out.println(Jack);


    }
}
