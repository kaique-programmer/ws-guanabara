package entities;

public class ScholarshipHolder extends Student{
    private double scholarship;

    public ScholarshipHolder(String name, int age, char sex, String registration, String course, double scholarship) {
        super(name, age, sex, registration, course);
        this.scholarship = scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public void renewScholarship() {
        System.out.println("Renewing scholarship of " + this.getName());
    }

    @Override
    public void payMonthly() {
        System.out.println(this.getName() + ": scholarship holder! payment easy");
    }
}
