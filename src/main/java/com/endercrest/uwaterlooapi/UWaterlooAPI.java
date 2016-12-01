package com.endercrest.uwaterlooapi;

import com.endercrest.uwaterlooapi.awards.AwardsAPI;
import com.endercrest.uwaterlooapi.blogs.BlogsAPI;
import com.endercrest.uwaterlooapi.courses.CoursesAPI;
import com.endercrest.uwaterlooapi.events.EventsAPI;
import com.endercrest.uwaterlooapi.feds.FedsAPI;
import com.endercrest.uwaterlooapi.foodservices.FoodServicesAPI;
import com.endercrest.uwaterlooapi.news.NewsAPI;
import com.endercrest.uwaterlooapi.opportunities.OpportunitiesAPI;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 *
 * Primary class in charge of all the University of Waterloo API methods.
 */
public class UWaterlooAPI {

    private final CoursesAPI coursesAPI;
    private final FedsAPI fedsAPI;
    private final FoodServicesAPI foodServicesAPI;
    private final AwardsAPI awardsAPI;
    private final EventsAPI eventsAPI;
    private final BlogsAPI blogsAPI;
    private final NewsAPI newsAPI;
    private final OpportunitiesAPI opportunitiesAPI;

    public UWaterlooAPI(String apiKey){
        coursesAPI = new CoursesAPI(apiKey);
        fedsAPI = new FedsAPI(apiKey);
        foodServicesAPI = new FoodServicesAPI(apiKey);
        awardsAPI = new AwardsAPI(apiKey);
        eventsAPI = new EventsAPI(apiKey);
        blogsAPI = new BlogsAPI(apiKey);
        newsAPI = new NewsAPI(apiKey);
        opportunitiesAPI = new OpportunitiesAPI(apiKey);
    }

    /**
     * Get the class that contains all API methods for classes.
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/courses">Waterloo Courses Docs!</a>
     * @return {@link CoursesAPI} containing api methods.
     */
    public CoursesAPI getCoursesAPI() {
        return coursesAPI;
    }

    /**
     * Get the class that contains all API methods for the FEDS.
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/feds">Waterloo Feds Docs!</a>
     * @return {@link FedsAPI} containing api methods.
     */
    public FedsAPI getFedsAPI(){
        return fedsAPI;
    }

    /**
     * Get the class that contains all API methods for the Food Services
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/foodservices">Waterloo Food Services Docs!</a>
     * @return {@link FoodServicesAPI}
     */
    public FoodServicesAPI getFoodServicesAPI(){
        return foodServicesAPI;
    }

    /**
     * Get the class that contains all API methods for the awards
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/awards">Waterloo Awards Docs!</a>
     * @return {@link AwardsAPI}
     */
    public AwardsAPI getAwards(){
        return awardsAPI;
    }

    /**
     * Get the class that contains all API methods for the eventsAPI;
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/events">Waterloo Events Docs!</a>
     * @return {@link EventsAPI}
     */
    public EventsAPI getEventsAPI(){
        return eventsAPI;
    }

    /**
     * Get the class that contains all API methods for the blogsAPI
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/blogs">Waterloo Blogs Docs!</a>
     * @return {@link BlogsAPI}
     */
    public BlogsAPI getBlogsAPI(){
        return blogsAPI;
    }

    /**
     * Get the class that contains all API methods for the newsAPI.
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/news">Waterloo News Docs!</a>
     * @return {@link NewsAPI}
     */
    public NewsAPI getNewsAPI(){
        return newsAPI;
    }

    /**
     * Get the class that contains all API methods for the opportunitiesAPI.
     * @see <a href="https://github.com/uWaterloo/api-documentation/tree/master/v2/opportunities">Waterloo Opportunities Docs!</a>
     * @return {@link OpportunitiesAPI}
     */
    public OpportunitiesAPI getOpportunitiesAPI(){
        return opportunitiesAPI;
    }
}
