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

public class tilloutputfragActivity extends Fragment {

    public tilloutputfragActivity() {
        super();
    }

    public static tilloutputfragActivity newInstance(int imgID, String heading, String article, String code, String output) {

        Bundle args = new Bundle();
        args.putInt("imageID",imgID);
        args.putString("headingValue",heading);
        args.putString("contentValue",article);
        args.putString("codeValue",code);
        args.putString("outputValue",output);
        tilloutputfragActivity fragment = new tilloutputfragActivity();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_tilloutputfrag,container,false);
        ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag3);
        image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag3);
        heading1.setText(getArguments().getString("headingValue"));

        TextView content1 = (TextView)v.findViewById(R.id.articlefrag3);
        String var = getArguments().getString("contentValue");
        content1.setText(Html.fromHtml(var));

        TextView code1 = (TextView)v.findViewById(R.id.codefrag3);
        String codev = getArguments().getString("codeValue");
        code1.setText(Html.fromHtml(codev));

        TextView output1 = (TextView)v.findViewById(R.id.outputfrag3);
        String opv = getArguments().getString("outputValue");
        output1.setText(Html.fromHtml(opv));

        return v;
    }
}
