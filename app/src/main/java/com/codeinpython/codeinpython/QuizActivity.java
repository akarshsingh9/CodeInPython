package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class QuizActivity extends AppCompatActivity {
     ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Ques 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 4"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 5"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 6"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 7"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 8"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 9"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 10"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 11"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 12"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 13"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 14"));
        tabLayout.addTab(tabLayout.newTab().setText("Ques 15"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.quizpager);
        viewPager.setAdapter(new FragPagerAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //noinspection deprecation
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }


    public void setCurrentItem (int item, boolean smoothScroll) {
        viewPager.setCurrentItem(item, smoothScroll);
    }


    private class FragPagerAdapter extends FragmentPagerAdapter
    {
        public FragPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return new quiz1Fragment();
                case 1:
                    return new quiz2Fragment();
                case 2:
                    return new quiz3Fragment();
                case 3:
                    return new quiz4Fragment();
                case 4:
                    return new quiz5Fragment();
                case 5:
                    return new quiz6Fragment();
                case 6:
                    return new quiz7Fragment();
                case 7:
                    return new quiz8Fragment();
                case 8:
                    return new quiz9Fragment();
                case 9:
                    return new quiz10Fragment();
                case 10:
                    return new quiz11Fragment();
                case 11:
                    return new quiz12Fragment();
                case 12:
                    return new quiz13Fragment();
                case 13:
                    return new quiz14Fragment();
                case 14:
                    return new quiz15Fragment();



                default:
                    return new quiz1Fragment();

            }
        }

        @Override
        public int getCount() {
            return 15;
        }
    }



}

