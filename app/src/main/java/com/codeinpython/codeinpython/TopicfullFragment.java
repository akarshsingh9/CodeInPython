package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TopicfullFragment extends Fragment {

    public TopicfullFragment() {
        super();
    }

    RecyclerView fullTopicRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.topicfull_fragment,container,false);



        fullTopicRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_Topics_Menu);
        fullTopicRecyclerView.setHasFixedSize(true);

        LinearLayoutManager topicLLayout;
        topicLLayout = new LinearLayoutManager(getActivity());
        topicLLayout.setOrientation(LinearLayoutManager.VERTICAL);
        fullTopicRecyclerView.setLayoutManager(topicLLayout);

        ArrayList<TopicFullCardClass> topicCardList = new ArrayList<>();
        int[] images = new int[]{R.drawable.pyth,R.drawable.pythonlog,R.drawable.pythonlogo,R.drawable.updates};

        TopicFullCardClass topics = new TopicFullCardClass("Intro to Programming",images[0],"1. Intro to Programming","2. Welcome to Python","","","","");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Setting up Python",images[1],"1. Install Python in Windows","2. Install Python in Mac","3. Using Text Editor/IDE","","","");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Input/Output in Python",images[3],"1. Your First Python Program","2. Output in Python","3. Input in Python","","","");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Datatypes",images[0],"1. Variables","2. Numbers","3. Strings","4. Lists","5. Tuples","6. Dictionary");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Conditional Statements",images[1],"1. if Statement","2. else Statement","3. elif Statement","4. Nested if","","");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Functions",images[3],"1. Functions in Python","2. Calling a function","","","","");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Loops",images[0],"1. for loop","2. while loop","","","","");
        topicCardList.add(topics);

        topics = new TopicFullCardClass("Object Oriented Programming",images[1],"1. OOP","2. Encapsl.","3. Abstraction","4. Inheritance","5. Polymorphism","");
        topicCardList.add(topics);
        topics = new TopicFullCardClass("Classes and Objects",images[1],"1. Classes in Python","2. Objects in Python","","","","");
        topicCardList.add(topics);
        TopicMenuAdapter adapter = new TopicMenuAdapter(getActivity(),topicCardList);
        fullTopicRecyclerView.setAdapter(adapter);

        return v;
    }
}
