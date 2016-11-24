package com.endercrest.uwaterlooapi;

/**
 * Created by Thomas Cordua-von Specht on 11/23/2016.
 */
public class main {

    public static void main(String[] args){
        UWaterlooAPI api = new UWaterlooAPI("79afda9fe50e1280970a5adb51b45acd");
        //System.out.println(api.getCourses().getAllCourses().getMeta().getMessage());
        System.out.println(api.getCourses().getAllCourses().getData().get(0).getCourseId());
    }
}
