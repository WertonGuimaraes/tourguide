package com.udacity.wertonguimaraes.tourguide.activity;

import android.os.Bundle;

import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.model.Info;

import java.util.ArrayList;
import java.util.List;

public class HotelPointActivity extends InfoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPopulateRecyclerView(HotelPointsInfo());
    }

    private List<Info> HotelPointsInfo() {
        List<Info> mInfoList = new ArrayList<>();
        mInfoList.add(
                new Info(1, getString(R.string.garden_hotel), getString(R.string.garden_hotel_street),
                        getString(R.string.garden_hotel_phone), getString(R.string.garden_hotel_description),
                        R.drawable.hotel_garden));

        mInfoList.add(
                new Info(2, getString(R.string.hotel_village), getString(R.string.hotel_village_street),
                        getString(R.string.hotel_village_phone), getString(R.string.hotel_village_description),
                        R.drawable.hotel_village));

        mInfoList.add(
                new Info(3, getString(R.string.pousada_granvile), getString(R.string.pousada_granvile_street),
                        getString(R.string.pousada_granvile_phone), getString(R.string.pousada_granvile_description),
                        R.drawable.hotel_granvile));
        return mInfoList;
    }
}
