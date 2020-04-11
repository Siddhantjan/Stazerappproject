package com.example.stazerprojectapp.services;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.BookingPage;
import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.ratecaed.AcRateCardActivity;
import com.example.stazerprojectapp.TermsandConditionsActivity;


public class AcserviceActivity extends AppCompatActivity {
    Button acselect;
    TextView acserviceselected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acservice);
        acserviceselected= findViewById(R.id.acserviceselectbtn);

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
acselect= findViewById(R.id.acboookingbutton);
    }
    public void serviceselect(View view) {
         String s = acserviceselected.getText().toString();
Intent tarnsfer = new Intent(AcserviceActivity.this,BookingPage.class);
tarnsfer.putExtra("Service",s);
startActivity(tarnsfer);
    }
}
