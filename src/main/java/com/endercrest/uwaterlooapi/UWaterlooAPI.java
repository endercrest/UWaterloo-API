package com.endercrest.uwaterlooapi;

import com.endercrest.uwaterlooapi.courses.Courses;
import com.endercrest.uwaterlooapi.feds.Feds;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 *
 * Primary class in charge of all the University of Waterloo API methods.
 */
public class UWaterlooAPI {

    private final Courses courses;
    private final Feds feds;

    public UWaterlooAPI(String api){
        courses = new Courses(api);
        feds = new Feds(api);
    }

    /**
     * Get the class that contains all API methods for classes.
     * @return {@link Courses} containing api methods.
     */
    public Courses getCourses() {
        return courses;
    }

    /**
     * Get the class that contains all API methods for the FEDS.
     * @return {@link Feds} containing api methods.
     */
    public Feds getFeds(){
        return feds;
    }
}
