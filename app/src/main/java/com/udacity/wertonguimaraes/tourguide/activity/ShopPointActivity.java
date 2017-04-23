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
                new Info(
                        3,
                        "FARRA DE BODEGA",
                        "R. Afrigio Ribeiro Brito, 24 - Jardim Paulistano, Campina Grande - PB",
                        null,
                        "O monumento Farra de Bodega homenageia dois ícones da música nordestina: Jackson do Pandeiro e Luiz Gonzaga.",
                        R.drawable.banner_luis_e_jackson));

        return mInfoList;
    }
}
