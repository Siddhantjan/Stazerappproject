package com.example.stazerprojectapp.services.otherservices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.bookingprocess.BookingPage;
import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.TermsandConditionsActivity;


public class WashingmachineActivity extends AppCompatActivity {
    Button washingmachineselect;
    TextView serviceselected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washingmachine);

        serviceselected= findViewById(R.id.washingmachineserviceselectbtn);
        washingmachineselect = findViewById(R.id.washingmachineserviceboookbutton);
        findViewById(R.id.washingmachinerate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        findViewById(R.id.termsbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WashingmachineActivity.this, TermsandConditionsActivity.class);
                startActivity(intent);
            }
        });
    }

    public void serviceselect(View view) {
        String s = serviceselected.getText().toString();
        Intent tarnsfer = new Intent(WashingmachineActivity.this, BookingPage.class);
        tarnsfer.putExtra("Service",s);
        startActivity(tarnsfer);
    }
}
