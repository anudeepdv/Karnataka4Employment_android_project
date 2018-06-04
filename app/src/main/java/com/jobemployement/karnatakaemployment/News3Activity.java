//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import static com.jobemployement.karnatakaemployment.R.id.imgnews1;

public class News3Activity extends AppCompatActivity {

    ImageView imgnews3;
    TextView tvnews3;
    DatabaseReference databaseNews1;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    @Override
    protected void onStart() {
        super.onStart();

        databaseNews1.child("news3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);

                tvnews3.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news3);

        imgnews3 = (ImageView) findViewById(R.id.imgnews3);
        tvnews3 = (TextView) findViewById(R.id.tvnews3);

        databaseNews1 = FirebaseDatabase.getInstance().getReference();

        Picasso.with(News3Activity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/bottomleft%2Fpic.jpg?alt=media&token=e1e10ea5-37ab-4cc7-891c-10214b2c7a04").fit().into(imgnews3);

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
