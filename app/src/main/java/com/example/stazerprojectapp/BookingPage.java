package com.example.stazerprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import static com.google.android.gms.common.internal.safeparcel.SafeParcelable.NULL;

public class BookingPage extends AppCompatActivity {
    String phoneNumber;
    TextView mobileNumber,servicesel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);

        // get saved phone number
        SharedPreferences prefs =  getApplicationContext().getSharedPreferences("USER_PREF",
                Context.MODE_PRIVATE);
        phoneNumber = prefs.getString("phoneNumber", NULL);

        mobileNumber = findViewById(R.id.mobileNumber);
        mobileNumber.setText(phoneNumber);

        servicesel=findViewById(R.id.serviceselected);

        String servicename = getIntent().getStringExtra("Service");
        servicesel.setText(servicename);

    }
}
