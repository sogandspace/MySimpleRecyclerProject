package com.example.mysimplerecyclerproject.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mysimplerecyclerproject.R;
import com.example.mysimplerecyclerproject.model.Job;
import com.example.mysimplerecyclerproject.viewModel.MyViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyViewModel mMyViewModel;
    private JobAdapter mJobAdapter;
    private List<Job> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        mRecyclerView = findViewById(R.id.rvList);

//        JobAdapter adapter = new JobAdapter(MainActivity.this, );
        mRecyclerView.setAdapter(mJobAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mMyViewModel.requestData();

        mMyViewModel.recievedData().observe(this, new Observer<List<Job>>() {
            @Override
            public void onChanged(List<Job> jobs) {
                mJobAdapter.setData(jobs);
            }
        });
    }
}
