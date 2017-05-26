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
                        "ARENA PUB",
                        "R. Dr. Severino Cruz, 679 - Centro, Campina Grande - PB",
                        "(83) 99826-0505",
                        "colocar descrição",
                        R.drawable.bar_arena));

        mInfoList.add(
                new Info(
                        2,
                        "BAR DO NILSON",
                        "R. Maj. Belmiro, 394 - São José, Campina Grande - PB",
                        null,
                        "Bar universitário, um ar muito peculiar de alternatividade, mas pode ser frequentado tranquilamente por qualquer público, foge do clichê.",
                        R.drawable.bar_nilson));

        mInfoList.add(
                new Info(
                        3,
                        "PETISCARIA BAR",
                        "R. Vidal de Negreiros, 291 - Centro, Campina Grande - PB",
                        "(83) 3322-4110",
                        "Local agradável e aconchegante. Pequeno mas bem decorado. Preços muito altos. Boa variedade de pratos. Pouco coisa regional.",
                        R.drawable.bar_petiscaria));
        return mInfoList;
    }
}
