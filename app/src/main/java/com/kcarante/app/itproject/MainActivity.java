package com.kcarante.app.itproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.kcarante.app.itproject.Adapter.GridView;
import com.kcarante.app.itproject.Constructor.Project;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ListViewCompat mList;
    private ArrayList<Project> project_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mList = (ListViewCompat) findViewById(R.id.list_item);
        project_list = new ArrayList<>();
        createData();

        GridView adapter = new GridView(MainActivity.this,R.layout.grid_layout, project_list);
        mList.setAdapter(adapter);
    }

    public void createData(){

        project_list.add(new Project("1", "Tita Pinks Carenderia", "Back gate canteen", "ads_url", 1000.00,"Food", 18, 500.00, 589, 1806, 2807, "1A", R.drawable.foods));
        project_list.add(new Project("2", "Food Court", "Eat all you can", "ads_url", 1000.00,"Food", 18, 500.00, 589, 1806, 2807, "2A", R.drawable.eat));
        project_list.add(new Project("3", "Washmeneyney", "Laundry Shop", "ads_url", 5000.00,"Laundry", 18, 100.00, 589, 1806, 2807, "3A", R.drawable.laundry));
        project_list.add(new Project("4", "Banana Stall", "Fresh bananas", "ads_url", 1000.00,"Food", 18, 500.00, 589, 1806, 2807, "4A", R.drawable.banana));
        project_list.add(new Project("5", "Water Refilling Station", "Get your water", "ads_url", 1000.00,"Water", 18, 500.00, 589, 1806, 2807, "5A", R.drawable.water));
        project_list.add(new Project("6", "JugarBells", "Cigarette Shop", "ads_url", 5000.00,"Smoke", 18, 100.00, 589, 1806, 2807, "6A", R.drawable.cigarette));

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
