package com.codeinpython.codeinpython;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TopicMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_menu);

        Toolbar toolbar21 = (Toolbar) findViewById(R.id.toolbartopics);
        setSupportActionBar(toolbar21);
        toolbar21.setNavigationIcon(R.drawable.backbutton);
        toolbar21.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int back = getIntent().getExtras().getInt("back");
                if(back == 1)
                {
                    Intent intentback = new Intent(TopicMenuActivity.this,MainActivity.class);
                    startActivity(intentback);
                }

                onBackPressed();

            }
        });



        int pos = getIntent().getExtras().getInt("pos");

        switch (pos) {
            case 0:
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Tutorials");
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                TopicfullFragment topicfullFragment = new TopicfullFragment();
                fragmentTransaction.replace(R.id.placeholderFragment, topicfullFragment);
                fragmentTransaction.commit();


                break;
            case 1:
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("PY Code");
                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                codeSampleFragment codeSampleFragment = new codeSampleFragment();
                //EmptyFrag emptyFrag = EmptyFrag.newInstance("Working on Code Sample Section");
                fragmentTransaction1.replace(R.id.placeholderFragment, codeSampleFragment);
                fragmentTransaction1.commit();
                break;
            case 2:
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Quiz");
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                //EmptyFrag emptyFrag1 = EmptyFrag.newInstance("Working on Quiz Section");
                quizWelcomeFragment quizWelcomeFragment = new quizWelcomeFragment();
                fragmentTransaction2.replace(R.id.placeholderFragment, quizWelcomeFragment);
                fragmentTransaction2.commit();
                break;
            case 3:
                //noinspection ConstantConditions
                getSupportActionBar().setTitle("Glossary");
                FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                //EmptyFrag emptyFrag2 = EmptyFrag.newInstance("Working on Certificate Section");
                //fragmentTransaction3.replace(R.id.placeholderFragment, emptyFrag2);
                GlossaryFragment glossaryFragment = new GlossaryFragment();
                fragmentTransaction3.replace(R.id.placeholderFragment,glossaryFragment);
                fragmentTransaction3.commit();
                break;
            case 4:
                getSupportActionBar().setTitle("About Us");
                FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                AboutusFragment aboutusFragment = new AboutusFragment();
                fragmentTransaction4.replace(R.id.placeholderFragment,aboutusFragment);
                fragmentTransaction4.commit();
                break;
            case 5:
                getSupportActionBar().setTitle("Future");
                FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                FutureFragment futureFragment = new FutureFragment();
                fragmentTransaction5.replace(R.id.placeholderFragment,futureFragment);
                fragmentTransaction5.commit();
                break;
        }
    }



/* intent to activity to display the tuts finished from -> button buuton to come back to menu
        intent back to here pass args called pos with int value so switch case catches it

*/
}
