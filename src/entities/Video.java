package entities;

import util.ActionVideo;

public class Video implements ActionVideo {
    private String title;
    private int feedback;
    private int views;
    private int likes;
    private boolean reproducing;

    public Video() {}

    public Video(String title, int feedback, int views, int likes, boolean reproducing) {
        this.title = title;
        this.feedback = feedback;
        this.views = views;
        this.likes = likes;
        this.reproducing = reproducing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFeedback() {
        return feedback;
    }

    public void setFeedback(double feedback) {
        int newFeedback = (int) (this.feedback + feedback) / this.views;
        this.feedback = newFeedback;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproducing() {
        return reproducing;
    }

    public void setReproducing(boolean reproducing) {
        this.reproducing = reproducing;
    }

    @Override
    public void play() {
        this.reproducing = true;
    }

    @Override
    public void pause() {
        this.reproducing = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", feedback=" + feedback +
                ", views=" + views +
                ", likes=" + likes +
                ", reproducing=" + reproducing +
                '}';
    }
}
