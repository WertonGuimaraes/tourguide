package com.udacity.wertonguimaraes.tourguide.activity;

import android.os.Bundle;

import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.model.Info;

import java.util.ArrayList;
import java.util.List;

public class ShopPointActivity extends InfoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPopulateRecyclerView(ShopPointsInfo());
    }

    private List<Info> ShopPointsInfo() {
        List<Info> mInfoList = new ArrayList<>();
        mInfoList.add(
                new Info(1, getString(R.string.vila_do_artesao), getString(R.string.vila_do_artesao_street),
                        getString(R.string.vila_do_artesao_phone), getString(R.string.vila_do_artesao_description),
                        R.drawable.shop_sao_joao));

        mInfoList.add(
                new Info(2, getString(R.string.partage_shopping), getString(R.string.partage_shopping_street),
                        getString(R.string.partage_shopping_phone), getString(R.string.partage_shopping_description),
                        R.drawable.shop_partage));

        mInfoList.add(
                new Info(3, getString(R.string.luiza_motta), getString(R.string.luiza_motta_street),
                        getString(R.string.luiza_motta_phone), getString(R.string.luiza_motta_description),
                        R.drawable.shop_luiza_motta)
        );

        return mInfoList;
    }
}
