package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.BookingPage;
import com.example.stazerprojectapp.R;

public class CarpentersActivity extends AppCompatActivity {
    Button carpenterselect;
    TextView serviceselected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpenters);
        carpenterselect= findViewById(R.id.carpenterserviceboookbutton);
        serviceselected = findViewById(R.id.carpenterserviceselectbtn);
    }
    public void serviceselect(View view) {
        String s = serviceselected.getText().toString();
        Intent tarnsfer = new Intent(CarpentersActivity.this, BookingPage.class);
        tarnsfer.putExtra("Service",s);
        startActivity(tarnsfer);
    }
}
