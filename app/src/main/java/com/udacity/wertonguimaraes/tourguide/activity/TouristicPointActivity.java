package com.udacity.wertonguimaraes.tourguide.activity;

import android.os.Bundle;

import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.model.Info;

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
        mInfoList.add(
                new Info(1, getString(R.string.museu_do_tres_pandeiros), getString(R.string.museu_do_tres_pandeiros_street),
                        getString(R.string.museu_do_tres_pandeiros_phone), getString(R.string.museu_do_tres_pandeiros_description),
                        R.drawable.banner_tres_pandeiros));

        mInfoList.add(
                new Info(2, getString(R.string.os_pioneiros), getString(R.string.os_pioneiros_street),
                        null, getString(R.string.os_pioneiros_description), R.drawable.banner_pioneiros));

        mInfoList.add(
                new Info(3, getString(R.string.parque_do_povo), getString(R.string.parque_do_povo_street),
                        null, getString(R.string.parque_do_povo_description), R.drawable.banner_parque_do_povo));

        mInfoList.add(
                new Info(4, getString(R.string.farra_de_bodega), getString(R.string.farra_de_bodega_street),
                        null, getString(R.string.farra_de_bodega_description), R.drawable.banner_luis_e_jackson));

        return mInfoList;
    }
}
