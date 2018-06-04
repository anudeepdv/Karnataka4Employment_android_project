package com.jobemployement.karnatakaemployment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Youth extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("Youthman.pdf").load();
    }
}
