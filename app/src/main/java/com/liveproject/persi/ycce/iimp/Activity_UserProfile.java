package com.liveproject.persi.ycce.iimp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Tiger on 11-08-2016.
 */
public class Activity_UserProfile extends AppCompatActivity {
    Member m1 = new Member();
    MemberService ms = new MemberService();
    TextView id, username, mobileno, emailid, designation;
    Button edit_profile;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Used getUser Function of MemberService class.
        //m1 = new Member() ;
        m1 = ms.getUser();
        //m1 = new Member("1", "Demo Name", "demo@demo.com", "9876543210", "Principal");

        id = (TextView) findViewById(R.id.tv_fetchid);
        username = (TextView) findViewById(R.id.tv_fetchusername);
        emailid = (TextView) findViewById(R.id.tv_fetchemailid);
        mobileno = (TextView) findViewById(R.id.tv_fetchmobileno);
        designation = (TextView) findViewById(R.id.tv_fetchdesignation);

        id.setText(m1.getId());
        username.setText(m1.getUsername());
        emailid.setText(m1.getEmailid());
        mobileno.setText(m1.getMobileno());
        designation.setText(m1.getDesignation());

        edit_profile = (Button) findViewById(R.id.btn_editprofile);

        edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit_p = new Intent("com.liveproject.persi.ycce.iimp.EDIT_PROFILE");
                startActivity(edit_p);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_setting) {
            return true;
        }

        if (id == R.id.home)
            NavUtils.navigateUpFromSameTask(this);

        return super.onOptionsItemSelected(item);
    }

}
