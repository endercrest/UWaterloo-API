package com.endercrest.uwaterlooapi.courses.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class CourseDates {

    @SerializedName("start_time")
    private String startTime;
    @SerializedName("end_time")
    private String endTime;
    private String weekdays;
    @SerializedName("start_date")
    private String startDate;
    @SerializedName("end_date")
    private String endDate;
    @SerializedName("is_tba")
    private Boolean isTba;
    @SerializedName("is_cancelled")
    private Boolean isCancelled;
    @SerializedName("is_closed")
    private Boolean isClosed;
}
