package day05;

import java.time.LocalDate;

public class Viewer {
    public double watchMovie(Movie movie, int rating){
        return movie.rate(rating);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000,3,4);
        Movie movie = new Movie("Movie",date);
        Viewer viewer = new Viewer();
        System.out.println(viewer.watchMovie(movie,5));
        System.out.println(viewer.watchMovie(movie,3));
        System.out.println(viewer.watchMovie(movie,4));
        System.out.println(viewer.watchMovie(movie,4));
        System.out.println(viewer.watchMovie(movie,3));

    }
}
