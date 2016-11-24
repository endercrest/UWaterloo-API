package com.endercrest.uwaterlooapi.courses.models;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class CourseScheduleData {

    private CourseDates dates;
    private CourseLocation location;
    private List<String> instructors;

    public CourseDates getDates() {
        return dates;
    }

    public void setDates(CourseDates dates) {
        this.dates = dates;
    }

    public CourseLocation getLocation() {
        return location;
    }

    public void setLocation(CourseLocation location) {
        this.location = location;
    }

    public List<String> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<String> instructors) {
        this.instructors = instructors;
    }
}
