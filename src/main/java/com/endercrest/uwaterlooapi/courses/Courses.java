package com.endercrest.uwaterlooapi.courses;

import com.endercrest.uwaterlooapi.api.ApiRequest;
import com.endercrest.uwaterlooapi.courses.models.CourseBase;
import com.endercrest.uwaterlooapi.courses.models.CourseFull;
import com.endercrest.uwaterlooapi.courses.models.Course;
import com.endercrest.uwaterlooapi.courses.models.CourseSchedule;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 */
public class Courses {

    private static final String COURSE_LIST_ENDPOINT = "courses";
    private static final String COURSE_SUBJECT__ENDPOINT = "courses/%s";
    private static final String COURSE_COURSE_ID_ENDPOINT = "courses/%s";
    private static final String COURSE_SCHEDULE_COURSE_NUMBER_ENDPOINT = "courses/%s/schedule";

    private final String api;

    public Courses(String api) {
        this.api = api;
    }

    /**
     * Retrieves all courses from "/courses"
     * @return Returns a list of more than 6000 courses.
     */
    public ApiRequest<List<CourseBase>> getAllCourses(){
        return ApiRequest.createApiRequest(COURSE_LIST_ENDPOINT, api, new TypeToken<ApiRequest<List<CourseBase>>>() {}.getType());
    }

    /**
     * Retrieves all the courses with a specific subject from "/courses/{subject}
     * @param subject The string subject of the course.
     * @return List of Course's that all have the same subject.
     */
    public ApiRequest<List<Course>> getCourseBySubject(String subject){
        return ApiRequest.createApiRequest(String.format(COURSE_SUBJECT__ENDPOINT, subject), api, new TypeToken<ApiRequest<List<Course>>>(){}.getType());
    }

    /**
     * Retrieve all specific information for a single course by retrieving it by its courseId
     * from "/courses/{courseId}
     * @param courseId The specific courseId
     * @return Contains all information of the specific course.
     */
    public ApiRequest<CourseFull> getCourseByCourseId(String courseId){
        return ApiRequest.createApiRequest(String.format(COURSE_COURSE_ID_ENDPOINT, courseId), api, new TypeToken<ApiRequest<CourseFull>>(){}.getType());
    }

    /**
     * Retrieve the course schedule using the class number.
     * @param classNumber The class number for the specific schedule.
     * @return Contains a list of the classes schedule.
     */
    public ApiRequest<List<CourseSchedule>> getCourseScheduleByClassNumber(String classNumber){
        return ApiRequest.createApiRequest(String.format(COURSE_SCHEDULE_COURSE_NUMBER_ENDPOINT, classNumber), api, new TypeToken<ApiRequest<List<CourseSchedule>>>(){}.getType());
    }

    /**
     * Retrieve the course schedule using the class number.
     * @param classNumber The class number for the specific schedule.
     * @param term Grab the schedule for a specific term.
     * @return Term specified course schedule.
     */
    public ApiRequest<List<CourseSchedule>> getCourseScheduleByClassNumber(String classNumber, String term){
        return ApiRequest.createApiRequest(String.format(COURSE_SCHEDULE_COURSE_NUMBER_ENDPOINT, classNumber), api, "term="+term,
                new TypeToken<ApiRequest<List<CourseSchedule>>>(){}.getType());
    }

}
