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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class StudentjobsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_govt , btn_public , btn_private , btn_technical;
    TextView tv_home;
    ImageButton img1 , img2,img3 , img4, img5;
    TextView tv_stu1 , tv_stu2,tv_stu3,tv_stu4,tv_stu5;


    TextView stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9,stu10;

    TextView stul1,stul2,stul3,stul4,stul5,stul6,stul7,stul8,stul9,stul10;

    DatabaseReference databaseNews2;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("stdjob1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);

                tv_stu1.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("stdjob2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_stu2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stdjob3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_stu3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stdjob4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_stu5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stdjob5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_stu4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        databaseNews2.child("stu1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stu9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("stu10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stu10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        databaseNews2.child("stul1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("stul9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("stul10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                stul10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentjobs);

        btn_govt = (Button) findViewById(R.id.btn_govt);
        btn_public = (Button) findViewById(R.id.btn_public);
        btn_private = (Button) findViewById(R.id.btn_private);
        btn_technical = (Button) findViewById(R.id.btn_technical);
        tv_home = (TextView) findViewById(R.id.tv_home);

        img1  = (ImageButton) findViewById(R.id.img1);
        img2  = (ImageButton) findViewById(R.id.img2);
        img3  = (ImageButton) findViewById(R.id.img3);
        img4  = (ImageButton) findViewById(R.id.img4);
        img5  = (ImageButton) findViewById(R.id.img5);

        tv_stu1 = (TextView) findViewById(R.id.tv_stu1);
        tv_stu2 = (TextView) findViewById(R.id.tv_stu2);
        tv_stu3 = (TextView) findViewById(R.id.tv_stu3);
        tv_stu4 = (TextView) findViewById(R.id.tv_stu4);
        tv_stu5 = (TextView) findViewById(R.id.tv_stu5);


        stu1 = (TextView) findViewById(R.id.stu1);
        stu2 = (TextView) findViewById(R.id.stu2);
        stu3 = (TextView) findViewById(R.id.stu3);
        stu4 = (TextView) findViewById(R.id.stu4);
        stu5 = (TextView) findViewById(R.id.stu5);
        stu6 = (TextView) findViewById(R.id.stu6);
        stu7 = (TextView) findViewById(R.id.stu7);
        stu8 = (TextView) findViewById(R.id.stu8);
        stu9 = (TextView) findViewById(R.id.stu9);
        stu10 = (TextView) findViewById(R.id.stu10);


        stul1 = (TextView) findViewById(R.id.stul1);
        stul2 = (TextView) findViewById(R.id.stul2);
        stul3 = (TextView) findViewById(R.id.stul3);
        stul4 = (TextView) findViewById(R.id.stul4);
        stul5 = (TextView) findViewById(R.id.stul5);
        stul6 = (TextView) findViewById(R.id.stul6);
        stul7 = (TextView) findViewById(R.id.stul7);
        stul8 = (TextView) findViewById(R.id.stul8);
        stul9 = (TextView) findViewById(R.id.stul9);
        stul10 = (TextView) findViewById(R.id.stul10);

        databaseNews2 = FirebaseDatabase.getInstance().getReference();

        Picasso.with(StudentjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/studentsjobone%2Fpic.jpg?alt=media&token=ef1c64ed-ff78-4f3a-8d5a-78873fe7cb02").fit().into(img1);
        Picasso.with(StudentjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/studentsjobtwo%2Fpic.jpg?alt=media&token=38cdc7f4-f802-41dd-acf1-c71e7d687419").fit().into(img2);
        Picasso.with(StudentjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/studentsjobthree%2Fpic.jpg?alt=media&token=9ed25214-51f9-409c-ad82-8898ca46c97b").fit().into(img3);
        Picasso.with(StudentjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/studentsjobfour%2Fpic.jpg?alt=media&token=ddb36486-5a96-40f1-b5c4-a9b956e206c2").fit().into(img5);

        Picasso.with(StudentjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/studentsjobfive%2Fpic.jpg?alt=media&token=189f994c-efd0-4e99-9294-6bbcc249cb2b").fit().into(img4);


        tv_home.setOnClickListener(this);

        btn_govt.setOnClickListener(this);
        btn_public.setOnClickListener(this);
        btn_private.setOnClickListener(this);
        btn_technical.setOnClickListener(this);
        MobileAds.initialize(this, "ca-app-pub-2713962734671819~6710075670");
        AdRequest adRequest = new AdRequest.Builder().build();

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId("ca-app-pub-2713962734671819/1564247122");

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();

            }
        });



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
            case R.id.btn_technical:
                startActivity(new Intent(this,TechnicaljobsActivity.class));
                break;
            case R.id.btn_govt:
                startActivity(new Intent(this,JobsActivity.class));
                break;
            case R.id.tv_home:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }


    }

    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}
