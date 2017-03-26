package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

import static com.codeinpython.codeinpython.R.id.viewPager;

public class TutorialsActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabLayout tabLayout1;
    TabLayout tabLayout2;
    TabLayout tabLayout3;
    TabLayout tabLayout4;
    TabLayout tabLayout5;
    TabLayout tabLayout6;
    TabLayout tabLayout7;
    TabLayout tabLayout8;
    TabLayout tabLayout9;
    TabLayout tabLayout10;


//*****************************************************************************************************************************
    // Start of onCreate()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        int pages = getIntent().getExtras().getInt("positions");

        switch (pages)
        {
            case 0:

                //---------------------------------------------------------------------------------
                // Toolbar initializing for tutorials viewpager

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar);
                //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Intro to Programming");
               // Back Button functionality
               toolbar.setNavigationIcon(R.drawable.backbutton);
                toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
               //-----------------------------------------------------------------------------------
               // Tabs on the tutorials by Tablayout
                tabLayout = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout.addTab(tabLayout.newTab().setText("Intro to Programming"));
                tabLayout.addTab(tabLayout.newTab().setText("Python Intro"));
                //tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
                //Attach a Runnable to handle tabs width according to screen size
                tabLayout.post(tabLayout_config);
                //-----------------------------------------------------------------------------------
                //ViewPager intialzing
                final ViewPager pager = (ViewPager)findViewById(viewPager);
                pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
                pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
                //noinspection deprecation
                tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
                break;
            case 1:
                Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar1);
                toolbar1.setNavigationIcon(R.drawable.backbutton);
                toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Setting Up");

                tabLayout1 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout1.addTab(tabLayout1.newTab().setText("Windows"));
                tabLayout1.addTab(tabLayout1.newTab().setText("Mac OS"));
                tabLayout1.addTab(tabLayout1.newTab().setText("Text Editor/IDE"));
                //tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout1.post(tabLayout_config1);
                final ViewPager pager1 = (ViewPager)findViewById(viewPager);
                pager1.setAdapter(new MyPagerAdapter1(getSupportFragmentManager()));
                pager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
                //noinspection deprecation
                tabLayout1.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager1.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
                break;
            case 2:
                Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar2);
                toolbar2.setNavigationIcon(R.drawable.backbutton);
                toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("I/O in Python");

                tabLayout2 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout2.addTab(tabLayout2.newTab().setText("Hello World"));
                tabLayout2.addTab(tabLayout2.newTab().setText("Using print()"));
                tabLayout2.addTab(tabLayout2.newTab().setText("Using input()"));
                //tabLayout2.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout2.post(tabLayout_config2);
                final ViewPager pager2 = (ViewPager)findViewById(viewPager);
                pager2.setAdapter(new MyPagerAdapter2(getSupportFragmentManager()));
                pager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout2));
                //noinspection deprecation
                tabLayout2.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager2.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
                break;
            case 3:
                Toolbar toolbar3 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar3);
                toolbar3.setNavigationIcon(R.drawable.backbutton);
                toolbar3.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Operators");

                tabLayout3 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout3.addTab(tabLayout3.newTab().setText("Operators"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Arthematic Operator"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Relational Operator"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Assignment Operator"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Bitwise Operator"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Logical Operator"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Membership Operator"));
                //tabLayout3.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout3.post(tabLayout_config3);
                final ViewPager pager3 = (ViewPager)findViewById(viewPager);
                pager3.setAdapter(new MyPagerAdapter3(getSupportFragmentManager()));
                pager3.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout3));
                //noinspection deprecation
                tabLayout3.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager3.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;

            case 4:
                Toolbar toolbar4 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar4);
                toolbar4.setNavigationIcon(R.drawable.backbutton);
                toolbar4.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Data types");

                tabLayout4 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout4.addTab(tabLayout4.newTab().setText("Variables"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Datatypes"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Numbers"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Strings"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Lists"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Tuples"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Dictionary"));
                //tabLayout3.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout4.post(tabLayout_config4);
                final ViewPager pager4 = (ViewPager)findViewById(viewPager);
                pager4.setAdapter(new MyPagerAdapter4(getSupportFragmentManager()));
                pager4.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout4));
                //noinspection deprecation
                tabLayout4.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager4.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case 5:
                Toolbar toolbar5 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar5);
                toolbar5.setNavigationIcon(R.drawable.backbutton);
                toolbar5.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Conditionals");

                tabLayout5 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout5.addTab(tabLayout5.newTab().setText("if"));
                tabLayout5.addTab(tabLayout5.newTab().setText("else"));
                tabLayout5.addTab(tabLayout5.newTab().setText("elif"));
                tabLayout5.addTab(tabLayout5.newTab().setText("Nested if"));
                //tabLayout4.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout5.post(tabLayout_config5);
                final ViewPager pager5 = (ViewPager)findViewById(viewPager);
                pager5.setAdapter(new MyPagerAdapter5(getSupportFragmentManager()));
                pager5.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout5));
                //noinspection deprecation
                tabLayout5.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager5.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case 6:
                Toolbar toolbar6 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar6);
                toolbar6.setNavigationIcon(R.drawable.backbutton);
                toolbar6.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Functions");
                tabLayout6 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout6.addTab(tabLayout6.newTab().setText("Functions in Python"));
                tabLayout6.addTab(tabLayout6.newTab().setText("Calling functions in Python"));
                //tabLayout7.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout6.post(tabLayout_config6);

                final ViewPager pager6 = (ViewPager)findViewById(viewPager);
                pager6.setAdapter(new MyPagerAdapter6(getSupportFragmentManager()));
                pager6.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout6));
                //noinspection deprecation
                tabLayout6.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager6.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case 7:
                Toolbar toolbar7 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar7);
                toolbar7.setNavigationIcon(R.drawable.backbutton);
                toolbar7.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Loops");
                tabLayout7 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout7.addTab(tabLayout7.newTab().setText("for loop in Python"));
                tabLayout7.addTab(tabLayout7.newTab().setText("while loop in Python"));
                //tabLayout6.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout7.post(tabLayout_config7);

                final ViewPager pager7 = (ViewPager)findViewById(viewPager);
                pager7.setAdapter(new MyPagerAdapter7(getSupportFragmentManager()));
                pager7.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout7));
                //noinspection deprecation
                tabLayout7.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager7.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case 8:
                Toolbar toolbar8 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar8);
                toolbar8.setNavigationIcon(R.drawable.backbutton);
                toolbar8.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("OOP");
                tabLayout8 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout8.addTab(tabLayout8.newTab().setText("OOP"));
                tabLayout8.addTab(tabLayout8.newTab().setText("Encapsulation"));
                tabLayout8.addTab(tabLayout8.newTab().setText("Abstraction"));
                tabLayout8.addTab(tabLayout8.newTab().setText("Inheritence"));
                tabLayout8.addTab(tabLayout8.newTab().setText("Polymorphism"));
                //tabLayout7.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout8.post(tabLayout_config8);

                final ViewPager pager8 = (ViewPager)findViewById(viewPager);
                pager8.setAdapter(new MyPagerAdapter8(getSupportFragmentManager()));
                pager8.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout8));
                //noinspection deprecation
                tabLayout8.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager8.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case 9:
                Toolbar toolbar9 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar9);
                toolbar9.setNavigationIcon(R.drawable.backbutton);
                toolbar9.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Classes");
                tabLayout9 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout9.addTab(tabLayout9.newTab().setText("Classes in Python"));
                tabLayout9.addTab(tabLayout9.newTab().setText("Objects in Python"));
                //tabLayo9t8.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout9.post(tabLayout_config9);

                final ViewPager pager9 = (ViewPager)findViewById(viewPager);
                pager9.setAdapter(new MyPagerAdapter9(getSupportFragmentManager()));
                pager9.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout9));
                //noinspection deprecation
                tabLayout9.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager9.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case 10:
                Toolbar toolbar10 = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar10);
                toolbar10.setNavigationIcon(R.drawable.backbutton);
                toolbar10.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Exceptions");
                tabLayout10 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout10.addTab(tabLayout10.newTab().setText("try"));
                tabLayout10.addTab(tabLayout10.newTab().setText("except"));
                tabLayout10.addTab(tabLayout10.newTab().setText("finally"));
                //tabLayo9t8.setTabGravity(TabLayout.GRAVITY_FILL);
                tabLayout10.post(tabLayout_config10);

                final ViewPager pager10 = (ViewPager)findViewById(viewPager);
                pager10.setAdapter(new MyPagerAdapter10(getSupportFragmentManager()));
                pager10.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout10));
                //noinspection deprecation
                tabLayout10.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        pager10.setCurrentItem(tab.getPosition());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
        }


        //End of onCreate Method
    }

//********************************************************************************************************************
//                 RUNABLES FOR TABLAYOUTS TUTORIALS ALL THE 8 TOPICS

    Runnable tabLayout_config = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout.setLayoutParams(mParams);

            }
            else
            {
                tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config1 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout1.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout1.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout1.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout1.setLayoutParams(mParams);

            }
            else
            {
                tabLayout1.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config2 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout2.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout2.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout2.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout2.setLayoutParams(mParams);

            }
            else
            {
                tabLayout2.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config3 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout3.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout3.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout3.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout3.setLayoutParams(mParams);

            }
            else
            {
                tabLayout3.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config4 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout4.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout4.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout4.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout4.setLayoutParams(mParams);

            }
            else
            {
                tabLayout4.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config5 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout5.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout5.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout5.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout5.setLayoutParams(mParams);

            }
            else
            {
                tabLayout5.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config6 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout6.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout6.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout6.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout6.setLayoutParams(mParams);

            }
            else
            {
                tabLayout6.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config7 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout7.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout7.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout7.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout7.setLayoutParams(mParams);

            }
            else
            {
                tabLayout7.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config8 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout8.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout8.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout8.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout8.setLayoutParams(mParams);

            }
            else
            {
                tabLayout8.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };

    Runnable tabLayout_config9 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout9.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout9.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout9.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout9.setLayoutParams(mParams);

            }
            else
            {
                tabLayout9.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };
    Runnable tabLayout_config10 = new Runnable()
    {
        @Override
        public void run()
        {

            if(tabLayout10.getWidth() < TutorialsActivity.this.getResources().getDisplayMetrics().widthPixels)
            {
                tabLayout10.setTabMode(TabLayout.MODE_FIXED);
                ViewGroup.LayoutParams mParams = tabLayout10.getLayoutParams();
                mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
                tabLayout10.setLayoutParams(mParams);

            }
            else
            {
                tabLayout10.setTabMode(TabLayout.MODE_SCROLLABLE);
            }
        }
    };

//*****************************************************************************************************************************
// Pager Adapter for ViewPager to fill in Tutorials Content All 8 PagerAdapter for 8 topics

    private class MyPagerAdapter extends FragmentPagerAdapter
    {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgres1 = R.drawable.intro;
                    String headin1 = "Intro to programming";
                    String cont1 = getResources().getString(R.string.article);
                    return minfragActivity.newInstance(headin1,cont1,0,0);


                case 1:
                    //int imgres2 = R.drawable.welcometopython;
                    String headin2 = "Welcome to Python";
                    String cont2 = getResources().getString(R.string.aboutPython);
                    return minfragActivity.newInstance(headin2,cont2,1,1);

                default:
                    //int imgres3 = R.drawable.intro;
                    String headin3 = "Intro to programming";
                    String cont3 = getResources().getString(R.string.article);
                    return minfragActivity.newInstance(headin3,cont3,0,0);
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }



    private class MyPagerAdapter1 extends FragmentPagerAdapter
    {
        public MyPagerAdapter1(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgres1 = R.drawable.pyinstall;
                    String headin1 = "Install Python on Windows";
                    String cont1 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin1,cont1,0,0);
                case 1:
                    //int imgres2 = R.drawable.pyinstall;
                    String headin2 = "Install Python on Mac";
                    String cont2 = getResources().getString(R.string.macinstall);
                    return minfragActivity.newInstance(headin2,cont2,0,0);
                case 2:
                    //int imgres3 = R.drawable.pyinstall;
                    String headin3 = "Using Text Editors/IDE";
                    String cont3 = getResources().getString(R.string.textEditors);
                    return minfragActivity.newInstance(headin3,cont3,1,2);
                default:
                    //int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


    private class MyPagerAdapter2 extends FragmentPagerAdapter
    {
        public MyPagerAdapter2(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int img2 = R.drawable.firstprogram;
                    String head2 = "Your First Python Program";
                    String content2 = getResources().getString(R.string.helloWorld);
                    String subcont2 = getResources().getString(R.string.helloWorld2);
                    String code = "<font color='#ff5722'>print</font>"+"(<font color='#088837'>\"Hello World!\"</font>)";
                    String output ="<font color='#00838f'>Hello World!</font>";
                    return fullfragActivity.newInstance(head2,content2,code,output,subcont2,0,0);
                case 1:
                    //int imgres1 = R.drawable.output;
                    String headin1 = "Using print()";
                    String cont1 = getResources().getString(R.string.print);
                    String subcont1 = getResources().getString(R.string.print2);
                    String code1 = "a = 12<br/>"+"b = 23<br/>"+"sum = a + b<br/>"+"<font color='#ff5722'>print</font>("+"<font color='#42a5f5'>sum</font>)";
                    String op1 = "<font color='#00838f'>35</font>";
                    return fullfragActivity.newInstance(headin1,cont1,code1,op1,subcont1,0,0);
                case 2:
                    //int imgres2 = R.drawable.input;
                    String headin2 = "Using input()";
                    String cont2 = getResources().getString(R.string.input);
                    String subcontent2 = getResources().getString(R.string.input2);
                    String code2 = "fruit = <font color='#FF4081'>input</font>(<font color='#088837'>\"Enter your favourite fruit name: \"</font>)<br/><font color='#ff5722'>print</font>(<font color='#42a5f5'>fruit</font>)";
                    String op2 = "<font color='#00838f'>Enter your favourite fruit name: Apple<br/>Apple</font>";
                    return fullfragActivity.newInstance(headin2,cont2,code2,op2,subcontent2,1,3);
                default: //int imgres3 = R.drawable.output;
                    String headin3 = "Using print()";
                    String cont3 = getResources().getString(R.string.print);
                    String subcont3 = getResources().getString(R.string.print2);
                    String code3 = "a = 12<br/>"+"b = 23<br/>"+"sum = a + b<br/>"+"<font color='#ff5722'>print</font>("+"<font color='#004d40'>sum</font>)";
                    String op3 = "<font color='#00838f'>35</font>";
                    return fullfragActivity.newInstance(headin3,cont3,code3,op3,subcont3,0,0);

            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


    private class MyPagerAdapter3 extends FragmentPagerAdapter
    {
        public MyPagerAdapter3(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int img2 = R.drawable.variables;
                    String head2 = "Operators in Python";
                    String content2 = getResources().getString(R.string.operator);
                    //String subcont2 = getResources().getString(R.string.variables2);
                    //String code = "#Integer Variable<br/>a = 23<br/>#Float Variable<br/>b = 12.52<br/>#String Variable<br/>c = 'Amazing App!'";
                    return minfragActivity.newInstance(head2,content2,0,0);
                case 1:
                    //int imgres4 = R.drawable.datatypes;
                    String headin4 = "Arthematic Operators";
                    String cont4 = getResources().getString(R.string.arthematic);
                    return minfragActivity.newInstance(headin4,cont4,0,0);

                case 2:
                    //int imgres5 = R.drawable.datatypes;
                    String headin5 = "Relational Operator in Python";
                    String cont5 = getResources().getString(R.string.relational);
                    return minfragActivity.newInstance(headin5,cont5,0,0);
                case 3:
                    //int img3 = R.drawable.datatypes;
                    String head3 = "Assignment Operators";
                    String content3 = getResources().getString(R.string.assignment);
                    //String subcont3 = getResources().getString(R.string.strings2);
                    //String code3 = "x = \"<font color='#2e7d32'>Welcome to CodeInPython</font>\"<br/>y = '<font color='#2e7d32'>Welcome to CodeInPython</font>'<br/><font color='#ff5722'>print</font>(x)<br/><font color='#ff5722'>print</font>(y)";
                    //String output3 ="<font color='#00838f'>Welcome to CodeInPython<br/>Welcome to CodeInPython</font>";
                    return minfragActivity.newInstance(head3,content3,0,0);
                case 4:
                    //int img4 = R.drawable.datatypes;
                    String head4 = "Bitwise Operators";
                    String content4 = getResources().getString(R.string.bitwise);
                    //String subcont4 = getResources().getString(R.string.lists2);
                    //String code4 = "<font color='#673ab7'>a</font> = [<font color='#3f51b5'>1, 4, 3, 7, 9</font>]<br/><font color='#673ab7'>a</font>.append(45)<br/><font color='#ff5722'>print</font>(<font color='#673ab7'>a</font>)<br/><font color='#673ab7'>a</font>.sort()<br/><font color='#ff5722'>print</font>(<font color='#673ab7'>a</font>)";
                    //String output4 ="<font color='#00838f'>[1, 4, 3, 7, 9, 45]<br/>[1, 3, 4, 7, 9, 45]</font>";
                    return minfragActivity.newInstance(head4,content4,0,0);

                case 5:
                    //int img = R.drawable.datatypes;
                    String head = "Logical Operators";
                    String cont = getResources().getString(R.string.logicaloperator);
                    //String codetuple = "tuple = (<font color='#3f51b5'>‘python’, 45, 56, 2</font>)<br/><font color='#ff5722'>print</font>(tuple)<br/><font color='#ff5722'>print</font>(tuple[2])";
                    //String out = "<font color='#00838f'>('python', 45, 56, 2)<br/>56 </font>";
                    return minfragActivity.newInstance(head,cont,0,0);

                case 6:
                    //int img6 = R.drawable.datatypes;
                    String head6 = "Membership Operators";
                    String cont6 = getResources().getString(R.string.membership);
                    //String codedict = "dict1</font> = {}<br/>dict1['<font color='#1565c0'>one</font>'] = \"<font color='#2e7d32'>code in </font>\"<br/>dict1[<font color='#1565c0'>2</font>] = \"<font color='#2e7d32'>python</font>\"<br/><font color='#ff5722'>print</font>(dict1)<br/><font color='#ff5722'>print</font>(dict1['<font color='#1565c0'>one</font>'])";
                    //String outdict = "<font color='#00838f'>{'one': 'code in ', 2: 'python'}<br/>code in </font>";
                    return minfragActivity.newInstance(head6,cont6,1,4);

                default:
                    //int imgres41 = R.drawable.datatypes;
                    String headin41 = "DataTypes in Python";
                    String cont41 = getResources().getString(R.string.datatypes);
                    return minfragActivity.newInstance(headin41,cont41,0,0);

            }
        }

        @Override
        public int getCount() {
            return 7;
        }
    }

    private class MyPagerAdapter4 extends FragmentPagerAdapter
    {
        public MyPagerAdapter4(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int img2 = R.drawable.variables;
                    String head2 = "Variables in Python";
                    String content2 = getResources().getString(R.string.variables);
                    String subcont2 = getResources().getString(R.string.variables2);
                    String code = "#Integer Variable<br/>a = 23<br/>#Float Variable<br/>b = 12.52<br/>#String Variable<br/>c = 'Amazing App!'";
                    return tillcodefragActivity.newInstance(head2,content2,code,subcont2,0,0);
                case 1:
                    //int imgres4 = R.drawable.datatypes;
                    String headin4 = "DataTypes in Python";
                    String cont4 = getResources().getString(R.string.datatypes);
                    return minfragActivity.newInstance(headin4,cont4,0,0);

                case 2:
                    //int imgres5 = R.drawable.datatypes;
                    String headin5 = "Numbers in Python";
                    String cont5 = getResources().getString(R.string.numbers);
                    return minfragActivity.newInstance(headin5,cont5,0,0);
                case 3:
                    //int img3 = R.drawable.datatypes;
                    String head3 = "Strings in Python";
                    String content3 = getResources().getString(R.string.strings);
                    String subcont3 = getResources().getString(R.string.strings2);
                    String code3 = "x = \"<font color='#088837'>Welcome to CodeInPython</font>\"<br/>y = '<font color='#088837'>Welcome to CodeInPython</font>'<br/><font color='#ff5722'>print</font>(x)<br/><font color='#ff5722'>print</font>(y)";
                    String output3 ="<font color='#00838f'>Welcome to CodeInPython<br/>Welcome to CodeInPython</font>";
                    return fullfragActivity.newInstance(head3,content3,code3,output3,subcont3,0,0);
                case 4:
                    //int img4 = R.drawable.datatypes;
                    String head4 = "Lists in Python";
                    String content4 = getResources().getString(R.string.lists);
                    String subcont4 = getResources().getString(R.string.lists2);
                    String code4 = "<font color='#d500f9'>a</font> = [<font color='#cddc39'>1, 4, 3, 7, 9</font>]<br/><font color='#d500f9'>a</font>.append(45)<br/><font color='#ff5722'>print</font>(<font color='#d500f9'>a</font>)<br/><font color='#d500f9'>a</font>.sort()<br/><font color='#ff5722'>print</font>(<font color='#d500f9'>a</font>)";
                    String output4 ="<font color='#00838f'>[1, 4, 3, 7, 9, 45]<br/>[1, 3, 4, 7, 9, 45]</font>";
                    return fullfragActivity.newInstance(head4,content4,code4,output4,subcont4,0,0);

                case 5:
                    //int img = R.drawable.datatypes;
                    String head = "Tuples in Python";
                    String cont = getResources().getString(R.string.tuples);
                    String codetuple = "tuple = (<font color='#cddc39'>‘python’, 45, 56, 2</font>)<br/><font color='#ff5722'>print</font>(tuple)<br/><font color='#ff5722'>print</font>(tuple[2])";
                    String out = "<font color='#00838f'>('python', 45, 56, 2)<br/>56 </font>";
                    return tilloutputfragActivity.newInstance(head,cont,codetuple,out,0,0);

                case 6:
                    //int img6 = R.drawable.datatypes;
                    String head6 = "Dictionary in Python";
                    String cont6 = getResources().getString(R.string.dictionary);
                    String codedict = "dict1</font> = {}<br/>dict1['<font color='#e91e63'>one</font>'] = \"<font color='#088837'>code in </font>\"<br/>dict1[<font color='#e91e63'>2</font>] = \"<font color='#088837'>python</font>\"<br/><font color='#ff5722'>print</font>(dict1)<br/><font color='#ff5722'>print</font>(dict1['<font color='#e91e63'>one</font>'])";
                    String outdict = "<font color='#00838f'>{'one': 'code in ', 2: 'python'}<br/>code in </font>";
                    return tilloutputfragActivity.newInstance(head6,cont6,codedict,outdict,1,5);

                default:
                    //int imgres41 = R.drawable.datatypes;
                    String headin41 = "DataTypes in Python";
                    String cont41 = getResources().getString(R.string.datatypes);
                    return minfragActivity.newInstance(headin41,cont41,0,0);

            }
        }

        @Override
        public int getCount() {
            return 7;
        }
    }

    private class MyPagerAdapter5 extends FragmentPagerAdapter
    {
        public MyPagerAdapter5(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgif = R.drawable.ifelse;
                    String headif = "if Statement";
                    String contif = getResources().getString(R.string.ifStatement);
                    String codeif = "a = int(<font color='#FF4081'>input</font>(<font color='#088837'>\"Enter number:\"</font>))<br/>"+"if(a % 2 == 0):<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is Even\"</font>)";
                    String outif = "<font color='#00838f'>Enter number: 12<br/>The number is </font>";
                    return tilloutputfragActivity.newInstance(headif,contif,codeif,outif,0,0);

                case 1:
                    //int imgelse = R.drawable.ifelse;
                    String headelse = "else Statement";
                    String contelse = getResources().getString(R.string.elseStatement);
                    String codeelse = "a = int(<font color='#FF4081'>input</font>(<font color='#088837'>\"Enter number:\"</font>))<br/>"
                            +"<br/>&nbsp;&nbsp;if(a % 2 == 0):<br/>"+"&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is Even\"</font>)"
                            +"<br/>else:<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is Odd\"</font>)";
                    String outelse = "<font color='#00838f'>Enter number: 43<br/>The number is Odd</font>";
                    return tilloutputfragActivity.newInstance(headelse,contelse,codeelse,outelse,0,0);

                case 2:
                    //int imgelif = R.drawable.ifelse;
                    String headelif = "elif Statement";
                    String contelif = getResources().getString(R.string.elifStatement);
                    String codeelif = "a = int(<font color='#FF4081'>input</font>(<font color='#088837'>\"Enter number:\"</font>))<br/>"
                            +"if(a % 2 == 0):<br/>"+"&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is Even\"</font>)"
                            +"<br/>&nbsp;&nbsp;elif(a == 0):<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is Zero\"</font>)"
                            +"<br/>else:<br/>"+"&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is Odd\"</font>)";
                    String outelif = "<font color='#00838f'>Enter number: 0<br/>The number is Zero</font>";
                    return tilloutputfragActivity.newInstance(headelif,contelif,codeelif,outelif,0,0);

                case 3:
                    //int imgelse1 = R.drawable.ifelse;
                    String headelse1 = "Nested if Statement";
                    String contelse1 = getResources().getString(R.string.nestedif);
                    String codeelse1 ="a = int(<font color='#FF4081'>input</font>(<font color='#088837'>\"Enter number:\"</font>))<br/>"
                        +"if(a < 100):<br/>"+
                        "&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is less than 100\"</font>)"
                        +"<br/>&nbsp;&nbsp;if(a == 50):<br/>"+
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is 50\"</font>)"
                        +"<br/>else:<br/>"+"&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#088837'>\"The number is more than 100\"</font>)";
                    String outelse1 = "<font color='#00838f'>Enter number: 50<br/>The number is less than 100<br/>The number is 50</font>";
                    return tilloutputfragActivity.newInstance(headelse1,contelse1,codeelse1,outelse1,1,6);

                default:
                    //int imgres4 = R.drawable.ifelse;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }



    private class MyPagerAdapter6 extends FragmentPagerAdapter
    {
        public MyPagerAdapter6(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgfunc = R.drawable.banner;
                    String headfunc = "Functions in Python";
                    String contfunc = getResources().getString(R.string.functions);
                    String subcontfunc = getResources().getString(R.string.defineFunction);
                    String codefunc = "<font color='#FF4081'>def</font> functionName(<font color='#088837'>parameters</font>):<br/>&nbsp;&nbsp;&nbsp;<font color='#eeeeee'>function_body</font><br/>&nbsp;&nbsp;&nbsp;<font color='#FF4081'>return</font> expression";
                    return tillcodefragActivity.newInstance(headfunc,contfunc,codefunc,subcontfunc,0,0);
                case 1:
                    //int imgcall = R.drawable.banner;
                    String headcall = "Calling a Function";
                    String contcall = getResources().getString(R.string.callFunction);
                    String subcontcall = getResources().getString(R.string.defaultArguments);
                    String codecall ="<font color='#FF4081'>def</font> display(<font color='#088837'>num</font>):<br/>" +
                            "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#eeeeee'>\"Number passed\"</font>, num)" +
                            "<br/>&nbsp;&nbsp;&nbsp;<font color='#FF4081'>return</font><br/>"+
                            "<br/>x = 65<br/>display(x)";
                    String outcall = "<font color='#00838f'>Number passed 65</font>";
                    return fullfragActivity.newInstance(headcall,contcall,codecall,outcall,subcontcall,1,7);

                default:
                    //int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


    private class MyPagerAdapter7 extends FragmentPagerAdapter
    {
        public MyPagerAdapter7(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgres1 = R.drawable.forloop;
                    String headin1 = "For Loop in Python";
                    String cont1 = getResources().getString(R.string.forloop);
                    String codefor = "x = <font color='#088837'>[1, 2, 3, 4]</font><br/>" +
                            "<font color='#FF4081'>for</font> <font color='#bdbdbd'>in</font> x:" +
                            "<br/>&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(x)<br/>";
                    String outfor = "<font color='#00838f'>1<br/>2<br/>3<br/>4</font>";
                    return tilloutputfragActivity.newInstance(headin1,cont1,codefor,outfor,0,0);
                case 1:
                    //int imgres2 = R.drawable.whileloop;
                    String headin2 = "While Loop in Python";
                    String cont2 = getResources().getString(R.string.whileloop);
                    String codewhile = "x = 1<br/>" +
                            "<font color='#FF4081'>while</font> x < = 5:<br/>" +
                            "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(x)<br/>"
                            +"&nbsp;&nbsp;&nbsp;x = x + 1";
                    String outwhile = "<font color='#00838f'>1<br/>2<br/>3<br/>4<br/>5</font>";
                    return tilloutputfragActivity.newInstance(headin2,cont2,codewhile,outwhile,1,8);

                default:
                    //int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

    private class MyPagerAdapter8 extends FragmentPagerAdapter
    {
        public MyPagerAdapter8(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgres1 = R.drawable.banner;
                    String headin1 = "Object Oriented Programming";
                    String cont1 = getResources().getString(R.string.oop);
                    return minfragActivity.newInstance(headin1,cont1,0,0);
                case 1:
                    //int imgres2 = R.drawable.banner;
                    String headin2 = "Encapsulation";
                    String cont2 = getResources().getString(R.string.encapsulation);
                    return minfragActivity.newInstance(headin2,cont2,0,0);
                case 2:
                    //int imgres3 = R.drawable.banner;
                    String headin3 = "Abstraction";
                    String cont3 = getResources().getString(R.string.abstraction);
                    return minfragActivity.newInstance(headin3,cont3,0,0);
                case 3:
                    //int imgres21 = R.drawable.banner;
                    String headin21 = "Inheritance";
                    String cont21 = getResources().getString(R.string.inheritance);
                    return minfragActivity.newInstance(headin21,cont21,0,0);
                case 4:
                    //int imgres31 = R.drawable.banner;
                    String headin31 = "Polymorphism";
                    String cont31 = getResources().getString(R.string.polymorphism);
                    return minfragActivity.newInstance(headin31,cont31,1,9);
                default:
                    //int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

    private class MyPagerAdapter9 extends FragmentPagerAdapter
    {
        public MyPagerAdapter9(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgres1 = R.drawable.classes;
                    String headin1 = "Class in Python";
                    String cont1 = getResources().getString(R.string.classes);
                    String codeclass = "class Student:<br/>" +
                            " &nbsp; def __init__(self, name, marks):<br/>" +
                            " &nbsp;&nbsp;&nbsp;&nbsp;self.name = name<br/>" +
                            " &nbsp;&nbsp;&nbsp;&nbsp;self.marks = marks<br/>" +
                            " &nbsp;&nbsp; def displayinfo(self):<br/>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;print (\"Name : \", self.name,  \" Marks: \", self.marks)\n";
                    String subcont1 = getResources().getString(R.string.init);

                    return tillcodefragActivity.newInstance(headin1,cont1,codeclass,subcont1,0,0);
                case 1:
                    //int img = R.drawable.classes;
                    String head = "Objects in Python";
                    String cont = getResources().getString(R.string.Objects);
                    String subcont = getResources().getString(R.string.Objects2);
                    String code ="\"\"\"This will create the first object for the Student class\"\"\"<br/><br/>" +
                            "student1 = Student(\"Sam\", 80.5)<br/>" +
                            "\"\"\"This will create the second object of Employee class\"\"\"<br/><br/>" +
                            "student2 = Student(\"Roberts\", 85.0)";
                    String out = "student1.displayinfo()<br/>" +
                            "student2.displayinfo()";
                    String subsub =getResources().getString(R.string.Objects3);
                    return ObjectsfragTutorials.newInstance(head,cont,code,subcont,out,subsub);


                default:
                    //int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

    private class MyPagerAdapter10 extends FragmentPagerAdapter
    {
        public MyPagerAdapter10(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    //int imgres1 = R.drawable.classes;
                    String headin1 = "Using 'try' in Python";
                    String cont1 = getResources().getString(R.string.try_tuts);
                    String codeclass =  "a = 10<br/>" +
                                        "b = 0<br/>" +
                                        "try:<br/>" +
                                        "&nbsp;&nbsp;&nbsp;c = a/b <br/>" +
                                        "&nbsp;&nbsp;&nbsp;print(c)<br/>" +
                                        "except:<br/>" +
                                        "&nbsp;&nbsp;&nbsp;print(\"Exception caught\")<br/>";
                    //String subcont1 = getResources().getString(R.string.init);
                    String outtry = "Exception Caught";
                    return tilloutputfragActivity.newInstance(headin1,cont1,codeclass,outtry,0,0);
                case 1:
                    //int img = R.drawable.classes;
                    String head = "Using 'except' in Python";
                    String cont = getResources().getString(R.string.except);
                    //String subcont = getResources().getString(R.string.Objects2);
                    String code ="try:<br/>" +
                            "&nbsp;&nbsp;&nbsp;# do something<br/>" +
                            "&nbsp;&nbsp;&nbsp;pass<br/><br/>" +
                            "except TypeError:<br/>" +
                            "&nbsp;&nbsp;&nbsp;# handle TypeError exception<br/>" +
                            "&nbsp;&nbsp;&nbsp;pass<br/><br/>" +
                            "except (ValueError, ZeroDivisionError):<br/>" +
                            "&nbsp;&nbsp;&nbsp;# handle multiple exceptions<br/>" +
                            "&nbsp;&nbsp;&nbsp;# ValueError and ZeroDivisionError<br/>" +
                            "&nbsp;&nbsp;&nbsp;pass<br/><br/>" +
                            "except:<br/>" +
                            "&nbsp;&nbsp;&nbsp;# handle all other exceptions<br/>" +
                            "&nbsp;&nbsp;&nbsp;pass<br/>" ;
                    String subsub ="We hope this article on exception handling was easy to understand. Please refer to Py Code section to review python code on exception handling.";
                    return tillcodefragActivity.newInstance(head,cont,code,subsub,0,0);

                case 2:
                    //int img = R.drawable.classes;
                    String head2 = "Using 'finally' in Python";
                    String cont2 = getResources().getString(R.string.tryfinally);
                    //String subcont = getResources().getString(R.string.Objects2);
                    String code2 = "try:<br/>" +
                            "&nbsp;&nbsp;&nbsp;fi = open(\"testfile.txt\",encoding = 'utf-8')<br/>" +
                            "&nbsp;&nbsp;&nbsp;# perform file operations<br/>" +
                            "finally:<br/>" +
                            "&nbsp;&nbsp;&nbsp;fi.close()<br/>";
                    String subsub2 ="Thank You for reading all the articles till the end. You can refer Py Code Section to see python code. Your feedback on the app is valuable to us. Tell us what you feel about our app.";
                    return tillcodefragActivity.newInstance(head2,cont2,code2,subsub2,1,11);

                default:
                    //int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(headin4,cont4,0,0);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
//*******************************************************************************************************************************************
    //End of Tutorials Activity
}
