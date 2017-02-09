package com.codeinpython.codeinpython;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    TextView q1_score, q2_score, q3_score, final_score;
    int finalscore;
    int q2answer, q3answer, q1answer;
    String q1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        initControls();

    }

    public void initControls(){

        q1_score = (TextView)findViewById(R.id.score1);
        q2_score = (TextView)findViewById(R.id.score2);
        q3_score = (TextView)findViewById(R.id.score3);
        final_score = (TextView)findViewById(R.id.totalscore);

        SharedPreferences sharedPreferences = getSharedPreferences("shared",0);

        int q1answer = sharedPreferences.getInt("ans1",0);
        int q2answer = sharedPreferences.getInt("ans2", 0);
        int q3answer = sharedPreferences.getInt("ans3", 0);

        if ( q1answer == 1 ){
            q1_score.setText("Correct");
        } else {
            q1_score.setText("Incorrect");
        }

        if ( q2answer == 1){
            q2_score.setText("Correct");
        } else {
            q2_score.setText("Incorrect ");
        }

        if ( q3answer == 1){
            q3_score.setText("Correct");
        } else {
            q3_score.setText("Incorrect ");
        }

        finalscore =  q1answer + q2answer + q3answer;
        final_score.setText(finalscore + "/3");
    }
}
