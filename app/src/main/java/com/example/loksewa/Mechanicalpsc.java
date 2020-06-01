package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mechanicalpsc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanicalpsc);
        PDFView psc=findViewById(R.id.mechpscpdf);
        psc.fromAsset("mechpsc.pdf").load();
    }
}