package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeActivity extends AppCompatActivity {

    Button btn_youth;
    Button btn_contribute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        youth();
        contribute();
    }
    void youth(){
        btn_youth = (Button)findViewById(R.id.btn_youth);
        btn_youth.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(homeActivity.this,Youth.class));
                    }
                }
        );
    }
    void contribute(){
        btn_contribute = (Button)findViewById(R.id.btn_contribute);
        btn_contribute.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(homeActivity.this,Contribute.class));
                    }
                }
        );
    }
}
