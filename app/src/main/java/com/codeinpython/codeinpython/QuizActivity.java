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
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.quizpager);
        viewPager.setAdapter(new FragPagerAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
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
                    Fragment fragment = new quiz1Fragment();
                    return fragment;
                case 1:
                    Fragment fragment1 = new quiz2Fragment();
                    return fragment1;
                case 2:
                    Fragment fragment2 = new quiz3Fragment();
                    return fragment2;

                default:
                    Fragment fragment3 = new quiz1Fragment();
                    return fragment3;

            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }



}

