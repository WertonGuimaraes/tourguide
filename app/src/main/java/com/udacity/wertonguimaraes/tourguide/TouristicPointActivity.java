package com.udacity.wertonguimaraes.tourguide;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TouristicPointActivity extends InfoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPopulateRecyclerView(TouristicPointsInfo());
    }

    private List<Info> TouristicPointsInfo() {
        List<Info> mInfoList = new ArrayList<>();
//        mInfoList.add(new Info(1, "1", "decricao"));
//        mInfoList.add(new Info(2, "2", "decricao"));
//        mInfoList.add(new Info(3, "3", "decricao"));
//        mInfoList.add(new Info(4, "4", "decricao"));
//        mInfoList.add(new Info(5, "5", "decricao"));
//        mInfoList.add(new Info(6, "6", "decricao"));
//        mInfoList.add(new Info(7, "7", "decricao"));
        return mInfoList;
    }
}
