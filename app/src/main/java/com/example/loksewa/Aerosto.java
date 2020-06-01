package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Aerosto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerosto);
        PDFView sto=findViewById(R.id.aerostopdf);
        sto.fromAsset("SeniorTechnicalOfficer.pdf").load();
    }
}