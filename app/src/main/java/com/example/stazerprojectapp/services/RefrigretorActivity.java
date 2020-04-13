package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.bookingprocess.BookingPage;
import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.TermsandConditionsActivity;


public class RefrigretorActivity extends AppCompatActivity {
    Button refridegeselect;
    TextView serviceselected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrigretor);
        serviceselected= findViewById(R.id.refrigeratorserviceselectbtn);
        refridegeselect = findViewById(R.id.refrigeratorboookingbutton);

        findViewById(R.id.termsbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RefrigretorActivity.this, TermsandConditionsActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.viewrefridgeacbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }

    public void serviceselect(View view) {
        String s = serviceselected.getText().toString();
        Intent tarnsfer = new Intent(RefrigretorActivity.this, BookingPage.class);
        tarnsfer.putExtra("Service",s);
        startActivity(tarnsfer);
    }
}
