package com.example.mysimplerecyclerproject.model;

public class Job {
    private String mName, mAddress;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public Job(String name, String address) {
        mName = name;
        mAddress = address;
    }
}
