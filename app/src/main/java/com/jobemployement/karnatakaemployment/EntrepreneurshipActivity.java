//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University

package com.jobemployement.karnatakaemployment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class EntrepreneurshipActivity extends AppCompatActivity {

    ImageView img_enter ;
    TextView tv_enter;
    DatabaseReference databaseNews1;

    @Override
    protected void onStart() {
        super.onStart();

        databaseNews1.child("Entrepreneurship").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);

                tv_enter.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepreneurship);
        img_enter = (ImageView) findViewById(R.id.img_enter);
        tv_enter = (TextView) findViewById(R.id.tv_enter);

        databaseNews1 = FirebaseDatabase.getInstance().getReference();

        Picasso.with(EntrepreneurshipActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/Entrepreneurship%2Fpic.jpg?alt=media&token=106c7638-24a5-4931-91a4-f6a7f746f2f9").fit().into(img_enter);

    }
}
