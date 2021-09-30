package entities;

public class Visualization {
    private Grasshopper viewer;
    private Video movie;

    public Visualization(Grasshopper viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotalWatched(this.viewer.getTotalWatched() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public Grasshopper getViewer() {
        return viewer;
    }

    public void setViewer(Grasshopper viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    public void rate(){
        this.movie.setFeedback(5);
    }

    public void rate(double grade){
        this.movie.setFeedback(grade);
    }

    public void rate(int percentage){
        int total = 0;
        if (percentage <= 20) {
            total = 3;
        } else if (percentage <= 50) {
            total = 5;
        } else if (percentage <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        this.movie.setFeedback(total);
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
