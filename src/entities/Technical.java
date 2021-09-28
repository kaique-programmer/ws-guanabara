package entities;

public class Technical extends Student {
    private int professionalRecord;

    public Technical(String name, int age, char sex, String registration, String course, int professionalRecord) {
        super(name, age, sex, registration, course);
        this.professionalRecord = professionalRecord;
    }

    public int getProfessionalRegistration() {
        return professionalRecord;
    }

    public void setProfessionalRegistration(int professionalRecord) {
        this.professionalRecord = professionalRecord;
    }

    public void payMonthly() {

    }
}
