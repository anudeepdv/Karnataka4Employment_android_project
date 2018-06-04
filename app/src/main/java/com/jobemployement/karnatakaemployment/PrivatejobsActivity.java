//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
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

public class PrivatejobsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_students , btn_public , btn_govt , btn_technical;
    TextView tv_home;

    TextView tv_pr1 , tv_pr2,tv_pr3,tv_pr4,tv_pr5;
    DatabaseReference databaseNews2;

    ImageButton img1 , img2,img3 , img4, img5;


    TextView pri1,pri2,pri3,pri4,pri5,pri6,pri7,pri8,pri9,pri10;

    TextView pril1,pril2,pril3,pril4,pril5,pril6,pril7,pril8,pril9,pril10;




    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("prijob1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pr1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("prijob2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pr2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("prijob3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pr3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("prijob4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pr5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("prijob5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pr4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        databaseNews2.child("pri1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("pri2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("pri7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pri10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pri10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });








        databaseNews2.child("pril1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("pril2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("pril7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pril10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pril10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });












    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privatejobs);

        btn_students = (Button) findViewById(R.id.btn_students);
        btn_public = (Button) findViewById(R.id.btn_public);
        btn_govt = (Button) findViewById(R.id.btn_govt);
        btn_technical = (Button) findViewById(R.id.btn_technical);
        tv_home = (TextView) findViewById(R.id.tv_home);

        tv_pr1 = (TextView) findViewById(R.id.tv_pr1);
        tv_pr2 = (TextView) findViewById(R.id.tv_pr2);
        tv_pr3 = (TextView) findViewById(R.id.tv_pr3);
        tv_pr4 = (TextView) findViewById(R.id.tv_pr4);
        tv_pr5 = (TextView) findViewById(R.id.tv_pr5);

        img1 = (ImageButton) findViewById(R.id.img1);
        img2 = (ImageButton) findViewById(R.id.img2);
        img3 = (ImageButton) findViewById(R.id.img3);
        img4 = (ImageButton) findViewById(R.id.img4);
        img5 = (ImageButton) findViewById(R.id.img5);



        pri1 = (TextView) findViewById(R.id.pri1);
        pri2 = (TextView) findViewById(R.id.pri2);
        pri3 = (TextView) findViewById(R.id.pri3);
        pri4 = (TextView) findViewById(R.id.pri4);
        pri5 = (TextView) findViewById(R.id.pri5);
        pri6 = (TextView) findViewById(R.id.pri6);
        pri7 = (TextView) findViewById(R.id.pri7);
        pri8 = (TextView) findViewById(R.id.pri8);
        pri9 = (TextView) findViewById(R.id.pri9);
        pri10 = (TextView) findViewById(R.id.pri10);

        pril1 = (TextView) findViewById(R.id.pril1);
        pril2 = (TextView) findViewById(R.id.pril2);
        pril3 = (TextView) findViewById(R.id.pril3);
        pril4 = (TextView) findViewById(R.id.pril4);
        pril5 = (TextView) findViewById(R.id.pril5);
        pril6 = (TextView) findViewById(R.id.pril6);
        pril7 = (TextView) findViewById(R.id.pril7);
        pril8 = (TextView) findViewById(R.id.pril8);
        pril9 = (TextView) findViewById(R.id.pril9);
        pril10 = (TextView) findViewById(R.id.pril10);

        databaseNews2 = FirebaseDatabase.getInstance().getReference();

        Picasso.with(PrivatejobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/privatejobone%2Fpic.jpg?alt=media&token=96582625-c5ed-4397-b15d-4ff878bb75fa").fit().into(img1);
        Picasso.with(PrivatejobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/privatejobtwo%2Fpic.jpg?alt=media&token=b65eef89-27e0-4043-9610-ccd9fbc59e39").fit().into(img2);
        Picasso.with(PrivatejobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/privatejobthree%2Fpic.jpg?alt=media&token=db0af674-d128-4d5c-90f8-f6a9c742564f").fit().into(img3);
        Picasso.with(PrivatejobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/privatejobfour%2Fpic.jpg?alt=media&token=55fd9dd9-f2e5-4ed9-8b84-6acec09bc483").fit().into(img5);
        Picasso.with(PrivatejobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/privatejobfive%2Fpic.jpg?alt=media&token=bf696cb9-b743-447b-bbfd-2256d2fd0758").fit().into(img4);




        tv_home.setOnClickListener(this);

        btn_students.setOnClickListener(this);
        btn_public.setOnClickListener(this);
        btn_govt.setOnClickListener(this);
        btn_technical.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_govt:
                startActivity(new Intent(this,JobsActivity.class));
                break;
            case R.id.btn_public:
                startActivity(new Intent(this,PubicjobsActivity.class));
                break;
            case R.id.btn_technical:
                startActivity(new Intent(this,TechnicaljobsActivity.class));
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
