package com.udacity.wertonguimaraes.tourguide.activity;

import android.os.Bundle;

import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.model.Info;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends InfoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPopulateRecyclerView(RestaurantsInfo());
    }

    private List<Info> RestaurantsInfo() {
        List<Info> mInfoList = new ArrayList<>();

        mInfoList.add(
                new Info(1, getString(R.string.baixinho), getString(R.string.baixinho_street),
                        getString(R.string.baixinho_phone), getString(R.string.baixinho_description),
                        R.drawable.baixinho));

        mInfoList.add(
                new Info(2, getString(R.string.la_suissa), getString(R.string.la_suissa_street),
                        getString(R.string.la_suissa_phone), getString(R.string.la_suissa_description),
                        R.drawable.la_suissa));

        mInfoList.add(
                new Info(3, getString(R.string.skina_da_tapioca), getString(R.string.skina_da_tapioca_street),
                        getString(R.string.skina_da_tapioca_phone), getString(R.string.skina_da_tapioca_description),
                        R.drawable.skina_da_tapioca));

        return mInfoList;
    }
}
