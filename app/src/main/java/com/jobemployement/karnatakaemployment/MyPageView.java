//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyPageView extends AppCompatActivity implements View.OnClickListener {

    TextView tv_name, tv_dist , tv_age , tv_mla , tv_edu , tv_skills;
    DatabaseReference databaseuser;
    FirebaseAuth firebaseAuth;
    Button btn_update, btn_home;


    @Override
    protected void onStart() {
        super.onStart();
        databaseuser.child(firebaseAuth.getCurrentUser().getPhoneNumber()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                UserInformation userInformation = dataSnapshot.getValue(UserInformation.class);
                String name = userInformation.name;
                String age = userInformation.age;
                String district = userInformation.district;
                String edu = userInformation.edu;
                String skills = userInformation.skills;
                String mla = userInformation.mla;

                tv_name.setText("NAME "+name);

                tv_mla.setText("MLA-"+mla);
                tv_dist.setText("DISTRICT-"+district);
                tv_edu.setText("EDU-"+edu);
                tv_skills.setText("SKILLS-"+skills);
                tv_age.setText("AGE-"+age);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page_view);

        tv_name = (TextView) findViewById(R.id.tv_name);
         tv_age = (TextView) findViewById(R.id.tv_age);
        tv_edu = (TextView) findViewById(R.id.tv_edu);
        tv_mla = (TextView) findViewById(R.id.tv_mla);
        tv_skills = (TextView) findViewById(R.id.tv_skills);
        tv_dist = (TextView) findViewById(R.id.tv_dist);
        btn_update = (Button) findViewById(R.id.btn_update);
        btn_home= (Button) findViewById(R.id.btn_home);
        btn_update.setOnClickListener(this);
        btn_home.setOnClickListener(this);


        databaseuser = FirebaseDatabase.getInstance().getReference("myPage");
        firebaseAuth = FirebaseAuth.getInstance();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_update:
                startActivity(new Intent(this,MyPage.class));
                break;

            case R.id.btn_home:
                startActivity(new Intent(this,MainActivity.class));
                break;

        }
    }
}
