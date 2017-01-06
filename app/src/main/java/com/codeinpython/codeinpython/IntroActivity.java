package com.codeinpython.codeinpython;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String title1 = "Python";
        String title2 = "Tutorials";
        String title3 = "Quiz";
        String title4 = "Code In Python";

        String des1 = "Learn Python Easily";
        String des2 = "Read tutorials and learn to code";
        String des3 = "Answer the quiz followed by tutorials";
        String des4 = "Rate us ";


        int img1 = R.drawable.pythonlogo;

        addSlide(AppIntroFragment.newInstance(title1,des1,img1, Color.parseColor("#EC407A")));
        addSlide(AppIntroFragment.newInstance(title2,des2,img1, Color.parseColor("#9C27B0")));
        addSlide(AppIntroFragment.newInstance(title3,des3,img1, Color.parseColor("#1E88E5")));
        addSlide(AppIntroFragment.newInstance(title4,des4,img1, Color.parseColor("#FFEB3B")));

        setSeparatorColor(Color.parseColor("#2196F3"));
        showSkipButton(true);
        setProgressButtonEnabled(true);
        setFadeAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
