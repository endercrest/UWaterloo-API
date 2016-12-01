package com.endercrest.uwaterlooapi.base.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/27/2016.
 */
public class UWLocation {

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
    private LocationOpenHours openingHours;
    @SerializedName("special_hours")
    private List<LocationSpecialDay> specialHours;
    @SerializedName("dates_closed")
    private List<String> datesClosed;

    public int getOutletId() {
        return outletId;
    }

    public void setOutletId(int outletId) {
        this.outletId = outletId;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public boolean isOpenNow() {
        return isOpenNow;
    }

    public void setOpenNow(boolean openNow) {
        isOpenNow = openNow;
    }

    public LocationOpenHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(LocationOpenHours openingHours) {
        this.openingHours = openingHours;
    }

    public List<LocationSpecialDay> getSpecialHours() {
        return specialHours;
    }

    public void setSpecialHours(List<LocationSpecialDay> specialHours) {
        this.specialHours = specialHours;
    }

    public List<String> getDatesClosed() {
        return datesClosed;
    }

    public void setDatesClosed(List<String> datesClosed) {
        this.datesClosed = datesClosed;
    }

    public class LocationOpenHours{

        private LocationDay sunday;
        private LocationDay monday;
        private LocationDay tuesday;
        private LocationDay wednesday;
        private LocationDay thursday;
        private LocationDay friday;
        private LocationDay saturday;

        public LocationDay getSunday() {
            return sunday;
        }

        public void setSunday(LocationDay sunday) {
            this.sunday = sunday;
        }

        public LocationDay getMonday() {
            return monday;
        }

        public void setMonday(LocationDay monday) {
            this.monday = monday;
        }

        public LocationDay getTuesday() {
            return tuesday;
        }

        public void setTuesday(LocationDay tuesday) {
            this.tuesday = tuesday;
        }

        public LocationDay getWednesday() {
            return wednesday;
        }

        public void setWednesday(LocationDay wednesday) {
            this.wednesday = wednesday;
        }

        public LocationDay getThursday() {
            return thursday;
        }

        public void setThursday(LocationDay thursday) {
            this.thursday = thursday;
        }

        public LocationDay getFriday() {
            return friday;
        }

        public void setFriday(LocationDay friday) {
            this.friday = friday;
        }

        public LocationDay getSaturday() {
            return saturday;
        }

        public void setSaturday(LocationDay saturday) {
            this.saturday = saturday;
        }
    }

    public class LocationDay{

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

    public class LocationSpecialDay{

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
}
