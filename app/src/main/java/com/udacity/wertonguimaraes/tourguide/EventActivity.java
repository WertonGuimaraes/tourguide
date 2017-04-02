package com.udacity.wertonguimaraes.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView rvItem;
    private InfoListAdapter adapter;
    private Toolbar mToolbat;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        mInitView();
        mPopulateRecyclerView(RestaurantsInfo());
        setSupportActionBar(mToolbat);
        createDrawer();
        mInitListeners();
    }

    private void mInitView() {
        rvItem = (RecyclerView)findViewById(R.id.recycler_view);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mToolbat = (Toolbar) findViewById(R.id.toolbar);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    private void mPopulateRecyclerView(List<Info> infoList) {
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        adapter = new InfoListAdapter(EventActivity.this, infoList);
        rvItem.setAdapter(adapter);
    }

    private void mInitListeners() {
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    private void createDrawer() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, mToolbat, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.setDrawerListener(toggle);
        toggle.syncState();
    }

    private List<Info> RestaurantsInfo() {
        List<Info> mInfoList = new ArrayList<>();
        mInfoList.add(new Info(1, "1", "decricao"));
        mInfoList.add(new Info(2, "2", "decricao"));
        mInfoList.add(new Info(3, "3", "decricao"));
        mInfoList.add(new Info(4, "4", "decricao"));
        mInfoList.add(new Info(5, "5", "decricao"));
        mInfoList.add(new Info(6, "6", "decricao"));
        mInfoList.add(new Info(7, "7", "decricao"));
        return mInfoList;
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_restaurant) {
            startNewActivity(RestaurantActivity.class);
        } else if (id == R.id.nav_event) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void startNewActivity(Class<?> activityClass) {
        Intent myIntent = new Intent(this, activityClass);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        this.startActivity(myIntent);
    }
}
