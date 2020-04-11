package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.BookingPage;
import com.example.stazerprojectapp.R;

public class ElectricianActivity extends AppCompatActivity {
    Button eleselect;
    TextView serviceselected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);
    serviceselected= findViewById(R.id.elcctricianserviceselectbtn);
    eleselect = findViewById(R.id.electricanserviceboookbutton);
    }

    public void serviceselect(View view) {
        String s = serviceselected.getText().toString();
        Intent tarnsfer = new Intent(ElectricianActivity.this, BookingPage.class);
        tarnsfer.putExtra("Service",s);
        startActivity(tarnsfer);
    }
}
