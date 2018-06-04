package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login2Activity extends AppCompatActivity implements View.OnClickListener {

    Button info, btn_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        info = (Button) findViewById(R.id.btn_info);
        btn_home = (Button) findViewById(R.id.btn_home);

        info.setOnClickListener(this);
        btn_home.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_info:
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://goo.gl/forms/JT42laXN19qLGOmv2"));
                startActivity(myWebLink);
                break;
            case R.id.btn_home:
                startActivity(new Intent(this,MainActivity.class));
                break;

        }
    }
}
