package com.endercrest.uwaterlooapi.courses;

import com.endercrest.uwaterlooapi.api.ApiRequest;
import com.endercrest.uwaterlooapi.courses.models.CourseMinimal;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 */
public class Courses {

    private static final String COURSE_LIST_ENDPOINT = "courses";


    private final String api;

    public Courses(String api) {
        this.api = api;
    }

    /**
     * Retrieves all courses from "/courses"
     * @return Returns a list of more than 6000 courses.
     */
    public ApiRequest<List<CourseMinimal>> getAllCourses(){
        return ApiRequest.createApiRequest(COURSE_LIST_ENDPOINT, api, new TypeToken<ApiRequest<List<CourseMinimal>>>() {}.getType());
    }

    //public ApiRequest<>

}
