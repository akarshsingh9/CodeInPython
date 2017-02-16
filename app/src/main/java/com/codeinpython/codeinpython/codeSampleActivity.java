package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class codeSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_sample);

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
                String heading1 = "print()";
               // String desc1 = "print() is a built-in Python function to display output to the user. Notice there is no semicolon in the end of the statement.";
                String coding1 = "<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"I hope you are enjoying CodeInPython App. \"</font>)";
                FragmentTransaction fragtrans = getSupportFragmentManager().beginTransaction();
                fragtrans.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading1,coding1));
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
                String headin2 = "if - else";
                //String desc2 = "if - else helps to apply conditions to our python code. The working is quite simple, if a condition is true then the particular block of code would run in python, if the condition is not true then statements under else would execute";
                String coding2 = "# to find maximum between three numbers<br/><br/>"+
                        "num1 = 23<br/>" +
                        "num2 = 34<br/>" +
                        "num3 = 56<br/>" +
                        "if num1 > num2 and num1 > num3:<br/>" +
                        "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(num1, <font color='#2e7d32'>\"is greatest\"</font>)<br/>" +
                        "elif num2 > num3:<br/>" +
                        "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(num2, <font color='#2e7d32'>\"is greatest\"</font>)<br/>" +
                        "else:<br/>" +
                        "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(num3, <font color='#2e7d32'>\"is greatest\"</font>)<br/>";

                FragmentTransaction fragtrans1 = getSupportFragmentManager().beginTransaction();
                fragtrans1.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(headin2,coding2));
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
                String heading3 = "for loop";
                String desc3 = "for loop is used to iterate a block of code. The number of iteration is finite and is already decided before the loop begins.";
                String coding3 = "# to print the table for n number<br/><br/>" +
                        "n = 5<br/>" +
                        "for i in range(1, 11):<br/>" +
                        "&nbsp;&nbsp;&nbsp;ans = i * n<br/>" +
                        "&nbsp;&nbsp;&nbsp;<font color='#ff5722'>print</font>(n, \" x \", i, \" = \", ans)";
                FragmentTransaction fragtrans2 = getSupportFragmentManager().beginTransaction();
                fragtrans2.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading3,coding3));
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
                String heading4 = "while loop";
                String desc4 = "while loop is used to iterate over a block of code if the condition of while loop is true. While loop runs until the condition is true, hence the number of times the loop will run is not fixed before hand.";
                String coding4 = "n = 10<br/>" +
                        "<font color='#ff5722'>print</font>(<font color='#2e7d32'>\"all even numbers from 1 to \"</font, n, <font color='#2e7d32'>\" are: \"</font>)<br/>" +
                        "i = 1<br/>" +
                        "while i < = n: <br/>" +
                        "&nbsp;&nbsp;&nbsp;if i % 2 == 0:<br/>" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;print(i)<br/>" +
                        "&nbsp;&nbsp;&nbsp;i += 1";
                FragmentTransaction fragtrans3 = getSupportFragmentManager().beginTransaction();
                fragtrans3.replace(R.id.codeSamplePlaceholder,codingFragment.newInstance(heading4,coding4));
                fragtrans3.commit();
                break;

        }

    }
}
