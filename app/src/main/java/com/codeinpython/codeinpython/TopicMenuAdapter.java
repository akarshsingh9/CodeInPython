package com.codeinpython.codeinpython;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
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
        public TextView textView, first, second, third, fourth, five, sixth;
        public ImageView imageView;
        private CardView cardView;
        public ViewHolder(View view)
        {
            super(view);
            textView = (TextView)view.findViewById(R.id.topicCardText);
            imageView = (ImageView)view.findViewById(R.id.topicIcon);
            first = (TextView)view.findViewById(R.id.firstitem);
            second = (TextView)view.findViewById(R.id.seconditem);
            third = (TextView)view.findViewById(R.id.thirditem);
            fourth = (TextView)view.findViewById(R.id.fourthitem);
            five = (TextView)view.findViewById(R.id.fiveitem);
            sixth = (TextView)view.findViewById(R.id.sixitem);
            cardView = (CardView)view.findViewById(R.id.topicsCardView);
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
    public void onBindViewHolder(ViewHolder holder, final int position) {
        TopicFullCardClass topicFullCardClass = topicFullCardClassList.get(position);
        holder.imageView.setImageResource(topicFullCardClass.getmTopicImage());
        holder.textView.setText(topicFullCardClass.getmTitle());
        holder.first.setText(topicFullCardClass.getmFirst());
        holder.second.setText(topicFullCardClass.getmSecond());
        holder.third.setText(topicFullCardClass.getmThird());
        holder.fourth.setText(topicFullCardClass.getmFourth());
        holder.five.setText(topicFullCardClass.getmFive());
        holder.sixth.setText(topicFullCardClass.getmSixth());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(v.getContext(),TutorialsActivity.class);
                        intent.putExtra("positions",position);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent1.putExtra("positions",position);
                        v.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent2.putExtra("positions",position);
                        v.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent3.putExtra("positions",position);
                        v.getContext().startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent4.putExtra("positions",position);
                        v.getContext().startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent5.putExtra("positions",position);
                        v.getContext().startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent6.putExtra("positions",position);
                        v.getContext().startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent7.putExtra("positions",position);
                        v.getContext().startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(v.getContext(),TutorialsActivity.class);
                        intent8.putExtra("positions",position);
                        v.getContext().startActivity(intent8);
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return topicFullCardClassList.size();
    }
}
