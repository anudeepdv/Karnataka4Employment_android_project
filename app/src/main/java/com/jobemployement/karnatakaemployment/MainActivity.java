
//Developed by Anudeep and Vijay
//Under the guidance of Prof.Nagegowda, PES University
package com.jobemployement.karnatakaemployment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private static final String TAG = "PhoneAuthActivity";
    private FirebaseAuth mAuth;

    Button  btn_jobs, btn_help ,  btn_know,btn_join,btn_contact, btn_mynews , btn_scholarship,btn_disc;
    Button btn_youth,img_left,img_right ;
    Button btn_contribute;
    ImageButton img_news , img_bottomright;
    //ImageButton  img_left , img_right  ,
    Button img_bottomleft;
    ImageView img_banner;
    //Button btn_page,btn_signmem,btn_nh ,btn_enterpr , btn_mycontact, btn_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button mSignOutButton = (Button) findViewById(R.id.sign_out_button);
        //TextView fireBaseId = (TextView) findViewById(R.id.detail);
        mAuth = FirebaseAuth.getInstance();
        //btn_page  = (Button) findViewById(R.id.btn_page);

        btn_jobs = (Button) findViewById(R.id.btnjob);

        btn_help = (Button) findViewById(R.id.btn_help);
        btn_know = (Button) findViewById(R.id.btn_know);
        btn_join = (Button) findViewById(R.id.btn_join);
        btn_contact = (Button) findViewById(R.id.btn_contact);
        btn_mynews = (Button) findViewById(R.id.btn_mynews);
       // btn_mycontact = (Button) findViewById(R.id.btn_mycontact);
        btn_disc = (Button) findViewById(R.id.btn_disc);
        //btn_nh = (Button) findViewById(R.id.btn_nh);



        // btn_signmem = (Button) findViewById(R.id.btn_signmem);
        btn_scholarship  = (Button) findViewById(R.id.btn_scholarships);
       // btn_enterpr = (Button) findViewById(R.id.btn_enterpr);
        //btn_home= (Button) findViewById(R.id.btn_home);


        img_news = (ImageButton) findViewById(R.id.img_news);
        img_left = (Button) findViewById(R.id.img_left);
        img_right = (Button) findViewById(R.id.img_right);
        img_bottomleft = (Button) findViewById(R.id.img_bottomleft);
        img_bottomright = (ImageButton) findViewById(R.id.img_bottomright);
        img_banner = (ImageView) findViewById(R.id.img_banner);



        Picasso.with(MainActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/imagemain%2Fpic.jpg?alt=media&token=47133d7f-947e-4791-9462-5d7f63da4292").fit().into(img_news);
       // Picasso.with(MainActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/imageleft%2Fpic.jpg?alt=media&token=e9924d5f-518b-438a-a604-cdda54103361").fit().into(img_left);
       // Picasso.with(MainActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/imageright%2Fpic.jpg?alt=media&token=a3fe8c56-931a-4c86-8a85-a9a754a5f394").fit().into(img_right);
        //Picasso.with(MainActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/bottomleft%2Fpic.jpg?alt=media&token=02a4e464-3a74-4019-b6a3-e999340669e3").fit().into(img_bottomleft);
        Picasso.with(MainActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/bottomright%2Fpic.jpg?alt=media&token=75efb348-1d3f-4ec2-ad14-8dda842d501d").fit().into(img_bottomright);
        Picasso.with(MainActivity.this).load("https://firebasestorage.googleapis.com/v0/b/karnatakaemployment.appspot.com/o/bannner%2Fpic.jpg?alt=media&token=95322d6b-31b9-469b-8b75-2b5b39035f4d").fit().into(img_banner);


        btn_jobs.setOnClickListener(this);
       // btn_page.setOnClickListener(this);
        btn_help.setOnClickListener(this);
       // btn_signmem.setOnClickListener(this);
        btn_know.setOnClickListener(this);
        btn_contact.setOnClickListener(this);
        btn_join.setOnClickListener(this);
        img_news.setOnClickListener(this);
        btn_mynews.setOnClickListener(this);
        img_left.setOnClickListener(this);
        img_right.setOnClickListener(this);
        btn_scholarship.setOnClickListener(this);
        //btn_enterpr.setOnClickListener(this);
        img_bottomleft.setOnClickListener(this);
        img_bottomright.setOnClickListener(this);
       // btn_mycontact.setOnClickListener(this);
        //btn_home.setOnClickListener(this);
        btn_disc.setOnClickListener(this);
        img_banner.setOnClickListener(this);
        //btn_nh.setOnClickListener(this);

//        if(mAuth.getCurrentUser()!=null){
//            //fireBaseId.setText(mAuth.getCurrentUser().getPhoneNumber());
//            Toast.makeText(this,"welcome-"+mAuth.getCurrentUser().getPhoneNumber(),Toast.LENGTH_LONG).show();
//        }
//        else {
//            startActivity(new Intent(MainActivity.this, PhoneAuth.class));
//        }

       // mSignOutButton.setOnClickListener(this);

        youth();
        contribute();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.sign_out_button:
//                mAuth.signOut();
//                startActivity(new Intent(MainActivity.this, Login2Activity.class));
//                finish();
//                break;
//            case R.id.btn_page:
//
//                startActivity(new Intent(this,MyPage.class));
//                break;


            case R.id.btnjob:
                startActivity(new Intent(this,JobsActivity.class));
                break;

            case R.id.btn_help:
                startActivity(new Intent(this,HelplineActivity.class));
                break;

//            case R.id.btn_signmem:
//                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
//                intent.setType("text/plain");
//                intent.putExtra(Intent.EXTRA_SUBJECT, "To turn coming Karnataka Assembly election into a War against Unemployment & Poverty by creating 10 lakh jobs before March 2018.");
//                intent.putExtra(Intent.EXTRA_TEXT, "Esteemed Leaders of the People,\n \n" +
//                        "The #Karnataka4Employment is a non-political forum of the public-spirited intellectuals, social activists, youths and students working towards making Karnataka a laboratory of Zero Unemployment Model which can pave the way for a right National Employment policy.\n\n" +
//                        "\nWhy do we need it?\n" +
//                        "While both the present governments in Karnataka and centre have completed long four and three years respectively, your performance on job creation is frustrating so far. The election promise of 2 crore jobs per year by the Hon’ble Prime Minister still appears to be a golden deer. For example, the flagship programme of the Government of India – Pradhan MantriKaushalyaVikas Yojana – which trained 17.58 lakh youth till April 25, 2016, could provide jobs to only 81,978(4.66%) youths. That too when every year 1.2 crore youth are added to the list of job-seekers, besides existing huge backlog of unemployed in India. It necessitates a serious review of the employment generation strategy and come out with time-bound result-oriented action plan without any political bias or election rhetoric.\n" +
//                        "\nConstructive Movement\n" +
//                        "We are not here to criticise anybody. Rather, we are sincerely trying to help the governments to find out an effective solution to the perennial problems of Unemployment & Poverty with productive contribution of the citizens, particularly the youth. On July 09, 2014, our convener Chandra Mishra sent a proposal to the Hon’ble Prime Minister offering to take up one backward district of the country and turn it to a Zero Unemployment Model. But as the central government explained how the new leadership was implementing new initiatives to solve the problem, Mr Mishra chose to wait and watch.\n" +
//                        "\nProposal to Karnataka Government\n" +
//                        "In mid-March this year, Mr Mishra submitted a proposal to the Karnataka Government for creation of 10 lakh jobs before election. The proposal designed as ‘My Karnataka, My Future’ intends to lay foundation of a 3-step strategy to turn Karnataka into a laboratory of Zero Unemployment Model.Besides job creation, it will help the government to \n(1) Abolish corruption in welfare programs and take governance to the doorsteps of the common man, \n(2) Ensure safe drinking water, sanitation, quality education and health services in all the villages through social entrepreneurship and, \n(3) Build sustainable and scalable village economy by promoting 5 lakh entrepreneurs in next 5 years.\n We are glad that our initiative worked as a wake-up call for the Karnataka Government which recently announced to create 1(one) lakh jobs through Skill Development. But this is too little and too late. As per report of the National Skill Development Council, Karnataka had 95 lakh unemployed youth in 2013. Is Karnataka Government working on a 100year road map to clear the backlog?\n" +
//                        "\nOur Demands\n" +
//                        "We therefore APPEAL you to implement following demands to safeguard future of our youth mass:\n" +
//                        "1. Instead of going to elections with empty promises, both the Central and State Governments shouldtake Karnataka as a Pilot Model and create 10 lakh jobs before State Assembly election, as a mark of positive competition.\n" +
//                        "2. The Government of India should earmark minimum 1% of bank deposits exclusively for self-employmentloans with Social Guarantee, market link and complete handholding for 5 years to ensure success and repayments of loans. It will help to create a strong sustainable and scalable village-centric People’s Economy with 70lakh to 1 crore jobs every year.\n" +
//                        "3. All skill development programmes by central/state governments must guarantee either 100% stable placement(no retrenchment within 5 years) or entrepreneurship loan for the trainees.\n" +
//                        "4. Ensure mandatory 100% placement for the students of technical & professional institutions, and link it to the system of approval, grants, sanctioning of seats and other government facilities.Full term technical and professional education meant to enhance employability should never create unemployment.\n" +
//                        "5. In case you have doubts on our proposal, we will be happy to shoulder the responsibility of preparing detailed blueprint, implementation and delivery of results. And, we hereby declare in public to face action if our proposals fail to generate 10 lakh jobs in 12 months.\n\n" +
//                        "Unemployment has no party affiliation. The unemployed youth of Congress are as sufferers as the unemployed youth of BJP or any other party. As we know that votes of 2.34 crore youths of Karnataka can change their fates, we have resolved to follow ‘NO JOB, NO VOTE’ in coming Assembly election. Wewill conduct Public Audit of the employment programmes of both central and state governments at district, taluk and panchayat levels over next 9 months and take a collective decision on the basis of your performance. We hope, you will appreciate our constructive initiative for ‘Nation Building through Career Building” of the youth force. Let’s defeat the twin malady of Unemployment & Poverty in this election.\n" +
//                        "\nWith warm regards,\n" +
//                        "Yours truly,\n" +
//                        "Chandra Mishra, Convener Sarovar Benkikere\n" +
//                        "Zero Unemployment Model\n" +
//                        "Anilkumar Vasu H V\n" +
//                        "Narasimha Murthy\n" +
//                        "Rajeshwari");
//                intent.setData(Uri.parse("mailto:connect@mygov.nic.in, narendramodi1234@gmail.com, indiaportal@gov.in, cm.kar@nic.in, chiefminister@karnataka.gov.in,karnatakaforemployment@gmail.com")); // or just "mailto:" for blank
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
//                startActivity(intent);
//                break;

            case R.id.btn_know:
                startActivity(new Intent(this,MemorandumActivity.class));
                break;

            case R.id.btn_contact:
                startActivity(new Intent(this,ContactActivity.class));
                break;

            case R.id.btn_join:
                startActivity(new Intent(this,JoinActivity.class));
                break;

            case R.id.img_news:
                startActivity(new Intent(this,NewsActivity.class));
                break;

            case R.id.btn_mynews:
                startActivity(new Intent(this,VolunteerActivity.class));
                break;

            case R.id.img_left:

                startActivity(new Intent(this,News1Activity.class));
                break;

            case R.id.img_right:
                startActivity(new Intent(this,News2Activity.class));
                break;

            case R.id.btn_scholarships:
                startActivity(new Intent(this,ScholarshipActivity.class));
                break;

//            case R.id.btn_enterpr:
//                startActivity(new Intent(this,EntrepreneurshipActivity.class));
//                break;

            case R.id.img_bottomleft:
                startActivity(new Intent(this,News3Activity.class));
                break;

            case R.id.img_bottomright:
                startActivity(new Intent(this,News4Activity.class));
                break;

//            case R.id.btn_mycontact:
//                startActivity(new Intent(this,MyConactInfo.class));
//                break;
            case R.id.btn_home:
                Toast.makeText(this,"You are in the home page",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_disc:
                startActivity(new Intent(this,DiscussionsActivity.class));
                break;
//            case R.id.btn_nh:
//                startActivity(new Intent(this,homeActivity.class));
//                break;
            case R.id.img_banner:
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



















        }

    }
    void youth(){
        btn_youth = (Button)findViewById(R.id.btn_youth);
        btn_youth.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this,Youth.class));
                    }
                }
        );
    }
    void contribute(){
        btn_contribute = (Button)findViewById(R.id.btn_contribute);
        btn_contribute.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this,Contribute.class));
                    }
                }
        );
    }
}
