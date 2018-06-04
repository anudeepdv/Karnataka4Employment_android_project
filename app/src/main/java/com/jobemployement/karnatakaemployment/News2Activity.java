//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
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

public class News2Activity extends AppCompatActivity {

    ImageView imgnews2;
    TextView tvnews2;
    DatabaseReference databaseNews2;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("news2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tvnews2.setText(value);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news2);

        imgnews2 = (ImageView) findViewById(R.id.imgnews2);
        tvnews2 = (TextView) findViewById(R.id.tvnews2);

        databaseNews2 = FirebaseDatabase.getInstance().getReference();

        Picasso.with(News2Activity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/imageright%2Fpic.jpg?alt=media&token=a3fe8c56-931a-4c86-8a85-a9a754a5f394").fit().into(imgnews2);
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
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
