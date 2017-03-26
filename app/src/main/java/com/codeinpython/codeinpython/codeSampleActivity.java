package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class codeSampleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_sample);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.cordinateLayout);
        int position = getIntent().getExtras().getInt("codePosition");


        switch (position)
        {
            case 0:
                Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar);
                toolbar.setNavigationIcon(R.drawable.backbutton);
                toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });


                String heading1 = "Using print()";
                String url = "<script src=\"https://gist.github.com/akarshsingh9/f7e1d27affba80c7e4f6f7d887b74e89.js\"></script>";
                //String url = "https://gist.github.com/akarshsingh9/f7e1d27affba80c7e4f6f7d887b74e89";
                FragmentTransaction fragtrans = getSupportFragmentManager().beginTransaction();
                fragtrans.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading1,url));
                fragtrans.commit();
                break;
            case 1:
                Toolbar toolbar1 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar1);
                toolbar1.setNavigationIcon(R.drawable.backbutton);
                toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String headin2 = "Using input()";
                String url1 = "<script src=\"https://gist.github.com/akarshsingh9/3b3e7dbb52fa6f19ca88dfd7bfa5af17.js\"></script>";
                FragmentTransaction fragtrans1 = getSupportFragmentManager().beginTransaction();
                fragtrans1.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(headin2,url1));
                fragtrans1.commit();
                break;
            case 2:
                Toolbar toolbar2 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar2);
                toolbar2.setNavigationIcon(R.drawable.backbutton);
                toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading3 = "Display String";
                String url2 = "<script src=\"https://gist.github.com/akarshsingh9/7ca85490f4e138c6c119547d5054400c.js\"></script>";
                FragmentTransaction fragtrans2 = getSupportFragmentManager().beginTransaction();
                fragtrans2.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading3,url2));
                fragtrans2.commit();
                break;
            case 3:
                Toolbar toolbar3 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar3);
                toolbar3.setNavigationIcon(R.drawable.backbutton);
                toolbar3.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading4 = "Raw String in Python";
                String url3 = "<script src=\"https://gist.github.com/akarshsingh9/f3c9850e6d93766aad74f1ddafc15ca7.js\"></script>";
                FragmentTransaction fragtrans3 = getSupportFragmentManager().beginTransaction();
                fragtrans3.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading4,url3));
                fragtrans3.commit();
                break;

            case 4:
                Toolbar toolbar4 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar4);
                toolbar4.setNavigationIcon(R.drawable.backbutton);
                toolbar4.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading5 = "String Concatenation";
                String url4 = "<script src=\"https://gist.github.com/akarshsingh9/56753768b07b0006020e638e5b883977.js\"></script>";
                FragmentTransaction fragtrans4 = getSupportFragmentManager().beginTransaction();
                fragtrans4.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading5,url4));
                fragtrans4.commit();
                break;
            case 5:
                Toolbar toolbar5 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar5);
                toolbar5.setNavigationIcon(R.drawable.backbutton);
                toolbar5.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading6 = "String Manipulation";
                String url5 = "<script src=\"https://gist.github.com/akarshsingh9/6f140297a8c04b7cfdf4976a83dd7c48.js\"></script>";
                FragmentTransaction fragtrans5 = getSupportFragmentManager().beginTransaction();
                fragtrans5.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading6,url5));
                fragtrans5.commit();
                break;
            case 6:
                Toolbar toolbar6 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar6);
                toolbar6.setNavigationIcon(R.drawable.backbutton);
                toolbar6.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading7 = "Lists in Python";
                String url6 = "<script src=\"https://gist.github.com/akarshsingh9/ee6600933c86dfe491eb37f7f50f37a0.js\"></script>";
                FragmentTransaction fragtrans6 = getSupportFragmentManager().beginTransaction();
                fragtrans6.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading7,url6));
                fragtrans6.commit();
                break;
            case 7:
                Toolbar toolbar7 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar7);
                toolbar7.setNavigationIcon(R.drawable.backbutton);
                toolbar7.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading8 = "Voting Age Problem";
                String url7 = "<script src=\"https://gist.github.com/akarshsingh9/bdaf28d13df8d596319f6c6e62427202.js\"></script>";
                FragmentTransaction fragtrans7 = getSupportFragmentManager().beginTransaction();
                fragtrans7.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading8,url7));
                fragtrans7.commit();
                break;
            case 8:
                Toolbar toolbar8 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar8);
                toolbar8.setNavigationIcon(R.drawable.backbutton);
                toolbar8.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading9 = "Simple for loop";
                String url8 = "<script src=\"https://gist.github.com/akarshsingh9/060d449d934e8bb357f13b3bb19b74a9.js\"></script>";
                FragmentTransaction fragtrans8 = getSupportFragmentManager().beginTransaction();
                fragtrans8.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading9,url8));
                fragtrans8.commit();
                break;
            case 9:
                Toolbar toolbar9 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar9);
                toolbar9.setNavigationIcon(R.drawable.backbutton);
                toolbar9.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading10 = "Simple while loop";
                String url9 = "<script src=\"https://gist.github.com/akarshsingh9/de9422637d8aa201bed477233c5e8d83.js\"></script>";
                FragmentTransaction fragtrans9 = getSupportFragmentManager().beginTransaction();
                fragtrans9.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading10,url9));
                fragtrans9.commit();
                break;
            case 10:
                Toolbar toolbar10 = (Toolbar)findViewById(R.id.toolbarcoding2);
                setSupportActionBar(toolbar10);
                toolbar10.setNavigationIcon(R.drawable.backbutton);
                toolbar10.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
                String heading11 = "Class in Python";
                String url10 = "<script src=\"https://gist.github.com/akarshsingh9/14fedf258a2c9691a3b9e6c7e098c08a.js\"></script>";
                FragmentTransaction fragtrans10 = getSupportFragmentManager().beginTransaction();
                fragtrans10.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading11,url10));
                fragtrans10.commit();
                break;


        }

    }
}
