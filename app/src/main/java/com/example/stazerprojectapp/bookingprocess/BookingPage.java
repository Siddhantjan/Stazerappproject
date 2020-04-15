package com.example.stazerprojectapp.bookingprocess;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.example.stazerprojectapp.R;
import com.example.stazerprojectapp.timepiceker.TimePickerFragment;

import static com.google.android.gms.common.internal.safeparcel.SafeParcelable.NULL;

public class BookingPage extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {
    String phoneNumber;
    TextView mobileNumber,servicesel;
EditText username,flatno,landmark,area,servicespecification;
Button confirmbookigservice;
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

        username =findViewById(R.id.username);
        flatno=findViewById(R.id.flatno);
        landmark=findViewById(R.id.landmark);
        area=findViewById(R.id.areaspecification);
        servicespecification=findViewById(R.id.servicespecification);


        Button btpicker=(Button)findViewById(R.id.bt_picker);
        btpicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timepicker= new TimePickerFragment();
                timepicker.show(getSupportFragmentManager(),"time picker");
            }
        });

        confirmbookigservice=findViewById(R.id.confirmbookigservice);
        confirmbookigservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=username.getText().toString().trim();
                String flat=flatno.getText().toString().trim();
                String landMark=landmark.getText().toString().trim();
                String coustmerarea=area.getText().toString().trim();
                String servicedetails=servicespecification.getText().toString().trim();

                if(name.isEmpty()){
                    username.setError("Enter your Name");
                    username.requestFocus();
                    return;
                }
                if(flat.isEmpty()){
                    flatno.setError("Enter your house no");
                    flatno.requestFocus();
                    return;
                }
                if(landMark.isEmpty()){
                    landmark.setError("Enter the LankMark");
                    landmark.requestFocus();
                    return;
                }
                if(coustmerarea.isEmpty()){
                    area.setError("Enter your area");
                    area.requestFocus();
                    return;
                }
                if(servicedetails.isEmpty()){
                    servicespecification.setError("Enter your service specification");
                    servicespecification.requestFocus();
                    return;
                }

                String CoustmerAddress= flat+ landMark + coustmerarea;
                String typeservice=servicesel.getText().toString();
                String time=((TextView) findViewById(R.id.time_view)).getText().toString();

                Intent intent = new Intent(BookingPage.this,BookingProcessingActivity.class);
                intent.putExtra("servicename",typeservice);
                intent.putExtra("Address",CoustmerAddress);
                intent.putExtra("timeselect",time);
                startActivity(intent);
                //String s = acserviceselected.getText().toString();
                //Intent tarnsfer = new Intent(.this,BookingPage.class);
               // tarnsfer.putExtra("Service",s);
               // startActivity(tarnsfer);
            }
        });


        String servicename = getIntent().getStringExtra("Service");
        servicesel.setText(servicename);



    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView timeshow= (TextView) findViewById(R.id.time_view);
        timeshow.setText( " Hour: " + hourOfDay + " Minute: " + minute);
    }
}
