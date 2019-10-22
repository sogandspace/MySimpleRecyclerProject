package com.example.mysimplerecyclerproject.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysimplerecyclerproject.R;
import com.example.mysimplerecyclerproject.model.Job;

import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    private List<Job> mData;

    public JobAdapter(){

    }

    public void setData(List<Job> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JobAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent
                ,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobAdapter.ViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData!= null ? mData.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTvName, mTvAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvName = itemView.findViewById(R.id.tvName);
            mTvAddress = itemView.findViewById(R.id.tvAddress);
        }

        public void bind(Job job) {
            mTvName.setText(job.getName());
            mTvAddress.setText(job.getAddress());
        }
    }
}
