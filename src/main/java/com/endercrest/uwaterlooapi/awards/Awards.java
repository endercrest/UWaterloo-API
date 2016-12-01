package com.endercrest.uwaterlooapi.awards;

import com.endercrest.uwaterlooapi.api.ApiRequest;
import com.endercrest.uwaterlooapi.awards.models.AwardGraduate;
import com.endercrest.uwaterlooapi.awards.models.AwardUndergraduate;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 12/1/2016.
 */
public class Awards {

    private static final String GRADUATE_AWARD_ENDPOINT = "awards/graduate";
    private static final String UNDERGRADUATE_AWARD_ENDPOINT = "awards/undergraduate";

    private final String api;

    public Awards(String api){
        this.api = api;
    }

    /**
     * Return a list of all graduate awards, bursaries, and scholarships.
     * @return {@link AwardGraduate}
     */
    public ApiRequest<List<AwardGraduate>> getAllGraduateAwards(){
        return ApiRequest.createApiRequest(GRADUATE_AWARD_ENDPOINT, api,
                new TypeToken<ApiRequest<List<AwardGraduate>>>(){}.getType());
    }

    /**
     * Return a list of all undergraduate awards, bursaries, and scholarships.
     * @return {@link AwardUndergraduate}
     */
    public ApiRequest<List<AwardUndergraduate>> getAllUndergraduateAwards(){
        return ApiRequest.createApiRequest(GRADUATE_AWARD_ENDPOINT, api,
                new TypeToken<ApiRequest<List<AwardUndergraduate>>>(){}.getType());
    }

}
