package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.R;

public class BannerElePluCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_ele_plu_car);

        findViewById(R.id.plumberactbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BannerElePluCarActivity.this, PlumbersActivity.class);

                startActivity(intent);
            }
        });

        findViewById(R.id.electricianactbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BannerElePluCarActivity.this, ElectricianActivity.class);

                startActivity(intent);
            }
        });

        findViewById(R.id.carpenteractbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BannerElePluCarActivity.this, CarpentersActivity.class);

                startActivity(intent);
            }
        });


    }
}
