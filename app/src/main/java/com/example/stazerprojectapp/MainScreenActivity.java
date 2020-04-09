package com.example.stazerprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.stazerprojectapp.services.AcserviceActivity;
import com.example.stazerprojectapp.services.BannerElePluCarActivity;
import com.example.stazerprojectapp.services.CarpentersActivity;
import com.example.stazerprojectapp.services.CleaningService;
import com.example.stazerprojectapp.services.ElectricianActivity;
import com.example.stazerprojectapp.services.OtherapplicationActivity;
import com.example.stazerprojectapp.services.PestControlActivity;
import com.example.stazerprojectapp.services.PlumbersActivity;
import com.example.stazerprojectapp.services.RefrigretorActivity;
import com.example.stazerprojectapp.services.RoserviceActivity;
import com.example.stazerprojectapp.services.WashingmachineActivity;

public class MainScreenActivity extends AppCompatActivity {

    String phoneNumber;
    TextView mobileNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        findViewById(R.id.electricianbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, ElectricianActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.plumbersbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, PlumbersActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.carpenterbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CarpentersActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.acservicebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, AcserviceActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.refrigeratorbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, RefrigretorActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.rorepairbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, RoserviceActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.otherappliancebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, OtherapplicationActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cleanerbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CleaningService.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.pestcontrolbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, PestControlActivity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.banner_ele_plu_car).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, BannerElePluCarActivity.class);
                startActivity(intent);
            }
        });

    }

}
