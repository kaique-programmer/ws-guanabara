package entities;

import util.ActionVideo;

public class Video implements ActionVideo {
    private String title;
    private int feedback;
    private int views;
    private int likes;
    private boolean recording;

    public Video(String title, int feedback, int views, int likes, boolean recording) {
        this.title = title;
        this.feedback = feedback;
        this.views = views;
        this.likes = likes;
        this.recording = recording;
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

    public void setFeedback(int feedback) {
        this.feedback = feedback;
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

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }
}
