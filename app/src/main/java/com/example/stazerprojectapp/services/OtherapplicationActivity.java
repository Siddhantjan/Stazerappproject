package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.services.otherservices.GeyserActivity;
import com.example.stazerprojectapp.services.otherservices.WashingmachineActivity;


public class OtherapplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherapplication);
findViewById(R.id.wachingmachineactivity).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(OtherapplicationActivity.this, WashingmachineActivity.class);
        startActivity(intent);
    }
});
        findViewById(R.id.geyseractivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherapplicationActivity.this, GeyserActivity.class);
                startActivity(intent);
            }
        });
    }
}
