package com.example.app_two_activities.dal;

import androidx.annotation.NonNull;

public class Movie {
    private String name;
    private String genre;

    public Movie(){}

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @NonNull
    @Override
    public String toString() {
        return name + ", " + genre;
    }
}
