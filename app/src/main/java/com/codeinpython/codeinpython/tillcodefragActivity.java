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

public class tillcodefragActivity extends Fragment {

    //constructor
    public tillcodefragActivity() {
        super();
    }

    public static tillcodefragActivity newInstance(String heading, String article, String code, String subarticle, int isNext, int caseno) {

        Bundle args = new Bundle();
        //args.putInt("imageID",imgID);
        args.putString("headingValue",heading);
        args.putString("contentValue",article);
        args.putString("codeValue",code);
        args.putString("subarticle",subarticle);
        args.putInt("yup",isNext);
        args.putInt("caseno",caseno);
        tillcodefragActivity fragment = new tillcodefragActivity();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_tillcodefrag,container,false);
        //ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag2);
        //image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag2);
        heading1.setText(getArguments().getString("headingValue"));

        TextView content1 = (TextView)v.findViewById(R.id.articlefrag2);
        String var = getArguments().getString("contentValue");
        //noinspection deprecation
        content1.setText(Html.fromHtml(var));

        TextView code1 = (TextView)v.findViewById(R.id.codefrag2);
        String codev = getArguments().getString("codeValue");
        //noinspection deprecation
        code1.setText(Html.fromHtml(codev));

        TextView subcontent = (TextView)v.findViewById(R.id.subarticlefrag2);
        String var1 = getArguments().getString("subarticle");
        //noinspection deprecation
        subcontent.setText(Html.fromHtml(var1));

        Button next = (Button)v.findViewById(R.id.nextpage2);
        LinearLayout slider = (LinearLayout)v.findViewById(R.id.slidenextcodefrag);

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
                case 11:
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                            intent.putExtra("title",'j'); //exception handling
                            startActivity(intent);
                        }
                    });
                    break;
            }
        }

        return v;
    }
}
