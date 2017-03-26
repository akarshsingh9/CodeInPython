package com.codeinpython.codeinpython;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Firebase instance variables
    //private FirebaseAuth mFirebaseAuth;
    //private FirebaseUser mFirebaseUser;

    //RecyclerView recyclerView;
    //RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //splash screen code
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*String mUsername,mEmail;
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        if (mFirebaseUser == null) {
            // Not signed in, launch the Sign In activity
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        } else {
            mUsername = mFirebaseUser.getDisplayName();
            mEmail = mFirebaseUser.getEmail();
        }*/
        Toolbar toolbarmain = (Toolbar) findViewById(R.id.toolbarmain);
        setSupportActionBar(toolbarmain);




        ArrayList<ListViewMainClass> listViewArrayList = new ArrayList<>();
        ListViewMainAdapter adapter = new ListViewMainAdapter(this,listViewArrayList);
        int[] images = new int[]{R.drawable.tutorial,R.drawable.code,R.drawable.future,R.drawable.quiz,R.drawable.glossary,R.drawable.aboutus};

        ListViewMainClass list = new ListViewMainClass("Tutorials",images[0],"Learn Python",Color.parseColor("#424242"));
        adapter.add(list);
        list = new ListViewMainClass("Py Code",images[1],"Review Python code" ,Color.parseColor("#455A64"));
        adapter.add(list);
        list = new ListViewMainClass("Quiz",images[3],"Take Python Quiz" ,Color.parseColor("#455A64"));
        adapter.add(list);
        list = new ListViewMainClass("Glossary",images[4],"Refer Glossary",Color.parseColor("#424242"));
        adapter.add(list);
        list = new ListViewMainClass("About Us",images[5],"Code In Python",Color.parseColor("#424242"));
        adapter.add(list);
        list = new ListViewMainClass("Future",images[2],"What Next?",Color.parseColor("#455A64"));
        adapter.add(list);
        GridView listView = (GridView)findViewById(R.id.gridview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent.putExtra("pos",position);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent1.putExtra("pos",position);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent2.putExtra("pos",position);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent3.putExtra("pos",position);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent4.putExtra("pos",position);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent5.putExtra("pos",position);
                        startActivity(intent5);
                        break;

                }
            }
        });
    }

    public void onBackPressed() {
        //  super.onBackPressed();
        moveTaskToBack(true);

    }
}

