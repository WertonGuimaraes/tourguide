package com.udacity.wertonguimaraes.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RegionalFoodActivity extends AppCompatActivity {

    private RecyclerView rvItem;
    private InfoListAdapter adapter;
    private List<Info> mInfoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        rvItem = (RecyclerView)findViewById(R.id.recycler_view);
        rvItem.setLayoutManager(new LinearLayoutManager(this));

        mInfoList = new ArrayList<>();
        mInfoList.add(new Info(1, "a", "decricao"));
        mInfoList.add(new Info(2, "b", "decricao"));
        mInfoList.add(new Info(3, "c", "decricao"));
        mInfoList.add(new Info(4, "d", "decricao"));
        mInfoList.add(new Info(5, "e", "decricao"));
        mInfoList.add(new Info(6, "f", "decricao"));
        mInfoList.add(new Info(7, "g", "decricao"));

        adapter = new InfoListAdapter(RegionalFoodActivity.this, mInfoList);
        rvItem.setAdapter(adapter);
    }
}
