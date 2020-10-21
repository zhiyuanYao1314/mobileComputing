package com.example.bluebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<String> stringList;
    private String[] content;
    private String[] time;
    private int[] avatar;

    public RecyclerAdapter(List<String> stringList, String[] content, int[] avatar) {
        this. stringList = stringList;
        this. content = content;
        this. avatar = avatar;
        this. time = time;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.tvTest.setText(stringList.get(position));
        holder.tvContent.setText(content[position]);
        holder. tvAvatar. setImageResource(avatar[position]);
    }


    @Override
    public int getItemCount() {
        return stringList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTest;
        public TextView tvContent;
        public ImageView tvAvatar;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTest = (TextView) itemView.findViewById(R.id.tv_title);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content);
            tvAvatar = (ImageView) itemView.findViewById(R.id.tv_avatar);
        }
    }
}
