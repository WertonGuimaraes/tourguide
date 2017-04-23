package com.udacity.wertonguimaraes.tourguide.activity;

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

import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.adpter.InfoListAdapter;
import com.udacity.wertonguimaraes.tourguide.model.Info;

import java.util.List;

/**
 * Created by wertonguimaraes on 16/04/17.
 */

public class InfoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

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

    protected void mPopulateRecyclerView(List<Info> infoList) {
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        adapter = new InfoListAdapter(InfoActivity.this, infoList);
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
        int id = item.getItemId();

        if (id == R.id.nav_restaurant) {
            startNewActivity(RestaurantActivity.class);
        } else if (id == R.id.nav_touristic_point) {
            startNewActivity(TouristicPointActivity.class);
        } else if (id == R.id.nav_bar) {
            startNewActivity(BarPointActivity.class);
        } else if (id == R.id.nav_hotel) {
            startNewActivity(HotelPointActivity.class);
        } else if (id == R.id.nav_shop) {
            startNewActivity(ShopPointActivity.class);
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
