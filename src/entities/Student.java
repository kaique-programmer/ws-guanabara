package entities;

public class Student extends People{
    private String registration, course;

    public Student(String name, int age, char sex, String registration, String course) {
        super(name, age, sex);
        this.registration = registration;
        this.course = course;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void payMonthly() {
        System.out.println("Payment monthly student: " + this.getName());
    }
}
