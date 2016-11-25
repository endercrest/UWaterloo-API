package com.endercrest.uwaterlooapi.feds.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/25/2016.<br>
 *
 *  All information for a single location ran by the federation of students.
 */
public class FedLocation {

    @SerializedName("outlet_id")
    private int outletId;
    @SerializedName("outlet_name")
    private String outletName;
    private String building;
    private String logo;
    private float latitude;
    private float longitude;
    private String description;
    private String notice;
    @SerializedName("is_open_now")
    private boolean isOpenNow;
    @SerializedName("opening_hours")
    private FedOpenHours openingHours;
    @SerializedName("special_hours")
    private List<FedSpecialDay> specialHours;
    @SerializedName("dates_closed")
    private List<String> datesClosed;
    private FedAdditional additional;

    public class FedOpenHours{

        private FedDay sunday;
        private FedDay monday;
        private FedDay tuesday;
        private FedDay wednesday;
        private FedDay thursday;
        private FedDay friday;
        private FedDay saturday;

        public FedDay getSunday() {
            return sunday;
        }

        public void setSunday(FedDay sunday) {
            this.sunday = sunday;
        }

        public FedDay getMonday() {
            return monday;
        }

        public void setMonday(FedDay monday) {
            this.monday = monday;
        }

        public FedDay getTuesday() {
            return tuesday;
        }

        public void setTuesday(FedDay tuesday) {
            this.tuesday = tuesday;
        }

        public FedDay getWednesday() {
            return wednesday;
        }

        public void setWednesday(FedDay wednesday) {
            this.wednesday = wednesday;
        }

        public FedDay getThursday() {
            return thursday;
        }

        public void setThursday(FedDay thursday) {
            this.thursday = thursday;
        }

        public FedDay getFriday() {
            return friday;
        }

        public void setFriday(FedDay friday) {
            this.friday = friday;
        }

        public FedDay getSaturday() {
            return saturday;
        }

        public void setSaturday(FedDay saturday) {
            this.saturday = saturday;
        }
    }

    public class FedDay{

        @SerializedName("opening_hour")
        private String openingHour;
        @SerializedName("closing_hour")
        private String closingHour;
        @SerializedName("is_closed")
        private boolean isClosed;

        public String getOpeningHour() {
            return openingHour;
        }

        public void setOpeningHour(String openingHour) {
            this.openingHour = openingHour;
        }

        public String getClosingHour() {
            return closingHour;
        }

        public void setClosingHour(String closingHour) {
            this.closingHour = closingHour;
        }

        public boolean isClosed() {
            return isClosed;
        }

        public void setClosed(boolean closed) {
            isClosed = closed;
        }
    }

    public class FedSpecialDay{

        private String date;
        @SerializedName("opening_hour")
        private String openingHour;
        @SerializedName("closing_hour")
        private String closingHour;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOpeningHour() {
            return openingHour;
        }

        public void setOpeningHour(String openingHour) {
            this.openingHour = openingHour;
        }

        public String getClosingHour() {
            return closingHour;
        }

        public void setClosingHour(String closingHour) {
            this.closingHour = closingHour;
        }
    }

    public class FedAdditional{

        @SerializedName("menu_url")
        private String menuUrl;

        public String getMenuUrl() {
            return menuUrl;
        }

        public void setMenuUrl(String menuUrl) {
            this.menuUrl = menuUrl;
        }
    }
}
