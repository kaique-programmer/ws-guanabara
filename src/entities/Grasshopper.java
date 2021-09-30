package entities;

public class Grasshopper extends People{
    private String login;
    private int totalWatched;

    public Grasshopper(String name, int age, char sex, int experience, String login, int totalWatched) {
        super(name, age, sex, experience);
        this.login = login;
        this.totalWatched = totalWatched;
    }

    public String getLogo() {
        return login;
    }

    public void setLogo(String login) {
        this.login = login;
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    public void sawMoreOne() {

    }

    @Override
    public String toString() {
        return "Grasshopper{" +
                super.toString() +
                "login='" + login + '\'' +
                ", totalWatched=" + totalWatched +
                '}';
    }
}
