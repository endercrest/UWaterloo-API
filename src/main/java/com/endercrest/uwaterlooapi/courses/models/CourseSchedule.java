package com.endercrest.uwaterlooapi.courses.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class CourseSchedule {

    private String subject;
    @SerializedName("catalog_number")
    private String catalogNumber;
    private Double units;
    private String title;
    private String note;
    @SerializedName("class_number")
    private int classNumber;
    private String section;
    private String campus;
    @SerializedName("associated_class")
    private int associatedClass;
    @SerializedName("related_component_1")
    private String relatedComponent1;
    @SerializedName("related_component_2")
    private String relatedComponent2;
    @SerializedName("enrollment_capacity")
    private int enrollmentCapacity;
    @SerializedName("enrollment_total")
    private int enrollmentTotal;
    @SerializedName("waiting_capacity")
    private int waitingCapacity;
    @SerializedName("waiting_total")
    private int waitingTotal;
    private String total;
    private List<CourseReserves> reserves;
    @SerializedName("classes")
    private List<CourseScheduleData> schedules;
    @SerializedName("held_with")
    private List<String> heldWith;
    private int term;
    @SerializedName("academic_level")
    private String academicLevel;
    @SerializedName("last_updated")
    private String lastUpdated;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getAssociatedClass() {
        return associatedClass;
    }

    public void setAssociatedClass(int associatedClass) {
        this.associatedClass = associatedClass;
    }

    public String getRelatedComponent1() {
        return relatedComponent1;
    }

    public void setRelatedComponent1(String relatedComponent1) {
        this.relatedComponent1 = relatedComponent1;
    }

    public String getRelatedComponent2() {
        return relatedComponent2;
    }

    public void setRelatedComponent2(String relatedComponent2) {
        this.relatedComponent2 = relatedComponent2;
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

    public int getWaitingCapacity() {
        return waitingCapacity;
    }

    public void setWaitingCapacity(int waitingCapacity) {
        this.waitingCapacity = waitingCapacity;
    }

    public int getWaitingTotal() {
        return waitingTotal;
    }

    public void setWaitingTotal(int waitingTotal) {
        this.waitingTotal = waitingTotal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<CourseReserves> getReserves() {
        return reserves;
    }

    public void setReserves(List<CourseReserves> reserves) {
        this.reserves = reserves;
    }

    public List<CourseScheduleData> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<CourseScheduleData> schedules) {
        this.schedules = schedules;
    }

    public List<String> getHeldWith() {
        return heldWith;
    }

    public void setHeldWith(List<String> heldWith) {
        this.heldWith = heldWith;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
