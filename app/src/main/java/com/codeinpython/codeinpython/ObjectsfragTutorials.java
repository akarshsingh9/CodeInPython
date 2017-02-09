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


public class ObjectsfragTutorials extends Fragment {
    public ObjectsfragTutorials() {
        super();
    }

    public static ObjectsfragTutorials newInstance(int imgID, String heading, String article, String code, String subarticle, String output, String subsub) {

        Bundle args = new Bundle();
        args.putInt("imageID",imgID);
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
        ImageView image1 = (ImageView)v.findViewById(R.id.bannerfrag5);
        image1.setImageResource(getArguments().getInt("imageID"));
        //set the text for textview extract the arguments
        TextView heading1 = (TextView)v.findViewById(R.id.headingfrag5);
        heading1.setText(getArguments().getString("headingValue"));

        TextView content1 = (TextView)v.findViewById(R.id.articlefrag5);
        String var = getArguments().getString("contentValue");
        content1.setText(Html.fromHtml(var));

        TextView code1 = (TextView)v.findViewById(R.id.codefrag5);
        String codev = getArguments().getString("codeValue");
        code1.setText(Html.fromHtml(codev));

        TextView output1 = (TextView)v.findViewById(R.id.outputfrag5);
        String opv = getArguments().getString("outputValue");
        output1.setText(Html.fromHtml(opv));


        TextView subarticle1 = (TextView)v.findViewById(R.id.subarticlefrag5);
        String subcontent = getArguments().getString("subcontent");
        subarticle1.setText(Html.fromHtml(subcontent));

        TextView subsub1 = (TextView)v.findViewById(R.id.subsubfrag5);
        String subsub = getArguments().getString("subsub");
        subsub1.setText(Html.fromHtml(subsub));
        return v;
    }
}
