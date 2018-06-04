//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.TextView;

public class HelplineActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_ph1 , tv_ph2 , tv_ph3 , tv_sms1, tv_sms2, tv_sms3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        tv_ph1 = (TextView) findViewById(R.id.tv_ph1);
        tv_ph2 = (TextView) findViewById(R.id.tv_ph2);
        tv_ph3 = (TextView) findViewById(R.id.tv_ph3);
        tv_sms1 = (TextView) findViewById(R.id.tv_sms1);
        tv_sms2 = (TextView) findViewById(R.id.tv_sms2);
        tv_sms3 = (TextView) findViewById(R.id.tv_sms3);
//        tv_ph4 = (TextView) findViewById(R.id.tv_ph4);


        tv_ph1.setOnClickListener(this);
        tv_ph2.setOnClickListener(this);
        tv_ph3.setOnClickListener(this);
//        tv_ph4.setOnClickListener(this);
        tv_sms1.setOnClickListener(this);
        tv_sms2.setOnClickListener(this);
        tv_sms3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
           case R.id.tv_ph1:
               Intent calladmin = new Intent(Intent.ACTION_CALL);
               calladmin.setData(Uri.parse("tel:"+"+919606195832"));
               if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                       Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                   return;
               }
               startActivity(calladmin);
               break;
            case R.id.tv_ph2:
                Intent calladmin1 = new Intent(Intent.ACTION_CALL);
                calladmin1.setData(Uri.parse("tel:"+"+919606195833"));
                if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(calladmin1);
                break;

            case R.id.tv_ph3:
                Intent calladmin2 = new Intent(Intent.ACTION_CALL);
                calladmin2.setData(Uri.parse("tel:"+"+919606195834"));
                if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(calladmin2);
                break;


            case R.id.tv_sms1:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms","+919606195832",null)));
                break;

            case R.id.tv_sms2:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms","+919606195833",null)));
                break;

            case R.id.tv_sms3:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms","+919606195834",null)));
                break;
        }

    }
}
