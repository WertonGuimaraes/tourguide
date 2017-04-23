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
                new Info(
                        1,
                        "BAIXINHO",
                        "R. Papa João Vinte e Três, 101 - Liberdade, Campina Grande - PB",
                        "(83) 3331-9831",
                        "Comida boa, ambiente agradável, destaque para o file à parmegiana.",
                        R.drawable.baixinho));

        mInfoList.add(
                new Info(
                        2,
                        "LA SUISSA",
                        "R. Irineu Joffily, 176 - Centro, Campina Grande - PB",
                        "(83) 3321-2360",
                        "Boa variedade de lanches e sobremesas (doces e salgados deliciosos)",
                        R.drawable.la_suissa));

        mInfoList.add(
                new Info(
                        3,
                        "SKINA DA TAPIOCA",
                        "R. Afrigio Ribeiro Brito, 24 - Jardim Paulistano, Campina Grande - PB",
                        "(83) 98830-5097",
                        "Tapioca, açaí e sanduíches muito gostosos e com um bom preço!",
                        R.drawable.skina_da_tapioca));

        return mInfoList;
    }
}
