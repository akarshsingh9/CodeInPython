package com.codeinpython.codeinpython;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //splash screen code
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise recylcer view for card layouts
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        //setting layout manager for recyclerview which will handle how the cardview element will be populated
        LinearLayoutManager mLayoutManager;
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);

        //intialise cardlist
        ArrayList<cardviewclass>cardlist = new ArrayList<>();
        //drawables
        int[] images = new int[]{R.drawable.pyth,R.drawable.pythonlog,R.drawable.pythonlogo,R.drawable.updates};
        //elements
        cardviewclass card = new cardviewclass("Tutorials",images[0]);
        cardlist.add(card);

        card = new cardviewclass("Intro",images[1]);
        cardlist.add(card);

        card = new cardviewclass("Setup",images[2]);
        cardlist.add(card);

        card = new cardviewclass("I/O",images[3]);
        cardlist.add(card);

        card = new cardviewclass("Conditions",images[0]);
        cardlist.add(card);

        card = new cardviewclass("Functions",images[1]);
        cardlist.add(card);

        cardviewAdapter adapter = new cardviewAdapter(this,cardlist);
        recyclerView.setAdapter(adapter);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view1);
        mRecyclerView.setHasFixedSize(true);
        //setting layout manager for recyclerview which will handle how the cardview element will be populated
        LinearLayoutManager mLayoutManager1;
        mLayoutManager1 = new LinearLayoutManager(this);
        mLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(mLayoutManager1);

        //intialise cardlist
        ArrayList<cardviewclass>cardlist1 = new ArrayList<>();
        //drawables
        int[] images1 = new int[]{R.drawable.pyth,R.drawable.pythonlog,R.drawable.pythonlogo,R.drawable.updates};
        //elements
        cardviewclass card1 = new cardviewclass("Quiz",images1[0]);
        cardlist1.add(card1);

        card1 = new cardviewclass("Codes",images1[1]);
        cardlist1.add(card1);

        card1 = new cardviewclass("Test",images1[2]);
        cardlist1.add(card1);

        card1 = new cardviewclass("Progress",images1[3]);
        cardlist1.add(card1);

        card1 = new cardviewclass("Credits",images1[0]);
        cardlist1.add(card1);

        card1 = new cardviewclass("Certificate",images1[1]);
        cardlist1.add(card1);

        cardviewAdapter adapter1 = new cardviewAdapter(this,cardlist1);
        mRecyclerView.setAdapter(adapter1);


                //*****AppIntro code starts*****
        SharedPreferences getPrefs = PreferenceManager
                .getDefaultSharedPreferences(getBaseContext());

        //  Create a new boolean and preference and set it to true
        boolean isFirstStart = getPrefs.getBoolean("firstStart", true);

       //  If the activity has never started before...
        if (isFirstStart) {

            //  Launch app intro
            Intent i = new Intent(MainActivity.this, IntroActivity.class);
            startActivity(i);

            //  Make a new preferences editor
            SharedPreferences.Editor e = getPrefs.edit();

            //  Edit preference to make it false because we don't want this to run again
            e.putBoolean("firstStart", false);

            //  Apply changes
            e.apply();
        }
     //*****AppIntro code ends*****
    }
}

