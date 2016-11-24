package com.endercrest.uwaterlooapi;

import com.endercrest.uwaterlooapi.courses.Courses;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 *
 * Primary class in charge of all the University of Waterloo API methods.
 */
public class UWaterlooAPI {

    private final Courses courses;
    
    public UWaterlooAPI(String api){
        courses = new Courses(api);
    }

    /**
     * Get the class that contains all API methods. related to courses.
     * @return {@link Courses} containing api methods.
     */
    public Courses getCourses() {
        return courses;
    }
}
