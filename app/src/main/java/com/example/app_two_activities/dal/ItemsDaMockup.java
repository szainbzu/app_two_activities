package com.example.app_two_activities.dal;

import java.util.ArrayList;
import java.util.List;

public class ItemsDaMockup {

    public List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();


        movies.add(new Movie("The God Father", "Drama"));
        movies.add(new Movie("A Bornx Tale", "Drama"));
        movies.add(new Movie("Friday the 13th", "Horror"));
        movies.add(new Movie("Yes man", "Comedy"));

        return movies;

    }
}
