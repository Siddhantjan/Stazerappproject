package com.example.stazerprojectapp.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.BookingPage;
import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.ratecaed.AcRateCardActivity;
import com.example.stazerprojectapp.TermsandConditionsActivity;


public class AcserviceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acservice);
    findViewById(R.id.viewrateacbutton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(AcserviceActivity.this, AcRateCardActivity.class);
            startActivity(intent);
        }
    });
findViewById(R.id.termsbutton).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(AcserviceActivity.this, TermsandConditionsActivity.class);
        startActivity(intent);
    }
});
findViewById(R.id.acboookingbutton).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(AcserviceActivity.this, BookingPage.class);
        startActivity(intent);
    }
});
    }
}
