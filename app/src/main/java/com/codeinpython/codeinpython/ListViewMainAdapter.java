package com.codeinpython.codeinpython;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewMainAdapter extends ArrayAdapter<ListViewMainClass> {

    public ListViewMainAdapter(Context context, ArrayList<ListViewMainClass> listViewMainClassArrayList) {
        super(context, 0, listViewMainClassArrayList);
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListViewMainClass currentListViewMainClass = getItem(position);
        View view = convertView;

        if(view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_element_main,parent,false);
        }

        TextView titleTextView = (TextView)view.findViewById(R.id.titleTextView);
        titleTextView.setText(currentListViewMainClass.getTitle());

        ImageView icon = (ImageView)view.findViewById(R.id.titleicon);
        icon.setImageResource(currentListViewMainClass.getIcon());

        TextView descTextView = (TextView)view.findViewById(R.id.descriptionListMain);
        descTextView.setText(currentListViewMainClass.getDescription());

        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.linearlayoutMain);
        linearLayout.setBackgroundColor(currentListViewMainClass.getBgcolor());

            return view;
    }
}
