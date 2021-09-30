package entities;

public abstract class People {
    private String name;
    private int age;
    private char sex;
    private int experience;

    public People(){}

    public People(String name, int age, char sex, int experience) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public final void toAnniversary() {
        this.age++;
    }

    public void winExperience() {

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
