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
import android.widget.TextView;


public class ObjectsfragTutorials extends Fragment {
    public ObjectsfragTutorials() {
        super();
    }

    public static ObjectsfragTutorials newInstance(String heading, String article, String code, String subarticle, String output, String subsub) {

        Bundle args = new Bundle();
        //args.putInt("imageID",imgID);
        args.putString("headingValue",heading);
        args.putString("contentValue",article);
        args.putString("codeValue",code);
        args.putString("subcontent",subarticle);
        args.putString("outputValue",output);
        args.putString("subsub",subsub);
        ObjectsfragTutorials fragment = new ObjectsfragTutorials();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.objectsfrag_tutorials,container,false);
        //ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag5);
        //image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag5);
        heading1.setText(getArguments().getString("headingValue"));

        TextView content1 = (TextView)v.findViewById(R.id.articlefrag5);
        String var = getArguments().getString("contentValue");
        //noinspection deprecation
        content1.setText(Html.fromHtml(var));

        TextView code1 = (TextView)v.findViewById(R.id.codefrag5);
        String codev = getArguments().getString("codeValue");
        //noinspection deprecation
        code1.setText(Html.fromHtml(codev));

        TextView output1 = (TextView)v.findViewById(R.id.outputfrag5);
        String opv = getArguments().getString("outputValue");
        //noinspection deprecation
        output1.setText(Html.fromHtml(opv));


        TextView subarticle1 = (TextView)v.findViewById(R.id.subarticlefrag5);
        String subcontent = getArguments().getString("subcontent");
        //noinspection deprecation
        subarticle1.setText(Html.fromHtml(subcontent));

        TextView subsub1 = (TextView)v.findViewById(R.id.subsubfrag5);
        String subsub = getArguments().getString("subsub");
        //noinspection deprecation
        subsub1.setText(Html.fromHtml(subsub));

        Button next = (Button)v.findViewById(R.id.objfragnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),TutorialsFinishedActivity.class);
                intent.putExtra("title",'o');// classes and objects
                startActivity(intent);
            }
        });

        return v;
    }
}
