package com.endercrest.uwaterlooapi;

import com.endercrest.uwaterlooapi.awards.AwardsAPI;
import com.endercrest.uwaterlooapi.courses.CoursesAPI;
import com.endercrest.uwaterlooapi.events.EventsAPI;
import com.endercrest.uwaterlooapi.feds.FedsAPI;
import com.endercrest.uwaterlooapi.foodservices.FoodServicesAPI;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 *
 * Primary class in charge of all the University of Waterloo API methods.
 */
public class UWaterlooAPI {

    private final CoursesAPI coursesAPI;
    private final FedsAPI fedsAPI;
    private final FoodServicesAPI foodServicesAPI;
    private final AwardsAPI awards;
    private final EventsAPI eventsAPI;

    public UWaterlooAPI(String apiKey){
        coursesAPI = new CoursesAPI(apiKey);
        fedsAPI = new FedsAPI(apiKey);
        foodServicesAPI = new FoodServicesAPI(apiKey);
        awards = new AwardsAPI(apiKey);
        eventsAPI = new EventsAPI(apiKey);
    }

    /**
     * Get the class that contains all API methods for classes.
     * @return {@link CoursesAPI} containing api methods.
     */
    public CoursesAPI getCoursesAPI() {
        return coursesAPI;
    }

    /**
     * Get the class that contains all API methods for the FEDS.
     * @return {@link FedsAPI} containing api methods.
     */
    public FedsAPI getFedsAPI(){
        return fedsAPI;
    }

    /**
     * Get the class that contains all API methods for the Food Services
     * @return {@link FoodServicesAPI}
     */
    public FoodServicesAPI getFoodServicesAPI(){
        return foodServicesAPI;
    }

    /**
     * Get the class that contains all API methods for the awards
     * @return {@link AwardsAPI}
     */
    public AwardsAPI getAwards(){
        return awards;
    }

    /**
     * Get the class that contains all API methods for the eventsAPI;
     * @return {@link EventsAPI}
     */
    public EventsAPI getEventsAPI(){
        return eventsAPI;
    }
}
