package org.example;

import java.util.List;

public class Theater {
    String id;
    String address;
    List<Screen> screens;
    List<Show> shows;

    public Theater(String id, String address, List<Screen> screens, List<Show> shows) {
        this.id = id;
        this.address = address;
        this.screens = screens;
        this.shows = shows;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
