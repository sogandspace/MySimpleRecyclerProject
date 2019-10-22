package com.example.mysimplerecyclerproject.model;

import android.telecom.Call;

import java.util.ArrayList;
import java.util.List;


public class Repo {

    private static Repo mInstance;
    private static List<Job> mJob;

    private Repo() {
        mJob = new ArrayList<>();
        for( int i = 0; i<= 200; i++) {
            Job job = new Job("Name Is : " + i,
                    "Address Is : " + i);
        }
    }

    public static Repo getInstance() {
        if (mInstance == null)
            mInstance = new Repo();
        return mInstance;
    }

//    public List<Job> getJob() {
//        return mJob;
//    }

    public void getJob(){

    }
}