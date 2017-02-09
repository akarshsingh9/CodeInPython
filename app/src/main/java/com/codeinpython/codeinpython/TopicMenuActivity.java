package com.codeinpython.codeinpython;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class TopicMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_menu);

        Toolbar toolbar21 = (Toolbar) findViewById(R.id.toolbartopics);
        setSupportActionBar(toolbar21);
        new DrawerBuilder().withActivity(this).build();

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(R.drawable.home);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Favorites").withIcon(R.drawable.favorite);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName("Tutorials").withIcon(R.drawable.home);
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIdentifier(4).withName("Code Samples").withIcon(R.drawable.home);
        SecondaryDrawerItem item5 = new SecondaryDrawerItem().withIdentifier(5).withName("Settings").withIcon(R.drawable.settings);
        SecondaryDrawerItem item6 = new SecondaryDrawerItem().withIdentifier(6).withName("Rate us").withIcon(R.drawable.star);

        // Create the AccountHeader
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.navheader)
                .addProfiles(
                        new ProfileDrawerItem().withName("Mike Penz").withEmail("mikepenz@gmail.com").withIcon(getResources().getDrawable(R.drawable.userimage))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();


//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withAccountHeader(headerResult)
                .withToolbar(toolbar21)
                .addDrawerItems(
                        item1,item2,item3,item4,
                        new DividerDrawerItem(),
                        item5,item6
                )
                /*.withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        switch()
                    }
                })*/
                .build();





        int pos = getIntent().getExtras().getInt("pos");

        switch (pos) {
            case 0:
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                TopicfullFragment topicfullFragment = new TopicfullFragment();
                fragmentTransaction.replace(R.id.placeholderFragment, topicfullFragment);
                fragmentTransaction.commit();


                break;
            case 1:
                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                codeSampleFragment codeSampleFragment = new codeSampleFragment();
                //EmptyFrag emptyFrag = EmptyFrag.newInstance("Working on Code Sample Section");
                fragmentTransaction1.replace(R.id.placeholderFragment, codeSampleFragment);
                fragmentTransaction1.commit();
                break;
            case 2:
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                //EmptyFrag emptyFrag1 = EmptyFrag.newInstance("Working on Quiz Section");
                quizWelcomeFragment quizWelcomeFragment = new quizWelcomeFragment();
                fragmentTransaction2.replace(R.id.placeholderFragment, quizWelcomeFragment);
                fragmentTransaction2.commit();
                break;
            case 3:
                FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                EmptyFrag emptyFrag2 = EmptyFrag.newInstance("Working on Certificate Section");
                fragmentTransaction3.replace(R.id.placeholderFragment, emptyFrag2);
                fragmentTransaction3.commit();
                break;
        }
    }


}
