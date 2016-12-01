package com.endercrest.uwaterlooapi;

import com.endercrest.uwaterlooapi.awards.Awards;
import com.endercrest.uwaterlooapi.courses.Courses;
import com.endercrest.uwaterlooapi.events.Events;
import com.endercrest.uwaterlooapi.feds.Feds;
import com.endercrest.uwaterlooapi.foodservices.FoodServices;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 *
 * Primary class in charge of all the University of Waterloo API methods.
 */
public class UWaterlooAPI {

    private final Courses courses;
    private final Feds feds;
    private final FoodServices foodServices;
    private final Awards awards;
    private final Events events;

    public UWaterlooAPI(String apiKey){
        courses = new Courses(apiKey);
        feds = new Feds(apiKey);
        foodServices = new FoodServices(apiKey);
        awards = new Awards(apiKey);
        events = new Events(apiKey);
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

    /**
     * Get the class that contains all API methods for the Food Services
     * @return {@link FoodServices}
     */
    public FoodServices getFoodServices(){
        return foodServices;
    }

    /**
     * Get the class that contains all API methods for the awards
     * @return {@link Awards}
     */
    public Awards getAwards(){
        return awards;
    }

    /**
     * Get the class that contains all API methods for the events;
     * @return {@link Events}
     */
    public Events getEvents(){
        return events;
    }
}
