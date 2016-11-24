package com.endercrest.uwaterlooapi.courses.models;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class CourseExamSchedule {

    private String course;
    private List<CourseExamSection> sections;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<CourseExamSection> getSections() {
        return sections;
    }

    public void setSections(List<CourseExamSection> sections) {
        this.sections = sections;
    }
}
