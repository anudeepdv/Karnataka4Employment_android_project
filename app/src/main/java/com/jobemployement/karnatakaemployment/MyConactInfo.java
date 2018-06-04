//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University

package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyConactInfo extends AppCompatActivity implements View.OnClickListener {

    TextView tv_bth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_conact_info);

        tv_bth = (TextView) findViewById(R.id.tv_bth);
        tv_bth.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.tv_bth:
                startActivity(new Intent(this,MainActivity.class));
                break;

        }
    }
}
