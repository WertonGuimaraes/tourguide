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
                new Info(
                        1,
                        "MUSEU DOS TRES PANDEIROS",
                        "R. Dr. Severino Cruz - Centro, Campina Grande - PB, 58400-258",
                        "(83) 3310-9738",
                        "O museu foi projetado pelo arquiteto Oscar Niemeyer, sendo sua última obra. Desde junho de 2014, o museu acolhe trabalhos dos mais talentosos artistas paraibanos, como Sivuca, Jackson do Pandeiro, Marinês, Elba Ramalho, entre outros.",
                        R.drawable.banner_tres_pandeiros));
        return mInfoList;
    }
}
