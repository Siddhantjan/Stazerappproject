package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.services.cleaningsevices.BathroomCleaningActivity;
import com.example.stazerprojectapp.services.cleaningsevices.CarWashingActivity;
import com.example.stazerprojectapp.services.cleaningsevices.DeepKitchenCleaning;
import com.example.stazerprojectapp.services.cleaningsevices.HouseCleaningActivity;


public class CleaningService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);

        findViewById(R.id.bathroomcleaningbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CleaningService.this, BathroomCleaningActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.Kitchendeepcleaningbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CleaningService.this, DeepKitchenCleaning.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.housecleaningbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CleaningService.this, HouseCleaningActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.carcleaningbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CleaningService.this, CarWashingActivity.class);
                startActivity(intent);
            }
        });


    }
}
