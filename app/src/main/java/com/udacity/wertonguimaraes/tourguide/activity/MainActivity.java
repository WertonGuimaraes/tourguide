package com.udacity.wertonguimaraes.tourguide.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.udacity.wertonguimaraes.tourguide.R;

public class MainActivity extends AppCompatActivity {
    private ImageButton mRestaurant;
    private ImageButton mTouristicPoint;
    private ImageButton mBarPoint;
    private ImageButton mHotelPoint;
    private ImageButton mShopPoint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInitView();
        mInitButtonListeners();
    }

    private void mInitView() {
        mRestaurant = (ImageButton) findViewById(R.id.restaurant_button);
        mTouristicPoint = (ImageButton) findViewById(R.id.touristic_point_button);
        mBarPoint = (ImageButton) findViewById(R.id.bar_button);
        mHotelPoint = (ImageButton) findViewById(R.id.hotel_button);
        mShopPoint = (ImageButton) findViewById(R.id.shop_button);
    }

    private void mInitButtonListeners() {
        mRestaurant.setOnClickListener(mOpenNewActivity);
        mTouristicPoint.setOnClickListener(mOpenNewActivity);
        mBarPoint.setOnClickListener(mOpenNewActivity);
        mHotelPoint.setOnClickListener(mOpenNewActivity);
        mShopPoint.setOnClickListener(mOpenNewActivity);
    }

    private View.OnClickListener mOpenNewActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.restaurant_button:
                    startNewActivity(RestaurantActivity.class);
                    break;
                case R.id.touristic_point_button:
                    startNewActivity(TouristicPointActivity.class);
                    break;
                case R.id.bar_button:
                    startNewActivity(BarPointActivity.class);
                    break;
                case R.id.shop_button:
                    startNewActivity(ShopPointActivity.class);
                    break;
                case R.id.hotel_button:
                    startNewActivity(HotelPointActivity.class);
                    break;
                default:
                    break;
            }
        }
    };

    private void startNewActivity(Class<?> activityClass) {
        Intent myIntent = new Intent(MainActivity.this, activityClass);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        MainActivity.this.startActivity(myIntent);
    }
}
