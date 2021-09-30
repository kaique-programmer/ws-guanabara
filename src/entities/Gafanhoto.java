package entities;

public class Gafanhoto {
    private String login;
    private int totalWatched;

    public Gafanhoto(String login, int totalWatched) {
        this.login = login;
        this.totalWatched = totalWatched;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
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
}
