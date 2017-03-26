package com.codeinpython.codeinpython;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    TextView final_score;
    int finalscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        initControls();

        TextView goback = (TextView)findViewById(R.id.gobackquiz);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void initControls(){


        final_score = (TextView)findViewById(R.id.totalscore);

        SharedPreferences sharedPreferences = getSharedPreferences("shared",0);

        int q1answer = sharedPreferences.getInt("ans1",0);
        int q2answer = sharedPreferences.getInt("ans2", 0);
        int q3answer = sharedPreferences.getInt("ans3", 0);
        int q4answer = sharedPreferences.getInt("ans4", 0);
        int q5answer = sharedPreferences.getInt("ans5", 0);
        int q6answer = sharedPreferences.getInt("ans6", 0);
        int q7answer = sharedPreferences.getInt("ans7", 0);
        int q8answer = sharedPreferences.getInt("ans8", 0);
        int q9answer = sharedPreferences.getInt("ans9", 0);
        int q10answer = sharedPreferences.getInt("ans10", 0);
        int q11answer = sharedPreferences.getInt("ans11", 0);
        int q12answer = sharedPreferences.getInt("ans12", 0);
        int q13answer = sharedPreferences.getInt("ans13", 0);
        int q14answer = sharedPreferences.getInt("ans14", 0);
        int q15answer = sharedPreferences.getInt("ans15", 0);



        finalscore =  q1answer + q2answer + q3answer + q4answer + q5answer + q6answer + q7answer + q8answer + q9answer + q10answer + q11answer + q12answer + q13answer + q14answer + q15answer;
        final_score.setText(finalscore + "/15");
    }
}
