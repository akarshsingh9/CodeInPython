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

import static com.codeinpython.codeinpython.R.id.viewPager;

public class TutorialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        int pages = getIntent().getExtras().getInt("positions");

        switch (pages)
        {
            case 0:
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbartuts);
                setSupportActionBar(toolbar);
                //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

               toolbar.setNavigationIcon(R.drawable.backbutton);
                toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });

                TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout.addTab(tabLayout.newTab().setText("Intro to Programming"));
                tabLayout.addTab(tabLayout.newTab().setText("Python Intro"));
                tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
                final ViewPager pager = (ViewPager)findViewById(viewPager);
                pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
                pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
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

                TabLayout tabLayout1 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout1.addTab(tabLayout1.newTab().setText("Windows"));
                tabLayout1.addTab(tabLayout1.newTab().setText("Mac OS"));
                tabLayout1.addTab(tabLayout1.newTab().setText("Text Editor/IDE"));
                tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);
                final ViewPager pager1 = (ViewPager)findViewById(viewPager);
                pager1.setAdapter(new MyPagerAdapter1(getSupportFragmentManager()));
                pager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
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

                TabLayout tabLayout2 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout2.addTab(tabLayout2.newTab().setText("Hello World"));
                tabLayout2.addTab(tabLayout2.newTab().setText("Using print()"));
                tabLayout2.addTab(tabLayout2.newTab().setText("Using input()"));
                tabLayout2.setTabGravity(TabLayout.GRAVITY_FILL);
                final ViewPager pager2 = (ViewPager)findViewById(viewPager);
                pager2.setAdapter(new MyPagerAdapter2(getSupportFragmentManager()));
                pager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout2));
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

                TabLayout tabLayout3 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout3.addTab(tabLayout3.newTab().setText("Variables"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Lists"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Numbers"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Tuples"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Strings"));
                tabLayout3.addTab(tabLayout3.newTab().setText("Dictionary"));
                tabLayout3.setTabGravity(TabLayout.GRAVITY_FILL);
                final ViewPager pager3 = (ViewPager)findViewById(viewPager);
                pager3.setAdapter(new MyPagerAdapter3(getSupportFragmentManager()));
                pager3.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout3));
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

                TabLayout tabLayout4 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout4.addTab(tabLayout4.newTab().setText("if"));
                tabLayout4.addTab(tabLayout4.newTab().setText("else"));
                tabLayout4.addTab(tabLayout4.newTab().setText("elif"));
                tabLayout4.addTab(tabLayout4.newTab().setText("Nested if"));
                tabLayout4.setTabGravity(TabLayout.GRAVITY_FILL);

                final ViewPager pager4 = (ViewPager)findViewById(viewPager);
                pager4.setAdapter(new MyPagerAdapter4(getSupportFragmentManager()));
                pager4.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout4));
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
                TabLayout tabLayout5 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout5.addTab(tabLayout5.newTab().setText("Functions in Python"));
                tabLayout5.addTab(tabLayout5.newTab().setText("Calling functions in Python"));
                tabLayout5.setTabGravity(TabLayout.GRAVITY_FILL);

                final ViewPager pager5 = (ViewPager)findViewById(viewPager);
                pager5.setAdapter(new MyPagerAdapter5(getSupportFragmentManager()));
                pager5.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout5));
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
                TabLayout tabLayout6 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout6.addTab(tabLayout6.newTab().setText("for loop in Python"));
                tabLayout6.addTab(tabLayout6.newTab().setText("while loop in Python"));
                tabLayout6.setTabGravity(TabLayout.GRAVITY_FILL);

                final ViewPager pager6 = (ViewPager)findViewById(viewPager);
                pager6.setAdapter(new MyPagerAdapter6(getSupportFragmentManager()));
                pager6.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout6));
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
                TabLayout tabLayout7 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout7.addTab(tabLayout7.newTab().setText("OOP"));
                tabLayout7.addTab(tabLayout7.newTab().setText("Encapsulation"));
                tabLayout7.addTab(tabLayout7.newTab().setText("Abstraction"));
                tabLayout7.addTab(tabLayout7.newTab().setText("Inheritence"));
                tabLayout7.addTab(tabLayout7.newTab().setText("Polymorphism"));
                tabLayout7.setTabGravity(TabLayout.GRAVITY_FILL);

                final ViewPager pager7 = (ViewPager)findViewById(viewPager);
                pager7.setAdapter(new MyPagerAdapter7(getSupportFragmentManager()));
                pager7.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout7));
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
                TabLayout tabLayout8 = (TabLayout) findViewById(R.id.tab_layouttuts);
                tabLayout8.addTab(tabLayout8.newTab().setText("Classes in Python"));
                tabLayout8.addTab(tabLayout8.newTab().setText("Objects in Python"));
                tabLayout8.setTabGravity(TabLayout.GRAVITY_FILL);

                final ViewPager pager8 = (ViewPager)findViewById(viewPager);
                pager8.setAdapter(new MyPagerAdapter8(getSupportFragmentManager()));
                pager8.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout8));
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
        }



    }
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
                    int imgres1 = R.drawable.banner;
                    String headin1 = "Intro to programming";
                    String cont1 = getResources().getString(R.string.article);
                    return minfragActivity.newInstance(imgres1,headin1,cont1);


                case 1:
                    int imgres2 = R.drawable.banner;
                    String headin2 = "Welcome to Python";
                    String cont2 = getResources().getString(R.string.aboutPython);
                    return minfragActivity.newInstance(imgres2,headin2,cont2);

                default:
                    int imgres3 = R.drawable.banner;
                    String headin3 = "Intro ti programming";
                    String cont3 = getResources().getString(R.string.article);
                    return minfragActivity.newInstance(imgres3,headin3,cont3);
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
                    int imgres1 = R.drawable.banner;
                    String headin1 = "Install Python on Windows";
                    String cont1 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres1,headin1,cont1);
                case 1:
                    int imgres2 = R.drawable.banner;
                    String headin2 = "Install Python on Mac";
                    String cont2 = getResources().getString(R.string.macinstall);
                    return minfragActivity.newInstance(imgres2,headin2,cont2);
                case 2:
                    int imgres3 = R.drawable.banner;
                    String headin3 = "Using Text Editors/IDE";
                    String cont3 = getResources().getString(R.string.textEditors);
                    return minfragActivity.newInstance(imgres3,headin3,cont3);
                default:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);
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
                    int img2 = R.drawable.banner;
                    String head2 = "Your First Python Program";
                    String content2 = getResources().getString(R.string.helloWorld);
                    String subcont2 = getResources().getString(R.string.helloWorld2);
                    String code = "<font color='#ff5722'>print</font>"+"(<font color='#2e7d32'>\"Hello World!\"</font>)";
                    String output ="<font color='#00838f'>Hello World!</font>";
                    return fullfragActivity.newInstance(img2,head2,content2,code,output,subcont2);
                case 1:
                    int imgres1 = R.drawable.banner;
                    String headin1 = "Using print()";
                    String cont1 = getResources().getString(R.string.print);
                    String subcont1 = getResources().getString(R.string.print2);
                    String code1 = "a = 12<br/>"+"b = 23<br/>"+"sum = a + b<br/>"+"<font color='#ff5722'>print</font>("+"<font color='#004d40'>sum</font>)";
                    String op1 = "<font color='#00838f'>35</font>";
                    return fullfragActivity.newInstance(imgres1,headin1,cont1,code1,op1,subcont1);
                case 2:
                    int imgres2 = R.drawable.banner;
                    String headin2 = "Using input()";
                    String cont2 = getResources().getString(R.string.input);
                    String subcontent2 = getResources().getString(R.string.input2);
                    String code2 = "fruit = <font color='#673ab7'>input</font>(<font color='#2e7d32'>\"Enter your favourite fruit name: \"</font>)<br/><font color='#ff5722'>print</font>(<font color='#004d40'>fruit</font>)";
                    String op2 = "<font color='#00838f'>Enter your favourite fruit name: Apple<br/>Apple</font>";
                    return fullfragActivity.newInstance(imgres2,headin2,cont2,code2,op2,subcontent2);
                default: int imgres3 = R.drawable.banner;
                    String headin3 = "Using print()";
                    String cont3 = getResources().getString(R.string.print);
                    String subcont3 = getResources().getString(R.string.print2);
                    String code3 = "a = 12<br/>"+"b = 23<br/>"+"sum = a + b<br/>"+"<font color='#ff5722'>print</font>("+"<font color='#004d40'>sum</font>)";
                    String op3 = "<font color='#00838f'>35</font>";
                    return fullfragActivity.newInstance(imgres3,headin3,cont3,code3,op3,subcont3);

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
                    int img2 = R.drawable.banner;
                    String head2 = "Variables in Python";
                    String content2 = getResources().getString(R.string.variables);
                    String subcont2 = getResources().getString(R.string.variables2);
                    String code = "#Integer Variable<br/>a = 23<br/>#Float Variable<br/>b = 12.52<br/>#String Variable<br/>c = 'Amazing App!'";
                    return tillcodefragActivity.newInstance(img2,head2,content2,code,subcont2);
                case 1:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "DataTypes in Python";
                    String cont4 = getResources().getString(R.string.datatypes);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);

                case 2:
                    int imgres5 = R.drawable.banner;
                    String headin5 = "Numbers in Python";
                    String cont5 = getResources().getString(R.string.numbers);
                    return minfragActivity.newInstance(imgres5,headin5,cont5);
                case 3:
                    int img3 = R.drawable.banner;
                    String head3 = "Strings in Python";
                    String content3 = getResources().getString(R.string.strings);
                    String subcont3 = getResources().getString(R.string.strings2);
                    String code3 = "x = \"<font color='#2e7d32'>Welcome to CodeInPython</font>\"<br/>y = '<font color='#2e7d32'>Welcome to CodeInPython</font>'<br/><font color='#ff5722'>print</font>(x)<br/><font color='#ff5722'>print</font>(y)";
                    String output3 ="<font color='#00838f'>Welcome to CodeInPython<br/>Welcome to CodeInPython</font>";
                    return fullfragActivity.newInstance(img3,head3,content3,code3,output3,subcont3);
                case 4:
                    int img4 = R.drawable.banner;
                    String head4 = "Lists in Python";
                    String content4 = getResources().getString(R.string.lists);
                    String subcont4 = getResources().getString(R.string.lists2);
                    String code4 = "<font color='#673ab7'>a</font> = [<font color='#3f51b5'>1, 4, 3, 7, 9</font>]<br/><font color='#673ab7'>a</font>.append(45)<br/><font color='#ff5722'>print</font>(<font color='#673ab7'>a</font>)<br/><font color='#673ab7'>a</font>.sort()<br/><font color='#ff5722'>print</font>(<font color='#673ab7'>a</font>)";
                    String output4 ="<font color='#00838f'>[1, 4, 3, 7, 9, 45]<br/>[1, 3, 4, 7, 9, 45]</font>";
                    return fullfragActivity.newInstance(img4,head4,content4,code4,output4,subcont4);

                case 5:
                    int img = R.drawable.banner;
                    String head = "Tuples in Python";
                    String cont = getResources().getString(R.string.tuples);
                    String codetuple = "tuple = (<font color='#3f51b5'>‘python’, 45, 56, 2</font>)<br/><font color='#ff5722'>print</font>(tuple)<br/><font color='#ff5722'>print</font>(tuple[2])";
                    String out = "<font color='#00838f'>('python', 45, 56, 2)<br/>56 </font>";
                    return tilloutputfragActivity.newInstance(img,head,cont,codetuple,out);

                case 6:
                    int img6 = R.drawable.banner;
                    String head6 = "Tuples in Python";
                    String cont6 = getResources().getString(R.string.tuples);
                    String codedict = "dict1</font> = {}<br/>dict1['<font color='#1565c0'>one</font>'] = \"<font color='#2e7d32'>code in </font>\"<br/>dict1[<font color='#1565c0'>2</font>] = \"<font color='#2e7d32'>python</font>\"<br/><font color='#ff5722'>print</font>(dict1)<br/><font color='#ff5722'>print</font>(dict1['<font color='#1565c0'>one</font>'])";
                    String outdict = "<font color='#00838f'>{'one': 'code in ', 2: 'python'}<br/>code in </font>";
                    return tilloutputfragActivity.newInstance(img6,head6,cont6,codedict,outdict);

                default:
                    int imgres41 = R.drawable.banner;
                    String headin41 = "DataTypes in Python";
                    String cont41 = getResources().getString(R.string.datatypes);
                    return minfragActivity.newInstance(imgres41,headin41,cont41);

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
                    int imgif = R.drawable.banner;
                    String headif = "if Statement";
                    String contif = getResources().getString(R.string.ifStatement);
                    String codeif = "a = int(<font color='#673ab7'>input</font>(<font color='#2e7d32'>\"Enter number:\"</font>))<br/>"+"if(a % 2 == 0):<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is Even\"</font>)";
                    String outif = "<font color='#00838f'>Enter number: 12<br/>The number is </font>";
                    return tilloutputfragActivity.newInstance(imgif,headif,contif,codeif,outif);

                case 1:
                    int imgelse = R.drawable.banner;
                    String headelse = "else Statement";
                    String contelse = getResources().getString(R.string.elseStatement);
                    String codeelse = "a = int(<font color='#673ab7'>input</font>(<font color='#2e7d32'>\"Enter number:\"</font>))<br/>"
                            +"<br/>&nbsp;&nbsp;&nbsp;if(a % 2 == 0):<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is Even\"</font>)"
                            +"<br/>else:<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is Odd\"</font>)";
                    String outelse = "<font color='#00838f'>Enter number: 43<br/>The number is Odd</font>";
                    return tilloutputfragActivity.newInstance(imgelse,headelse,contelse,codeelse,outelse);

                case 2:
                    int imgelif = R.drawable.banner;
                    String headelif = "elif Statement";
                    String contelif = getResources().getString(R.string.elifStatement);
                    String codeelif = "a = int(<font color='#673ab7'>input</font>(<font color='#2e7d32'>\"Enter number:\"</font>))<br/>"
                            +"if(a % 2 == 0):<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is Even\"</font>)"
                            +"<br/>&nbsp;&nbsp;&nbsp;elif(a == 0):<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is Zero\"</font>)"
                            +"<br/>else:<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is Odd\"</font>)";
                    String outelif = "<font color='#00838f'>Enter number: 0<br/>The number is Zero</font>";
                    return tilloutputfragActivity.newInstance(imgelif,headelif,contelif,codeelif,outelif);

                case 3:
                    int imgelse1 = R.drawable.banner;
                    String headelse1 = "Nested if Statement";
                    String contelse1 = getResources().getString(R.string.nestedif);
                    String codeelse1 ="a = int(<font color='#673ab7'>input</font>(<font color='#2e7d32'>\"Enter number:\"</font>))<br/>"
                        +"if(a < 100):<br/>"+
                        "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is less than 100\"</font>)"
                        +"<br/>&nbsp;&nbsp;&nbsp;if(a == 50):<br/>"+
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is 50\"</font>)"
                        +"<br/>else:<br/>"+"&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"The number is more than 100\"</font>)";
                    String outelse1 = "<font color='#00838f'>Enter number: 50<br/>The number is less than 100<br/>The number is 50</font>";
                    return tilloutputfragActivity.newInstance(imgelse1,headelse1,contelse1,codeelse1,outelse1);

                default:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);
            }
        }

        @Override
        public int getCount() {
            return 4;
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
                    int imgfunc = R.drawable.banner;
                    String headfunc = "Install Python on Windows";
                    String contfunc = getResources().getString(R.string.functions);
                    String subcontfunc = getResources().getString(R.string.defineFunction);
                    String codefunc = "<font color='#673ab7'>def</font> functionName(<font color='#2e7d32'>parameters</font>):<br/>&nbsp;&nbsp;&nbsp;<font color='#004d40'>function_body</font><br/>&nbsp;&nbsp;&nbsp;<font color='#673ab7'>return</font> expression";
                    return tillcodefragActivity.newInstance(imgfunc,headfunc,contfunc,codefunc,subcontfunc);
                case 1:
                    int imgcall = R.drawable.banner;
                    String headcall = "Calling a Function";
                    String contcall = getResources().getString(R.string.callFunction);
                    String subcontcall = getResources().getString(R.string.defaultArguments);
                    String codecall ="<font color='#673ab7'>def</font> display(<font color='#2e7d32'>num</font>):<br/>" +
                            "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(<font color='#004d40'>\"Number passed\"</font>, num)" +
                            "<br/>&nbsp;&nbsp;&nbsp;<font color='#673ab7'>return</font><br/>"+
                            "<br/>x = 65<br/>display(x)";
                    String outcall = "<font color='#00838f'>Number passed 65</font>";
                    return fullfragActivity.newInstance(imgcall,headcall,contcall,codecall,outcall,subcontcall);

                default:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);
            }
        }

        @Override
        public int getCount() {
            return 2;
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
                    int imgres1 = R.drawable.banner;
                    String headin1 = "for Loop in Python";
                    String cont1 = getResources().getString(R.string.forloop);
                    String codefor = "x = <font color='#2e7d32'>[1, 2, 3, 4]</font><br/>" +
                            "<font color='#673ab7'>for</font> <font color='#004d40'>in</font> x:" +
                            "<br/>&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(x)<br/>";
                    String outfor = "<font color='#00838f'>1<br/>2<br/>3<br/>4</font>";
                    return tilloutputfragActivity.newInstance(imgres1,headin1,cont1,codefor,outfor);
                case 1:
                    int imgres2 = R.drawable.banner;
                    String headin2 = "while Loop in Python";
                    String cont2 = getResources().getString(R.string.whileloop);
                    String codewhile = "x = 1<br/>" +
                            "<font color='#673ab7'>while</font> x <pre><=</pre> 5:<br/>" +
                            "<br/>&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(x)<br/>"
                            +"&nbsp;&nbsp;&nbsp;x = x + 1";
                    String outwhile = "<font color='#00838f'>1<br/>2<br/>3<br/>4<br/>5</font>";
                    return tilloutputfragActivity.newInstance(imgres2,headin2,cont2,codewhile,outwhile);

                default:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);
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
                    int imgres1 = R.drawable.banner;
                    String headin1 = "Object Oriented Programming";
                    String cont1 = getResources().getString(R.string.oop);
                    return minfragActivity.newInstance(imgres1,headin1,cont1);
                case 1:
                    int imgres2 = R.drawable.banner;
                    String headin2 = "Encapsulation";
                    String cont2 = getResources().getString(R.string.encapsulation);
                    return minfragActivity.newInstance(imgres2,headin2,cont2);
                case 2:
                    int imgres3 = R.drawable.banner;
                    String headin3 = "Abstraction";
                    String cont3 = getResources().getString(R.string.abstraction);
                    return minfragActivity.newInstance(imgres3,headin3,cont3);
                case 3:
                    int imgres21 = R.drawable.banner;
                    String headin21 = "Inheritance";
                    String cont21 = getResources().getString(R.string.inheritance);
                    return minfragActivity.newInstance(imgres21,headin21,cont21);
                case 4:
                    int imgres31 = R.drawable.banner;
                    String headin31 = "Polymorphism";
                    String cont31 = getResources().getString(R.string.polymorphism);
                    return minfragActivity.newInstance(imgres31,headin31,cont31);
                default:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);
            }
        }

        @Override
        public int getCount() {
            return 5;
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
                    int imgres1 = R.drawable.banner;
                    String headin1 = "Class in Python";
                    String cont1 = getResources().getString(R.string.classes);
                    String codeclass = "class Student:<br/>" +
                            " &nbsp; def __init__(self, name, marks):<br/>" +
                            " &nbsp;&nbsp;&nbsp;&nbsp;self.name = name<br/>" +
                            " &nbsp;&nbsp;&nbsp;&nbsp;self.marks = marks<br/>" +
                            " &nbsp;&nbsp; def displayinfo(self):<br/>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;print (\"Name : \", self.name,  \" Marks: \", self.marks)\n";
                    String subcont1 = getResources().getString(R.string.init);

                    return tillcodefragActivity.newInstance(imgres1,headin1,cont1,codeclass,subcont1);
                case 1:
                    int img = R.drawable.banner;
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
                    return ObjectsfragTutorials.newInstance(img,head,cont,code,subcont,out,subsub);


                default:
                    int imgres4 = R.drawable.banner;
                    String headin4 = "Install Python on Windows";
                    String cont4 = getResources().getString(R.string.windowsInstall);
                    return minfragActivity.newInstance(imgres4,headin4,cont4);
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

}
