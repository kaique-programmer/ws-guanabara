package application;

import entities.ScholarshipHolder;
import entities.Student;

public class Program {
    public static void main(String[] args) {

        Student student = new Student("James", 23, 'M', "123", "TI");
        student.payMonthly();

        ScholarshipHolder scholarshipHolder = new ScholarshipHolder("Paul", 45,'M', "1234", "TI", 250.00);
        scholarshipHolder.payMonthly();

    }
}
