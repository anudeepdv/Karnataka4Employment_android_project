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

public class JobsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton img1 , img2,img3 , img4, img5;

    Button btn_students , btn_public , btn_private , btn_technical;

    TextView tv_gov1 , tv_gov2,tv_gov3,tv_gov4,tv_gov5;

   TextView gov1,gov2,gov3,gov4,gov5,gov6,gov7,gov8,gov9,gov10;

    TextView govl1,govl2,govl3,govl4,govl5,govl6,govl7,govl8,govl9,govl10;

    TextView tv_home;
    DatabaseReference databaseNews2;

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;


    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("govjob1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_gov1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("govjob2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_gov2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govjob3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_gov3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govjob4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_gov5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govjob5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_gov4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        databaseNews2.child("gov1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("gov2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("gov3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("gov4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("gov5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("gov6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("gov7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("gov8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("gov9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("gov10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                gov10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });










        databaseNews2.child("govl1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("govl2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("govl3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govl4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govl5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govl6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govl7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govl8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("govl9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("govl10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                govl10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        img1  = (ImageButton) findViewById(R.id.img1);
        img2  = (ImageButton) findViewById(R.id.img2);
        img3  = (ImageButton) findViewById(R.id.img3);
        img4  = (ImageButton) findViewById(R.id.img4);
        img5  = (ImageButton) findViewById(R.id.img5);
        btn_students = (Button) findViewById(R.id.btn_students);
        btn_public = (Button) findViewById(R.id.btn_public);
        btn_private = (Button) findViewById(R.id.btn_private);
        btn_technical = (Button) findViewById(R.id.btn_technical);

        tv_gov1 = (TextView) findViewById(R.id.tv_gov1);
        tv_gov2 = (TextView) findViewById(R.id.tv_gov2);
        tv_gov3 = (TextView) findViewById(R.id.tv_gov3);
        tv_gov4 = (TextView) findViewById(R.id.tv_gov4);
        tv_gov5 = (TextView) findViewById(R.id.tv_gov5);


        gov1 = (TextView) findViewById(R.id.gov1);
        gov2 = (TextView) findViewById(R.id.gov2);
        gov3 = (TextView) findViewById(R.id.gov3);
        gov4 = (TextView) findViewById(R.id.gov4);
        gov5 = (TextView) findViewById(R.id.gov5);
        gov6 = (TextView) findViewById(R.id.gov6);
        gov7 = (TextView) findViewById(R.id.gov7);
        gov8 = (TextView) findViewById(R.id.gov8);
        gov9 = (TextView) findViewById(R.id.gov9);
        gov10 = (TextView) findViewById(R.id.gov10);


        govl1 = (TextView) findViewById(R.id.govl1);
        govl2 = (TextView) findViewById(R.id.govl2);
        govl3 = (TextView) findViewById(R.id.govl3);
        govl4 = (TextView) findViewById(R.id.govl4);
        govl5 = (TextView) findViewById(R.id.govl5);
        govl6 = (TextView) findViewById(R.id.govl6);
        govl7 = (TextView) findViewById(R.id.govl7);
        govl8 = (TextView) findViewById(R.id.govl8);
        govl9 = (TextView) findViewById(R.id.govl9);
        govl10 = (TextView) findViewById(R.id.govl10);


        tv_home = (TextView) findViewById(R.id.tv_home);
        tv_home.setOnClickListener(this);

        btn_students.setOnClickListener(this);
        btn_public.setOnClickListener(this);
        btn_private.setOnClickListener(this);
        btn_technical.setOnClickListener(this);
        databaseNews2 = FirebaseDatabase.getInstance().getReference();




        Picasso.with(JobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/jobone%2Fpic.jpg?alt=media&token=bbb5a189-ab8b-4589-a96a-26025e179040").fit().into(img1);
        Picasso.with(JobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/jobtwo%2Fpic.jpg?alt=media&token=6cab0536-e0e6-4923-8a37-98144fefa511").fit().into(img2);
        Picasso.with(JobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/jobthree%2Fpic.jpg?alt=media&token=15f3ef51-92db-4e59-97b0-58dee1cd961b").fit().into(img3);
        Picasso.with(JobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/jobfour%2Fpic.jpg?alt=media&token=15545d32-edff-47bf-bbec-f10cb2c87589").fit().into(img5);

        Picasso.with(JobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/jobfive%2Fpic.jpg?alt=media&token=e0968db6-f5aa-40a6-8b0c-0bce0d49ba08").fit().into(img4);

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
            case R.id.btn_students:
                startActivity(new Intent(this,StudentjobsActivity.class));
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
