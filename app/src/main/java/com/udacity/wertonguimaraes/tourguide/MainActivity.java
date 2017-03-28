package com.udacity.wertonguimaraes.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mRegionalFood;
    private ListView lvItem;
    private InfoListAdapter adapter;
    private List<Info> mInfoList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_listview);

        lvItem = (ListView)findViewById(R.id.list_view);

        mInfoList = new ArrayList<>();
        mInfoList.add(new Info(1, "a", "decricao"));
        mInfoList.add(new Info(2, "b", "decricao"));
        mInfoList.add(new Info(3, "c", "decricao"));
        mInfoList.add(new Info(4, "d", "decricao"));
        mInfoList.add(new Info(5, "e", "decricao"));
        mInfoList.add(new Info(6, "f", "decricao"));
        mInfoList.add(new Info(7, "g", "decricao"));


        adapter = new InfoListAdapter(getApplicationContext(), mInfoList);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if ((Integer)view.getTag() == 1) {
                    Intent myIntent = new Intent(MainActivity.this, RegionalFoodActivity.class);
                    MainActivity.this.startActivity(myIntent);
                }
            }
        });
//        mInitView();
//        mInitButtonListeners();
    }

    private void mInitView() {
        mRegionalFood = (LinearLayout) findViewById(R.id.regional_food_button);

    }

    private void mInitButtonListeners() {
        mRegionalFood.setOnClickListener(mAddPointListener);
    }

    private View.OnClickListener mAddPointListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.regional_food_button:
                    Intent myIntent = new Intent(MainActivity.this, RegionalFoodActivity.class);
                    MainActivity.this.startActivity(myIntent);
                    break;
                default:
                    break;
            }
        }
    };




}
