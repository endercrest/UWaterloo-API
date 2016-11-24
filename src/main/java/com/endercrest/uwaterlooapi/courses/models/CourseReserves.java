package com.endercrest.uwaterlooapi.courses.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class CourseReserves {

    @SerializedName("reserve_group")
    private String reserveGroup;
    @SerializedName("enrollment_capacity")
    private int enrollmentCapacity;
    @SerializedName("enrollment_total")
    private int enrollmentTotal;

    public String getReserveGroup() {
        return reserveGroup;
    }

    public void setReserveGroup(String reserveGroup) {
        this.reserveGroup = reserveGroup;
    }

    public int getEnrollmentCapacity() {
        return enrollmentCapacity;
    }

    public void setEnrollmentCapacity(int enrollmentCapacity) {
        this.enrollmentCapacity = enrollmentCapacity;
    }

    public int getEnrollmentTotal() {
        return enrollmentTotal;
    }

    public void setEnrollmentTotal(int enrollmentTotal) {
        this.enrollmentTotal = enrollmentTotal;
    }
}
