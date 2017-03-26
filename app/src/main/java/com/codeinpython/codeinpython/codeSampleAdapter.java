package com.codeinpython.codeinpython;


import android.annotation.SuppressLint;
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

public class codeSampleAdapter extends RecyclerView.Adapter<codeSampleAdapter.codeSampleViewHolder>{

    private List<codeSampleClass>codeSampleClassList;

    public class codeSampleViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView codeImage;
        public TextView codeTitle;
        private CardView codeCardView;
        public codeSampleViewHolder(View view)
        {
            super(view);
            codeImage = (ImageView)view.findViewById(R.id.codesampleImage);
            codeTitle = (TextView)view.findViewById(R.id.codeSampleTitle);
            codeCardView = (CardView)view.findViewById(R.id.codesampleCardView);

        }
    }

    public codeSampleAdapter(Context context, List<codeSampleClass> codeTopicList)
    {
        Context mContext = context;
        this.codeSampleClassList = codeTopicList;
    }

    @Override
    public codeSampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.code_sample_card_element,parent,false);

        return new codeSampleViewHolder(itemList);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(codeSampleViewHolder holder, final int position) {
        codeSampleClass sampleClass = codeSampleClassList.get(position);
        holder.codeImage.setImageResource(sampleClass.getCodeImage());
        holder.codeTitle.setText(sampleClass.getCodeTitle());
        holder.codeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(v.getContext(),codeSampleActivity.class);
                        intent.putExtra("codePosition",position);
                        v.getContext().startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent1.putExtra("codePosition",position);
                        v.getContext().startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent2.putExtra("codePosition",position);
                        v.getContext().startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent3.putExtra("codePosition",position);
                        v.getContext().startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent4.putExtra("codePosition",position);
                        v.getContext().startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent5.putExtra("codePosition",position);
                        v.getContext().startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent6.putExtra("codePosition",position);
                        v.getContext().startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent7.putExtra("codePosition",position);
                        v.getContext().startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent8.putExtra("codePosition",position);
                        v.getContext().startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent9.putExtra("codePosition",position);
                        v.getContext().startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(v.getContext(),codeSampleActivity.class);
                        intent10.putExtra("codePosition",position);
                        v.getContext().startActivity(intent10);
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return codeSampleClassList.size();
    }
}
