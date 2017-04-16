package com.udacity.wertonguimaraes.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton mRestaurant;
    private ImageButton mTouristicPoint;


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
    }

    private void mInitButtonListeners() {
        mRestaurant.setOnClickListener(mOpenNewActivity);
        mTouristicPoint.setOnClickListener(mOpenNewActivity);
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
