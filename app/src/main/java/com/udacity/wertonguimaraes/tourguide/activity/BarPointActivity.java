package com.udacity.wertonguimaraes.tourguide.activity;

import android.os.Bundle;

import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.model.Info;

import java.util.ArrayList;
import java.util.List;

public class BarPointActivity extends InfoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPopulateRecyclerView(BarPointsInfo());
    }

    private List<Info> BarPointsInfo() {
        List<Info> mInfoList = new ArrayList<>();
        mInfoList.add(
                new Info(1, getString(R.string.arena_pub), getString(R.string.arena_pub_street),
                        getString(R.string.arena_pub_phone), getString(R.string.arena_pub_description),
                        R.drawable.bar_arena));

        mInfoList.add(
                new Info(2, getString(R.string.nilson_bar), getString(R.string.nilson_bar_street),
                        null, getString(R.string.nilson_bar_description), R.drawable.bar_nilson));

        mInfoList.add(
                new Info(2, getString(R.string.petiscaria_bar), getString(R.string.petiscaria_bar_street),
                        getString(R.string.petiscaria_bar_description), getString(R.string.petiscaria_bar_description),
                        R.drawable.bar_petiscaria));

        return mInfoList;
    }
}
