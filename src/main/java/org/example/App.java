package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Student student = new Student();
        student.firstName = "Aizada";
        student.lastName = "Asanova";
        student.age= 16;
        System.out.println(student.firstName+"\n"+student.lastName+"\n"+student.age);
        student.addStudent();
        Student student1 = new Student();
        student1.firstName = "Aizat";
        student1.lastName = "Asanova";
        student1.age= 18;
        System.out.println(student1.firstName+"\n"+student1.lastName+"\n"+student1.age);

    }
}
