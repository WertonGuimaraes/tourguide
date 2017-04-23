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
                new Info(
                        1,
                        "MUSEU DOS TRES PANDEIROS",
                        "R. Dr. Severino Cruz - Centro, Campina Grande - PB, 58400-258",
                        "(83) 3310-9738",
                        "O museu foi projetado pelo arquiteto Oscar Niemeyer, sendo sua última obra. Desde junho de 2014, o museu acolhe trabalhos dos mais talentosos artistas paraibanos, como Sivuca, Jackson do Pandeiro, Marinês, Elba Ramalho, entre outros.",
                        R.drawable.banner_tres_pandeiros));

        mInfoList.add(
                new Info(
                        2,
                        "OS PIONEIROS",
                        "R. Paulo de Frontin, 483-499 - Centro, Campina Grande - PB",
                        null,
                        "'Os Pioneiros da Borborema' homenageia as figuras do índio, da catadora de algodão e do tropeiro. O índio representa o início de tudo. A catadora de algodão faz referência à 'Era de Ouro' de Campina Grande, quando o município se tornou o segundo maior exportador de algodão do mundo. E o tropeiro presta homenagem à vocação comerciária da cidade.",
                        R.drawable.banner_pioneiros));

        mInfoList.add(
                new Info(
                        3,
                        "PARQUE DO POVO",
                        "R. Sebastião Donato, S/N - Centro, Campina Grande - PB",
                        null,
                        "O Parque do Povo é conhecido por sediar a festa junina de Campina Grande. Como, por exemplo, o maior são João do Mundo.",
                        R.drawable.banner_parque_do_povo));

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
