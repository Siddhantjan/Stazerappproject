package com.example.stazerprojectapp.bookingprocess;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stazerprojectapp.R;

public class BookingProcessingActivity extends AppCompatActivity {
TextView serviceview,timeshow,useraddress;
Spinner spinnerselect,spinnerfeedback,spinnerpayment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_processing);
        serviceview=findViewById(R.id.serviceselected);
        timeshow =findViewById(R.id.timeview);
        useraddress=findViewById(R.id.user_address);
        String servicename = getIntent().getStringExtra("servicename");
        serviceview.setText(servicename);
        String timevisible = getIntent().getStringExtra("timeselect");
        timeshow.setText(timevisible);
        String useraddressdetials= getIntent().getStringExtra("Address");
        useraddress.setText(useraddressdetials);

        spinnerfeedback=findViewById(R.id.ratingspinner);
        spinnerpayment=findViewById(R.id.paymentspiner);
        spinnerselect= findViewById(R.id.spinnerservice);

        String[] servicestate ={"No","yes"};

        String[] feedback ={"Excellent","Best","Good","Poor"};

        String[] paymode ={"Cash","Paytm","GooglePay"};
        ArrayAdapter<String> stateadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,servicestate);
        spinnerselect.setAdapter(stateadapter);

        ArrayAdapter<String> feedbackadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,feedback);
        spinnerfeedback.setAdapter(feedbackadapter);

        ArrayAdapter<String> paymodeadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,paymode);
        spinnerpayment.setAdapter(paymodeadapter);

    }

}
