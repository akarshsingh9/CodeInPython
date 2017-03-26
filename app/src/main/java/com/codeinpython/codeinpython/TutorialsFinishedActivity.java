package com.codeinpython.codeinpython;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TutorialsFinishedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials_finished);

        char ch = getIntent().getExtras().getChar("title");
        TextView textView = (TextView)findViewById(R.id.topicname);

        switch (ch)
        {
            case 'a':
                textView.setText("Intro to Programming");
                break;
            case 'b':
                textView.setText("Setting Up Python");
                break;
            case 'c':
                textView.setText("I/O in Python");
                break;
            case 'd':
                textView.setText("Operators in Python");
                break;
            case 'e':
                textView.setText("Datatypes in Python");
                break;
            case 'f':
                textView.setText("Conditional Statements");
                break;
            case 'g':
                textView.setText("Functions in Python");
                break;
            case 'h':
                textView.setText("Loops in Python");
                break;
            case 'i':
                textView.setText("Object Oriented Prog.");
                break;
            case 'o':
                textView.setText("Classes and Objects");
                break;
            case 'j':
                textView.setText("Exception Handling");
                break;

        }



        TextView goback = (TextView)findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorialsFinishedActivity.this,TopicMenuActivity.class);
                intent.putExtra("pos",0);
                intent.putExtra("back",1);
                startActivity(intent);
            }
        });



    }


}
