package org.example;

import java.util.List;
import java.util.Map;

public class TheaterController {


    Map<String, List<Theater>> cityVStheater;
    List<Theater> allTheaters;

    public Map<String, List<Theater>> getCityVStheater() {
        return cityVStheater;
    }

    public void setCityVStheater(Map<String, List<Theater>> cityVStheater) {
        this.cityVStheater = cityVStheater;
    }

    public List<Theater> getAllTheaters() {
        return allTheaters;
    }

    public void setAllTheaters(List<Theater> allTheaters) {
        this.allTheaters = allTheaters;
    }
}
