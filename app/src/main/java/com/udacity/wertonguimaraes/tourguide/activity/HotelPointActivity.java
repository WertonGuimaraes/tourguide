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
                        2,
                        "OS PIONEIROS",
                        "R. Paulo de Frontin, 483-499 - Centro, Campina Grande - PB",
                        null,
                        "'Os Pioneiros da Borborema' homenageia as figuras do índio, da catadora de algodão e do tropeiro. O índio representa o início de tudo. A catadora de algodão faz referência à 'Era de Ouro' de Campina Grande, quando o município se tornou o segundo maior exportador de algodão do mundo. E o tropeiro presta homenagem à vocação comerciária da cidade.",
                        R.drawable.banner_pioneiros));
        return mInfoList;
    }
}
