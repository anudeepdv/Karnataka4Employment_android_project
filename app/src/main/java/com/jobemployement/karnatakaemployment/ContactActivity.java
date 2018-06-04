
//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.*;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_contact, tv_emailcontact;
    TextView tv_join_call;
    TextView tv_you;
    DatabaseReference databaseNews2;


    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("govl11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_you.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        tv_contact = (TextView) findViewById(R.id.tv_contact);
        tv_emailcontact  = (TextView) findViewById(R.id.tv_emailcontact);
        tv_you= (TextView) findViewById(R.id.tv_you);

        databaseNews2 = FirebaseDatabase.getInstance().getReference();
        tv_contact.setOnClickListener(this);
        tv_emailcontact.setOnClickListener(this);
        //tv_join_call =(TextView) findViewById(R.id.tv_join_call);

        //tv_join.setMovementMethod(LinkMovementMethod.getInstance());

//        tv_join_call.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_contact:

                Intent calladmin2 = new Intent(Intent.ACTION_CALL);
                calladmin2.setData(Uri.parse("tel:"+"+919606195831"));
                if (ActivityCompat.checkSelfPermission(ContactActivity.this,
                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(calladmin2);
                break;

            case R.id.tv_emailcontact:
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.setType("text/plain");
                intent.setData(Uri.parse("mailto:karnatakaforemployment@gmail.com")); // or just "mailto:" for blank
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent);
                break;

//            case R.id.tv_join_call:
//                Intent calladmin3 = new Intent(Intent.ACTION_CALL);
//                calladmin3.setData(Uri.parse("tel:"+"+918287214422"));
//                if (ActivityCompat.checkSelfPermission(ContactActivity.this,
//                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
//                startActivity(calladmin3);
//                break;

        }
    }
}
