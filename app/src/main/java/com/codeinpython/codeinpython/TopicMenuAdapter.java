package com.codeinpython.codeinpython;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TopicMenuAdapter extends RecyclerView.Adapter<TopicMenuAdapter.ViewHolder> {

    private List<TopicFullCardClass>topicFullCardClassList;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(View view)
        {
            super(view);
            textView = (TextView)view.findViewById(R.id.topicCardText);
            imageView = (ImageView)view.findViewById(R.id.topicIcon);
        }
    }

    public TopicMenuAdapter(Context context,List<TopicFullCardClass> topicFullCardClassList) {
        this.context =context;
        this.topicFullCardClassList = topicFullCardClassList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.topicsfullmenu_cardrecyler, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TopicFullCardClass topicFullCardClass = topicFullCardClassList.get(position);
        holder.imageView.setImageResource(topicFullCardClass.getmTopicImage());
        holder.textView.setText(topicFullCardClass.getmTitle());
    }

    @Override
    public int getItemCount() {
        return topicFullCardClassList.size();
    }
}
