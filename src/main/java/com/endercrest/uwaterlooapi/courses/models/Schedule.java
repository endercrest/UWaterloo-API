package com.endercrest.uwaterlooapi.courses.models;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class Schedule {

    private Dates dates;
    private Location location;
    private List<String> instructors;

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<String> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<String> instructors) {
        this.instructors = instructors;
    }
}
