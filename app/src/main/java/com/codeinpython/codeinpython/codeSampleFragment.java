package com.codeinpython.codeinpython;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class codeSampleFragment extends Fragment {


    public codeSampleFragment() {
        // Required empty public constructor
        super();
    }

    RecyclerView codeSampleTopics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_code_sample, container, false);
        codeSampleTopics = (RecyclerView)v.findViewById(R.id.recyclerview_CodeSample);
        codeSampleTopics.setHasFixedSize(true);

        LinearLayoutManager codeLLayout;
        codeLLayout = new LinearLayoutManager(getActivity());
        codeLLayout.setOrientation(LinearLayoutManager.VERTICAL);
        codeSampleTopics.setLayoutManager(codeLLayout);

        ArrayList<codeSampleClass> topicList = new ArrayList<>();
        int[] images = new int[]{R.drawable.pycode};

        codeSampleClass codeTopic = new codeSampleClass(images[0],"Hello World");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"input()");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Display String");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Raw String");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"String Concatenate");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"String Manipulation");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Lists");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Voting age Problem");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Simple for loop");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Simple while loop");
        topicList.add(codeTopic);

        codeTopic = new codeSampleClass(images[0],"Class in Python");
        topicList.add(codeTopic);

        codeSampleAdapter adapter = new codeSampleAdapter(getActivity(),topicList);
        codeSampleTopics.setAdapter(adapter);



        return v;
    }

}
