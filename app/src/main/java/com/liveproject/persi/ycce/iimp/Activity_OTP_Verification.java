package com.liveproject.persi.ycce.iimp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tiger on 07-09-2016.
 */
public class Activity_OTP_Verification extends AppCompatActivity{

    Button btn_verify;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_verification);

        btn_verify= (Button) findViewById(R.id.otp_btn_verify);

        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.liveproject.persi.ycce.iimp.HOME_PAGE");
                startActivity(i);
            }
        });
    }
}
