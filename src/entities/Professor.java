package entities;

public class Professor extends People{
    private String specialty;
    private double salary;

    public Professor(String name, int age, char sex, String specialty, double salary) {
        super(name, age, sex);
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void  receiveSalaryIncrease(double increaseSalary) {
        this.salary += increaseSalary;
    }
}
