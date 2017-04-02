package com.udacity.wertonguimaraes.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton mRegionalFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInitView();
        mInitButtonListeners();
    }

    private void mInitView() {
        mRegionalFood = (ImageButton) findViewById(R.id.regional_food_button);
    }

    private void mInitButtonListeners() {
        mRegionalFood.setOnClickListener(mAddPointListener);
    }

    private View.OnClickListener mAddPointListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.regional_food_button:
                    openNewActivity(RegionalFoodActivity.class);
                    break;
                default:
                    break;
            }
        }
    };

    private void openNewActivity(Class<?> activityClass) {
        Intent myIntent = new Intent(MainActivity.this, activityClass);
        MainActivity.this.startActivity(myIntent);
    }


}
