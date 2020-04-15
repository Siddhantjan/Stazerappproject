package com.example.stazerprojectapp.services.cleaningsevices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.TermsandConditionsActivity;
import com.example.stazerprojectapp.bookingprocess.BookingPage;
import com.example.stazerprojectapp.ratecaed.CleaningServicesRateCard;

public class HouseCleaningActivity extends AppCompatActivity {
    Button housecleanselect;
    TextView serviceselected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_cleaning);


        serviceselected= findViewById(R.id.homecleanselectbtn);
        housecleanselect = findViewById(R.id.homecleaningboookbutton);

        findViewById(R.id.cleaningrate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseCleaningActivity.this, CleaningServicesRateCard.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.termsbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseCleaningActivity.this, TermsandConditionsActivity.class);
                startActivity(intent);
            }
        });
    }

    public void serviceselect(View view) {
        String s = serviceselected.getText().toString();
        Intent tarnsfer = new Intent(HouseCleaningActivity.this, BookingPage.class);
        tarnsfer.putExtra("Service",s);
        startActivity(tarnsfer);
    }
}
