package com.endercrest.uwaterlooapi.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thomas Cordua-von Specht on 12/6/2016.
 */
public class ApiUsage {

    private String name;
    @SerializedName("api_key")
    private String apiKey;
    @SerializedName("monthly_calls")
    private String monthlyCalls;
    @SerializedName("total_calls")
    private String totalCalls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMonthlyCalls() {
        return monthlyCalls;
    }

    public void setMonthlyCalls(String monthlyCalls) {
        this.monthlyCalls = monthlyCalls;
    }

    public String getTotalCalls() {
        return totalCalls;
    }

    public void setTotalCalls(String totalCalls) {
        this.totalCalls = totalCalls;
    }
}
