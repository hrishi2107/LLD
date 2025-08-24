package org.example;

public class Movie {
    Integer id;
    String name;
    Integer movieDuration;

    public Movie(Integer id, String name, Integer movieDuration) {
        this.id = id;
        this.name = name;
        this.movieDuration = movieDuration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Integer movieDuration) {
        this.movieDuration = movieDuration;
    }
}
