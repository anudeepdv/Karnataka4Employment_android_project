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

public class PubicjobsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_students , btn_govt , btn_private , btn_technical;
    TextView tv_home;
    ImageButton img1 , img2,img3 , img4, img5;
    TextView tv_pub1 , tv_pub2,tv_pub3,tv_pub4,tv_pub5;

    TextView pub1,pub2,pub3,pub4,pub5,pub6,pub7,pub8,pub9,pub10;

    TextView publ1,publ2,publ3,publ4,publ5,publ6,publ7,publ8,publ9,publ10;

    DatabaseReference databaseNews2;

    @Override
    protected void onStart() {
        super.onStart();

        databaseNews2.child("pubjob1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);

                tv_pub1.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        databaseNews2.child("pubjob2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pub2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pubjob3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pub3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pubjob4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pub5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pubjob5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                tv_pub4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        databaseNews2.child("pub1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        databaseNews2.child("pub2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("pub9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("pub10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                pub10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });






        databaseNews2.child("publ1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        databaseNews2.child("publ2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); databaseNews2.child("publ9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseNews2.child("publ10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                publ10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubicjobs);

        btn_students = (Button) findViewById(R.id.btn_students);
        btn_govt = (Button) findViewById(R.id.btn_govt);
        btn_private = (Button) findViewById(R.id.btn_private);
        btn_technical = (Button) findViewById(R.id.btn_technical);
        tv_home = (TextView) findViewById(R.id.tv_home);

        img1  = (ImageButton) findViewById(R.id.img1);
        img2  = (ImageButton) findViewById(R.id.img2);
        img3  = (ImageButton) findViewById(R.id.img3);
        img4  = (ImageButton) findViewById(R.id.img4);
        img5  = (ImageButton) findViewById(R.id.img5);

        tv_pub1 = (TextView) findViewById(R.id.tv_pub1);
        tv_pub2 = (TextView) findViewById(R.id.tv_pub2);
        tv_pub3 = (TextView) findViewById(R.id.tv_pub3);
        tv_pub4 = (TextView) findViewById(R.id.tv_pub4);
        tv_pub5 = (TextView) findViewById(R.id.tv_pub5);

        pub1 = (TextView) findViewById(R.id.pub1);
        pub2 = (TextView) findViewById(R.id.pub2);
        pub3 = (TextView) findViewById(R.id.pub3);
        pub4 = (TextView) findViewById(R.id.pub4);
        pub5 = (TextView) findViewById(R.id.pub5);
        pub6 = (TextView) findViewById(R.id.pub6);
        pub7 = (TextView) findViewById(R.id.pub7);
        pub8 = (TextView) findViewById(R.id.pub8);
        pub9 = (TextView) findViewById(R.id.pub9);
        pub10 = (TextView) findViewById(R.id.pub10);


        publ1 = (TextView) findViewById(R.id.publ1);
        publ2 = (TextView) findViewById(R.id.publ2);
        publ3 = (TextView) findViewById(R.id.publ3);
        publ4 = (TextView) findViewById(R.id.publ4);
        publ5 = (TextView) findViewById(R.id.publ5);
        publ6 = (TextView) findViewById(R.id.publ6);
        publ7 = (TextView) findViewById(R.id.publ7);
        publ8 = (TextView) findViewById(R.id.publ8);
        publ9 = (TextView) findViewById(R.id.publ9);
        publ10 = (TextView) findViewById(R.id.publ10);


        databaseNews2 = FirebaseDatabase.getInstance().getReference();



        Picasso.with(PubicjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/publicjobone%2Fpic.jpg?alt=media&token=127d4db8-7880-4f20-9861-f5330b0f4777").fit().into(img1);
        Picasso.with(PubicjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/publicjobtwo%2Fpic.jpg?alt=media&token=a1084d4f-fad2-4bf3-8434-665cdf00905b").fit().into(img2);
        Picasso.with(PubicjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/publicjobthree%2Fpic.jpg?alt=media&token=53de6a41-8407-436d-ae18-1794018e838b").fit().into(img3);
        Picasso.with(PubicjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/publicjobfour%2Fpic.jpg?alt=media&token=f41ccf22-9c0c-4848-8309-7d0d05f2514d").fit().into(img5);

        Picasso.with(PubicjobsActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/publicjobfive%2Fpic.jpg?alt=media&token=ebec66c1-695e-420b-a065-e508683289ae").fit().into(img4);


        tv_home.setOnClickListener(this);

        btn_students.setOnClickListener(this);
        btn_govt.setOnClickListener(this);
        btn_private.setOnClickListener(this);
        btn_technical.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_private:
                startActivity(new Intent(this,PrivatejobsActivity.class));
                break;
            case R.id.btn_govt:
                startActivity(new Intent(this,JobsActivity.class));
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
