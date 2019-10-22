package com.example.mysimplerecyclerproject.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.mysimplerecyclerproject.model.Job;
import com.example.mysimplerecyclerproject.model.Repo;

public class MyViewModel extends AndroidViewModel {

    private MutableLiveData<Job> mData;
    private Repo mRepo;

    public MyViewModel(@NonNull Application application) {
        super(application);
        mData = new MutableLiveData<>();
        mRepo = Repo.getInstance();
    }

    public void requestData(Job job) {
         mRepo.getJob(new )

    }

    public MutableLiveData<Job> recievedData() {
        return mData;
    }

}
