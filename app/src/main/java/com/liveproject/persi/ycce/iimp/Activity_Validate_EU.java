package com.liveproject.persi.ycce.iimp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 9/4/2016.
 */
public class Activity_Validate_EU extends AppCompatActivity {

    Button validate;
    String mobile;
    EditText editmobile;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.existing_user);

        editmobile = (EditText) findViewById(R.id.eu_et_mobile);
        tv = (TextView) findViewById(R.id.eu_tv_timepass);

        validate = (Button) findViewById(R.id.eu_btn_existing_mobile);
        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mobile = editmobile.getText().toString();

                if (mobile.isEmpty())
                    Toast.makeText(Activity_Validate_EU.this, "Enter Mobile Number!!!", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(), mobile, Toast.LENGTH_LONG).show();
                    Intent i = new Intent("com.liveproject.persi.ycce.iimp.OTP_VERIFICATION");
                    startActivity(i);

                }

                //tv.setText(mobile);
            }
        });
    }
}
