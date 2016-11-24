package com.endercrest.uwaterlooapi.courses.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 */
public class CourseOfferings {

    private Boolean online;
    @SerializedName("online_only")
    private Boolean onlineOnly;
    @SerializedName("st_jerome")
    private Boolean stJerome;
    @SerializedName("st_jerome_only")
    private Boolean stJeromeOnly;
    private Boolean renison;
    @SerializedName("renison_only")
    private Boolean renisonOnly;
    @SerializedName("conrad_grebel")
    private Boolean conradGrebel;
    @SerializedName("conrad_grebel_only")
    private Boolean conradGrebelOnly;

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public Boolean getStJerome() {
        return stJerome;
    }

    public void setStJerome(Boolean stJerome) {
        this.stJerome = stJerome;
    }

    public Boolean getStJeromeOnly() {
        return stJeromeOnly;
    }

    public void setStJeromeOnly(Boolean stJeromOnly) {
        this.stJeromeOnly = stJeromOnly;
    }

    public Boolean getRenison() {
        return renison;
    }

    public void setRenison(Boolean renison) {
        this.renison = renison;
    }

    public Boolean getRenisonOnly() {
        return renisonOnly;
    }

    public void setRenisonOnly(Boolean renisonOnly) {
        this.renisonOnly = renisonOnly;
    }

    public Boolean getConradGrebel() {
        return conradGrebel;
    }

    public void setConradGrebel(Boolean conradGrebel) {
        this.conradGrebel = conradGrebel;
    }

    public Boolean getConradGrebelOnly() {
        return conradGrebelOnly;
    }

    public void setConradGrebelOnly(Boolean conradGrebelOnly) {
        this.conradGrebelOnly = conradGrebelOnly;
    }
}
