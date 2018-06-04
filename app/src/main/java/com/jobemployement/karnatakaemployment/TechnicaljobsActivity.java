//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class TechnicaljobsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_students , btn_public , btn_private , btn_govt;
    TextView tv_home;
    ImageButton img1 , img2,img3 , img4, img5;
    TextView tv_tech1 , tv_tech2,tv_tech3,tv_tech4,tv_tech5;

    TextView te1,te2,te3,te4,te5,te6,te7,te8,te9,te10;

    TextView tel1,tel2,tel3,tel4,tel5,tel6,tel7,tel8,tel9,tel10;

    DatabaseReference databaseNews2;


    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("tecjob1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);

                tv_tech1.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("tecjob2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_tech2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tecjob3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_tech3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tecjob4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_tech5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tecjob5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_tech4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("te1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("te2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("te3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("te4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("te5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("te6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });databaseNews2.child("te7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });databaseNews2.child("te8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("te9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("te10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                te10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });






        databaseNews2.child("tel1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("tel2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tel3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tel4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tel5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tel6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });databaseNews2.child("tel7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });databaseNews2.child("tel8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tel9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("tel10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tel10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technicaljobs);

        btn_students = (Button) findViewById(R.id.btn_students);
        btn_public = (Button) findViewById(R.id.btn_public);
        btn_private = (Button) findViewById(R.id.btn_private);
        btn_govt = (Button) findViewById(R.id.btn_govt);
        tv_home = (TextView) findViewById(R.id.tv_home);

        img1  = (ImageButton) findViewById(R.id.img1);
        img2  = (ImageButton) findViewById(R.id.img2);
        img3  = (ImageButton) findViewById(R.id.img3);
        img4  = (ImageButton) findViewById(R.id.img4);
        img5  = (ImageButton) findViewById(R.id.img5);

        tv_tech1 = (TextView) findViewById(R.id.tv_tech1);
        tv_tech2 = (TextView) findViewById(R.id.tv_tech2);
        tv_tech3 = (TextView) findViewById(R.id.tv_tech3);
        tv_tech4 = (TextView) findViewById(R.id.tv_tech4);
        tv_tech5 = (TextView) findViewById(R.id.tv_tech5);


        te1 = (TextView) findViewById(R.id.te1);
        te2 = (TextView) findViewById(R.id.te2);
        te3 = (TextView) findViewById(R.id.te3);
        te4 = (TextView) findViewById(R.id.te4);
        te5 = (TextView) findViewById(R.id.te5);
        te6 = (TextView) findViewById(R.id.te6);
        te7 = (TextView) findViewById(R.id.te7);
        te8 = (TextView) findViewById(R.id.te8);
        te9 = (TextView) findViewById(R.id.te9);
        te10 = (TextView) findViewById(R.id.te10);

        tel1 = (TextView) findViewById(R.id.tel1);
        tel2 = (TextView) findViewById(R.id.tel2);
        tel3 = (TextView) findViewById(R.id.tel3);
        tel4 = (TextView) findViewById(R.id.tel4);
        tel5 = (TextView) findViewById(R.id.tel5);
        tel6 = (TextView) findViewById(R.id.tel6);
        tel7 = (TextView) findViewById(R.id.tel7);
        tel8 = (TextView) findViewById(R.id.tel8);
        tel9 = (TextView) findViewById(R.id.tel9);
        tel10 = (TextView) findViewById(R.id.tel10);

        databaseNews2 = FirebaseDatabase.getInstance().getReference();

        Picasso.with(TechnicaljobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/Technicaljobone%2Fpic.jpg?alt=media&token=9ddfd589-ffd0-4b3e-acc0-8c4b04b3a627").fit().into(img1);
        Picasso.with(TechnicaljobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/technicaljobtwo%2Fpic.jpg?alt=media&token=a738d677-e09b-40ba-96c1-939fbc417151").fit().into(img2);
        Picasso.with(TechnicaljobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/technicaljobthree%2Fpic.jpg?alt=media&token=ce841ea3-652a-46c0-a104-86949e4f4c25").fit().into(img3);
        Picasso.with(TechnicaljobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/technicaljobfour%2Fpic.jpg?alt=media&token=670ea03a-483f-4d38-a9e5-269c473e16e4").fit().into(img5);

        Picasso.with(TechnicaljobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/technicaljobfive%2Fpic.jpg?alt=media&token=fdc68c55-8361-4056-98c9-d5622ff79244").fit().into(img4);



        tv_home.setOnClickListener(this);

        btn_students.setOnClickListener(this);
        btn_public.setOnClickListener(this);
        btn_private.setOnClickListener(this);
        btn_govt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_private:
                startActivity(new Intent(this,PrivatejobsActivity.class));
                break;
            case R.id.btn_public:
                startActivity(new Intent(this,PubicjobsActivity.class));
                break;
            case R.id.btn_govt:
                startActivity(new Intent(this,JobsActivity.class));
                break;
            case R.id.btn_students:
                startActivity(new Intent(this,StudentjobsActivity.class));
                break;

            case R.id.tv_home:
                startActivity(new Intent(this,MainActivity.class));
                break;

        }


    }
}
