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
                        1,
                        "VILA DO ARTESÃO",
                        "Avenida Almeida Barreto, s/n - São José, Campina Grande - PB",
                        "(83) 3322-2425",
                        "Local muito propicio para quem quer comprar coisas regionais. Local tem uma praca de alimentação, lojas para compras. Loja de roupas, sapatos e artesanato. Ambiente lindo e pessoas agradaveis.",
                        R.drawable.shop_sao_joao));

        mInfoList.add(
                new Info(
                        2,
                        "PARTAGE SHOPPING",
                        "Avenida Severino Bezerra Cabral, 1050 - Catolé, Campina Grande - PB",
                        "(83) 3344-5000",
                        "O Partage é o principal centro de compras, gastronomia, serviços e entretenimento da região.",
                        R.drawable.shop_partage));

        mInfoList.add(
                new Info(
                        3,
                        "LUIZA MOTTA",
                        "R. Afrigio Ribeiro Brito, 24 - Jardim Paulistano, Campina Grande - PB",
                        "(83) 3337-2627",
                        "É um shopping pequeno, mas interessante. Boa praça de alimentação. No período junino, nos finais de semana tem shows a tarde na praça de alimentação. Também bom para comprar.",
                        R.drawable.shop_luiza_motta)
        );

        return mInfoList;
    }
}
