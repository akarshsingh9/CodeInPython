package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class minfragActivity extends Fragment {

    //empty constructor
    public minfragActivity() {
        super();
    }

    //applying arguments using newInstance
    public static minfragActivity newInstance(int imgID,String heading, String content) {
        //using bundle type arguments
        Bundle args = new Bundle();
        //initialising arguments key, value pair
        args.putInt("imageID",imgID);
        args.putString("headingValue",heading);
        args.putString("contentValue",content);
        minfragActivity fragment = new minfragActivity();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflate view in onCreateView
        //initialize and setText or image in in this method
        View v = inflater.inflate(R.layout.activity_minfrag,container,false);
        //set image for the banner with setImageResource method
        //extract arguments passed here and use the method
        ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag1);
        image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag1);
        heading1.setText(getArguments().getString("headingValue"));

        TextView content1 = (TextView)v.findViewById(R.id.articlefrag1);
        String var = getArguments().getString("contentValue");
        content1.setText(Html.fromHtml(var));

        return v;
    }
}
