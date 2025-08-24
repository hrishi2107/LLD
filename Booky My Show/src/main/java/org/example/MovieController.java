package org.example;

import java.util.List;
import java.util.Map;

public class MovieController {
    Map<String, List<Movie>> cityVSmovie;
    List<Movie> allMovies;


    public Map<String, List<Movie>> getCityVSmovie() {
        return cityVSmovie;
    }

    public void setCityVSmovie(Map<String, List<Movie>> cityVSmovie) {
        this.cityVSmovie = cityVSmovie;
    }

    public List<Movie> getAllMovies() {
        return allMovies;
    }

    public void setAllMovies(List<Movie> allMovies) {
        this.allMovies = allMovies;
    }
}
