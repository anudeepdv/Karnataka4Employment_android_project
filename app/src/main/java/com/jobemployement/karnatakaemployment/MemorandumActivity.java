//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University

package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MemorandumActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_eng , btn_kanada , btn_home;

    ImageView img_bannermain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorandum);

        btn_eng = (Button) findViewById(R.id.btn_eng);
        //btn_kanada = (Button) findViewById(R.id.btn_kanada);
        btn_home = (Button) findViewById(R.id.btn_home);
        img_bannermain = (ImageView) findViewById(R.id.img_banner1);

        btn_eng.setOnClickListener(this);
        //btn_kanada.setOnClickListener(this);
        btn_home.setOnClickListener(this);
        Picasso.with(MemorandumActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/banneer_mem%2Fpic.jpeg?alt=media&token=8e1b7bcd-a7b2-469c-bd6b-0c3a37b49704").fit().into(img_bannermain);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_eng:
                Intent intent1 = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent1.setType("text/plain");
                intent1.putExtra(Intent.EXTRA_SUBJECT,"Urge you to come with actions not empty promises on creating jobs before elections, otherwise we are here to" +
                        "say NO JOB NO VOTE");
                intent1.putExtra(Intent.EXTRA_TEXT,"Esteemed Leaders of the People,\n\n" +
                        "I, along with lakhs of youth in Karnataka agree to the memorandum that was submitted to you in May 2017 and wish to be part of NO JOB NO VOTE campaign. Hence I am forwarding that memorandum to you on my behalf.\n" +
                        "The #Karnataka4Employment is a non-political forum of the public-spirited intellectuals, social activists, youths and students working towards making Karnataka free from Unemployment which can pave the way for a suitable National Employment policy.\n\n" +
                        "Why do we need it?\n\n" +
                        "While both the governments in Karnataka and centre presently have completed long four and half and three and half years respectively, your performance on job creation is frustrating so far. The election promise of 1 crore jobs per year by the Hon’ble Prime Minister still appears to be a golden deer. For example, the flagship programme of the Government of India –\n" +
                        "Pradhan Mantri Kaushalya Vikas Yojana – which trained 17.58 lakh youth till April 25, 2016, could provide jobs to only 81,978(4.66%) youths. That too when every year 1.2 crore youth are added to the list of job-seekers, besides existing huge backlog of unemployed in India. It necessitates a serious review of the employment generation strategy and come out with time-bound result-oriented action plan without any political bias or election rhetoric.\n\n" +
                        "Our Demands\n\n" +
                        "We therefore APPEAL you to implement following demands to safeguard future of our youth mass:\n" +
                        "1. Instead of going to elections with empty promises, both the Central and State Governments should take Karnataka as a Pilot Model and create 10 lakh jobs before State Assembly election, as a mark of positive competition.\n\n" +
                        "2. The Government of India should earmark minimum 5% of bank deposits exclusively for self-employment loans with Social Guarantee, market link and complete handholding for 5 years to ensure success and repayments of loans. It will help to create a strong sustainable and scalable village-centric People’s Economy with 70lakh to 1 crore jobs every year.\n\n" +
                        "3. All skill development programmes by central/state governments must guarantee either 100% stable placement (no retrenchment within 5 years) or entrepreneurship loan for the trainees.\n\n" +
                        "4. Ensure mandatory 100% placement for the students of technical & professional institutions, and link it to the system of approval, grants, sanctioning of seats and other government facilities. Full term technical and professional education meant to enhance employability should never create unemployment.\n\n" +
                        "5. Ensure job security and equal wages to all the contract/casual/guest/trainee/stipendiary employees of both central and state governments till the age of 60 years. Take necessary legal measures to ensure this. After ensuring the job security fill in the vacant posts in all the departments of both the governments. All the workers working in different schemes of the government (like Anganawadi, Asha etc) should get the salary not less than group D employees of the government.\n\n" +
                        "6. Bring a legislation to implement the recommendation of the national farmers commission (i.e., Swaminathan commission) to ensure 150% of the cost of production for all the agricultural products.\n\n" +
                        "7. We are sure that the above proposals will ensure jobs to all the youths of this land. In case you have doubts on our proposal, we will be happy to shoulder the responsibility of preparing detailed blueprint, implementation and delivery of results.\n\n" +
                        "Unemployment has no party affiliation. The unemployed youth of Congress are as sufferers as the unemployed youth of BJP or any other party. As we know that votes of 2.75 crore youths of Karnataka can change their fates, we have resolved to follow ‘NO JOB, NO VOTE’ in coming Assembly election. We will conduct Public Audit of the employment programmes of both central and state governments at different levels and take a collective decision on the basis of your performance. We hope, you will appreciate our constructive initiative for ‘Nation Building through Career Building” of the youth force. Let’s defeat the twin malady of Unemployment & Poverty in this election.\n\n" +
                        "\n\n\n" +
                        "With warm regards,\n" +
                        "Yours truly,\n");
                intent1.setData(Uri.parse("mailto:connect@mygov.nic.in, narendramodi1234@gmail.com, indiaportal@gov.in, cm.kar@nic.in, chiefminister@karnataka.gov.in,karnatakaforemployment@gmail.com")); // or just "mailto:" for blank
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent1);
                break;

//            case R.id.btn_kanada:
//                Intent intent1 = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
//                intent1.setType("text/plain");
//                intent1.putExtra(Intent.EXTRA_SUBJECT, "To turn coming Karnataka Assembly election into a War against Unemployment & Poverty by creating 10 lakh jobs before March 2018.");
//                intent1.putExtra(Intent.EXTRA_TEXT, "");
//                intent1.setData(Uri.parse("mailto:anudeep.pesit@gmail.com")); // or just "mailto:" for blank
//                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
//                startActivity(intent1);
//                break;

            case R.id.btn_home:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }

    }
}
