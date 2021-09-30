package application;

import entities.Grasshopper;
import entities.Video;
import entities.Visualization;

public class Program {
    public static void main(String[] args) {
        Video video[] = new Video[2];

        video[0] = new Video("Transformation hair", 0, 0, 0, false);
        video[1] = new Video("Oklahoma city", 0, 0, 0, false);
        video[1].like();

        Grasshopper grasshopper[] = new Grasshopper[2];
        grasshopper[0] = new Grasshopper("Jack Sparrow", 45, 'M', 15, "blackpearl", 0);
        grasshopper[1] = new Grasshopper("Black beard", 75, 'M', 25, "pirate", 0);

        Visualization visualization[] = new Visualization[2];
        visualization[0] = new Visualization(grasshopper[0], video[0]); // Jack Sparrow watch movie
        visualization[0].rate();
        System.out.println(visualization[0].toString());

        visualization[1] = new Visualization(grasshopper[1], video[1]); // Black beard watch movie
        visualization[1].rate(75.5);
        System.out.println(visualization[1].toString());
    }
}
