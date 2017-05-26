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
                new Info(
                        1,
                        "GARDEN HOTEL",
                        "Rua Eng. José Bezerra, 400 - Mirante, Campina Grande - PB",
                        "(83) 3310-4000",
                        "desc",
                        R.drawable.hotel_garden));

        mInfoList.add(
                new Info(
                        2,
                        "HOTEL VILLAGE",
                        "R. Otacílio Nepomuceno, 1285 - Catolé, Campina Grande - PB",
                        "(83) 3310-8000",
                        "desc",
                        R.drawable.hotel_village));

        mInfoList.add(
                new Info(
                        3,
                        "POUSADA GRANVILE",
                        "R. Manoel Felíciano, 600 - Jardim Quarenta, Campina Grande - PB",
                        "(83) 3335-2436",
                        "desc",
                        R.drawable.hotel_granvile));
        return mInfoList;
    }
}
