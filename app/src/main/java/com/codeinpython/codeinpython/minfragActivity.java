package com.codeinpython.codeinpython;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class minfragActivity extends Fragment {

    //empty constructor
    public minfragActivity() {
        super();
    }

    //applying arguments using newInstance
    public static minfragActivity newInstance(String heading, String content, int isNext, int caseno) {
        //using bundle type arguments
        Bundle args = new Bundle();
        //initialising arguments key, value pair
       // args.putInt("imageID",imgID);
        args.putString("headingValue",heading);
        args.putString("contentValue",content);
        args.putInt("yup",isNext);
        args.putInt("caseno",caseno);
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
        //ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag1);
        //image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag1);
        heading1.setText(getArguments().getString("headingValue"));

        //TextView content1 = (TextView)v.findViewById(R.id.articlefrag1);
        String var = getArguments().getString("contentValue");
        //content1.setText(Html.fromHtml(var));
        WebView webView = (WebView)v.findViewById(R.id.articlefrag1);
        WebSettings webSettings = webView.getSettings();
        webSettings.setDefaultFontSize(16);
        webView.setBackgroundColor(Color.parseColor("#EEEEEE"));
        webView.loadData(var,"text/html","UTF-8");

        Button next = (Button)v.findViewById(R.id.nextpage1);
        LinearLayout slide = (LinearLayout)v.findViewById(R.id.slidenext);

        int decide = getArguments().getInt("yup");
        int casetitle = getArguments().getInt("caseno");

        if(decide == 1)
        {
            slide.setVisibility(View.GONE);
            next.setVisibility(View.VISIBLE);
        }
        //do next visibility check then onclicklistner

        if(next.getVisibility()==View.VISIBLE)
        {
            switch (casetitle)
            {
                case 1:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'a'); // intro to prog
                            startActivity(intent);
                        }
                    });
                    break;
                case 2:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'b'); //installing python
                            startActivity(intent);
                        }
                    });
                    break;
                case 4:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'d'); //operators
                            startActivity(intent);
                        }
                    });
                    break;
                case 9:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'i'); //oops
                            startActivity(intent);
                        }
                    });
                    break;



            }


        }


        return v;
    }
}
