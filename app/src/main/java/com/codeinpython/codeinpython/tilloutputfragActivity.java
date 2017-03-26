package com.codeinpython.codeinpython;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class tilloutputfragActivity extends Fragment {

    public tilloutputfragActivity() {
        super();
    }

    public static tilloutputfragActivity newInstance(String heading, String article, String code, String output, int isNext, int caseno) {

        Bundle args = new Bundle();
        //args.putInt("imageID",imgID);
        args.putString("headingValue",heading);
        args.putString("contentValue",article);
        args.putString("codeValue",code);
        args.putString("outputValue",output);
        args.putInt("yup",isNext);
        args.putInt("caseno",caseno);
        tilloutputfragActivity fragment = new tilloutputfragActivity();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_tilloutputfrag,container,false);
        //ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag3);
        //image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag3);
        heading1.setText(getArguments().getString("headingValue"));

        TextView content1 = (TextView)v.findViewById(R.id.articlefrag3);
        String var = getArguments().getString("contentValue");
        //noinspection deprecation
        content1.setText(Html.fromHtml(var));

        TextView code1 = (TextView)v.findViewById(R.id.codefrag3);
        String codev = getArguments().getString("codeValue");
        //noinspection deprecation
        code1.setText(Html.fromHtml(codev));

        TextView output1 = (TextView)v.findViewById(R.id.outputfrag3);
        String opv = getArguments().getString("outputValue");
        //noinspection deprecation
        output1.setText(Html.fromHtml(opv));

        Button next = (Button)v.findViewById(R.id.nextpage3);
        LinearLayout slider = (LinearLayout)v.findViewById(R.id.slidenextoutputfrag);

        int decide = getArguments().getInt("yup");
        int casetitle = getArguments().getInt("caseno");

        if(decide == 1)
        {
            slider.setVisibility(View.GONE);
            next.setVisibility(View.VISIBLE);
        }
        //do next visibility check then onclicklistner

        if(next.getVisibility()==View.VISIBLE)
        {
            switch (casetitle)
            {
                case 5:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'e'); //datatypes
                            startActivity(intent);
                        }
                    });
                    break;
                case 6:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'f'); //conditional statement
                            startActivity(intent);
                        }
                    });
                    break;
                case 8:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'h');//Loops
                            startActivity(intent);
                        }
                    });
            }
        }


        return v;
    }
}
