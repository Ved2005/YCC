package com.liveproject.persi.ycce.iimp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by user on 9/4/2016.
 */
public class Activity_NewRegistration extends AppCompatActivity {

    Member m1, m2;
    DesignationService d = new DesignationService();

    EditText username, emailid, mobileno;
    Spinner designation;
    Button upload;

    String s_designation, s_username, s_emailid, s_mobileno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_registeration);

            m1 = new Member("1", "Demo Name", "demo@demo.com", "9876543210", "Principal");

            username = (EditText) findViewById(R.id.nr_et_username);
            username.setHint("Enter Your Name.");


            emailid = (EditText) findViewById(R.id.nr_et_emailid);
            emailid.setHint("Enter your E-mail Id.");


            mobileno = (EditText) findViewById(R.id.nr_et_mobileno);
            mobileno.setHint("Enter your Mobile no. to be used as a identifier.");

            designation = (Spinner) findViewById(R.id.nr_dd_designation);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, d.getAllDesignation());
            designation.setAdapter(adapter);

            designation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    TextView designation = (TextView) view;
                    s_designation = designation.getText().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            upload = (Button) findViewById(R.id.nr_btn_upload);

            upload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    m2 = new Member(m1);

                    s_username = username.getText().toString();
                    s_emailid = emailid.getText().toString();
                    s_mobileno = mobileno.getText().toString();

                    if (!s_username.isEmpty()) {

                        m2.setUsername(s_username);
                    }

                    if (!s_emailid.isEmpty()) {
                        m2.setEmailid(s_emailid);
                    }

                    if (!s_mobileno.isEmpty()) {
                        m2.setMobileno(s_mobileno);
                    }

                    if (!s_designation.equals(d.s[0])) {
                        m2.setDesignation(s_designation);
                    }

                    Intent i = new Intent("com.liveproject.persi.ycce.iimp.OTP_VERIFICATION");
                    startActivity(i);

          /*      Context context = getApplicationContext();
                    CharSequence text = s_username;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show(); */
                }
            });
        }
}