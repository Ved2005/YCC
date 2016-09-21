package com.liveproject.persi.ycce.iimp;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 9/4/2016.
 */
public class Activity_FrontLogin extends AppCompatActivity{
    Button btn_New, btn_Existing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_login);
        btn_New = (Button) findViewById(R.id.fl_btn_newuser);
        btn_Existing = (Button) findViewById(R.id.fl_btn_existing);
        btn_New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openEnterProfile = new Intent("com.liveproject.persi.ycce.iimp.NEW_REGISTRATION");
                startActivity(openEnterProfile);
            }
        });

        btn_Existing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent openEnterProfile = new Intent("com.liveproject.persi.ycce.iimp.EX_LOGIN");
                startActivity(openEnterProfile);
            }
        });
    }
}
