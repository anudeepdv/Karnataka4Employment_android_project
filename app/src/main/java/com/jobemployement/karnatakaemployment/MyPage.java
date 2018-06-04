//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University

package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class MyPage extends AppCompatActivity implements View.OnClickListener {

    EditText et_name, et_age , et_district, et_mla, et_edu , et_skills;
    Button btn_update, btn_page;

    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth ;
    private FirebaseDatabase database;
    DatabaseReference databaseUser;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);
        firebaseAuth = FirebaseAuth.getInstance();

        database = FirebaseDatabase.getInstance();

        databaseReference = database.getReference("myPage");

        et_name = (EditText) findViewById(R.id.et_name);
        et_age = (EditText) findViewById(R.id.et_age);
        et_district = (EditText) findViewById(R.id.et_district);
        et_edu = (EditText) findViewById(R.id.et_edu);
        et_skills = (EditText) findViewById(R.id.et_skills);
        et_mla = (EditText) findViewById(R.id.et_mla);
        btn_update = (Button) findViewById(R.id.btn_update);
       // btn_page = (Button) findViewById(R.id.btn_page);


        btn_update.setOnClickListener(this);
       // btn_page.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_update: saveUserInformation();
                                   break;

//            case R.id.btn_page:
//                startActivity(new Intent(this,MyPageView.class));

        }
    }

    private void saveUserInformation() {
        String name = et_name.getText().toString().trim();
        String age = et_age.getText().toString().trim();
        String district = et_district.getText().toString().trim();
        String edu = et_edu.getText().toString().trim();
        String skills = et_skills.getText().toString().trim();
        String mla = et_mla.getText().toString().trim();
        String id =databaseReference.push().getKey();

        UserInformation userInformation = new UserInformation(name,age,district,mla,edu,skills);
        //FirebaseUser user = firebaseAuth.getCurrentUser();
        databaseReference.child(id).setValue(userInformation);

        if (TextUtils.isEmpty(name) && TextUtils.isEmpty(age) && TextUtils.isEmpty(district) && TextUtils.isEmpty(edu) && TextUtils.isEmpty(skills) && TextUtils.isEmpty(mla)) {
           Toast.makeText(this,"Please enter your details",Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(this, "Your CV has been been updated", Toast.LENGTH_SHORT).show();
            databaseReference.child(id).setValue(userInformation);
        }




    }
}
