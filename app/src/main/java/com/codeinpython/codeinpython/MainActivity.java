package com.codeinpython.codeinpython;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Firebase instance variables
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;

    //RecyclerView recyclerView;
    //RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //splash screen code
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String mUsername,mPhotoUrl;
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        if (mFirebaseUser == null) {
            // Not signed in, launch the Sign In activity
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        } else {
            mUsername = mFirebaseUser.getDisplayName();
            if (mFirebaseUser.getPhotoUrl() != null) {
                mPhotoUrl = mFirebaseUser.getPhotoUrl().toString();
            }
        }
        Toolbar toolbarmain = (Toolbar) findViewById(R.id.toolbarmain);
        setSupportActionBar(toolbarmain);



        new DrawerBuilder().withActivity(this).build();

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem items1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(R.drawable.home);
        PrimaryDrawerItem items2 = new PrimaryDrawerItem().withIdentifier(2).withName("Favorites").withIcon(R.drawable.favorite);
        PrimaryDrawerItem items3 = new PrimaryDrawerItem().withIdentifier(3).withName("Tutorials").withIcon(R.drawable.home);
        PrimaryDrawerItem items4 = new PrimaryDrawerItem().withIdentifier(4).withName("Code Samples").withIcon(R.drawable.home);
        SecondaryDrawerItem items5 = new SecondaryDrawerItem().withIdentifier(5).withName("Settings").withIcon(R.drawable.settings);
        SecondaryDrawerItem items6 = new SecondaryDrawerItem().withIdentifier(6).withName("Rate us").withIcon(R.drawable.star);

        // Create the AccountHeader
        AccountHeader headerResult1 = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.navheader)
                .addProfiles(
                        new ProfileDrawerItem().withName(mUsername).withEmail("mikepenz@gmail.com").withIcon(getResources().getDrawable(R.drawable.userimage))
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
                .withAccountHeader(headerResult1)
                .withToolbar(toolbarmain)
                .addDrawerItems(
                        items1,items2,items3,items4,
                        new DividerDrawerItem(),
                        items5,items6
                )
                /*.withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        switch()
                    }
                })*/
                .build();




        ArrayList<ListViewMainClass> listViewArrayList = new ArrayList<>();
        ListViewMainAdapter adapter = new ListViewMainAdapter(this,listViewArrayList);
        int[] images = new int[]{R.drawable.tuts,R.drawable.codesection,R.drawable.pythonlogo,R.drawable.quizimage};

        ListViewMainClass list = new ListViewMainClass("Tutorials",images[0],"Learn Python",Color.parseColor("#1d2538"));
        adapter.add(list);
        list = new ListViewMainClass("Py Code",images[1],"Review Python code" ,Color.parseColor("#1d2538"));
        adapter.add(list);
        list = new ListViewMainClass("Quiz",images[3],"Take Python Quiz" ,Color.parseColor("#1d2538"));
        adapter.add(list);
        list = new ListViewMainClass("Certificate",images[0],"Earn Certificate",Color.parseColor("#1d2538"));
        adapter.add(list);
        list = new ListViewMainClass("Glossary",images[0],"Refer Glossary",Color.parseColor("#1d2538"));
        adapter.add(list);
        list = new ListViewMainClass("About Us",images[1],"Code In Python",Color.parseColor("#1d2538"));
        adapter.add(list);
        GridView listView = (GridView)findViewById(R.id.gridview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent.putExtra("pos",position);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent1.putExtra("pos",position);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent2.putExtra("pos",position);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,TopicMenuActivity.class);
                        intent3.putExtra("pos",position);
                        startActivity(intent3);
                        break;
                    /*case 4:
                        Intent intent4 = new Intent(MainActivity.this,.class);
                        intent4.putExtra("pos",position);
                        startActivity(intent4);
                        break; */
                }
            }
        });
    }
}

