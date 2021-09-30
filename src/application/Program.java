package application;

import entities.Grasshopper;
import entities.Video;

public class Program {
    public static void main(String[] args) {
        Video video[] = new Video[2];

        video[0] = new Video("Transformation hair", 1, 0, 0, false);
        video[1] = new Video("Oklahoma city", 1, 0, 0, false);

        Grasshopper grasshopper[] = new Grasshopper[2];
        grasshopper[0] = new Grasshopper("Jack Sparrow", 45, 'M', 15, "blackpearl", 1);
        grasshopper[1] = new Grasshopper("Black beard", 75, 'M', 25, "pirate", 1);

        System.out.println(video[0].toString());
        System.out.println(grasshopper[0].toString());
    }
}
