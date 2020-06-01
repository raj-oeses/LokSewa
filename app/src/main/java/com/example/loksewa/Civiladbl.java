package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Civiladbl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civiladbl);
        PDFView adbl=findViewById(R.id.civiladblpdf);
        adbl.fromAsset("CivilOverseer.pdf").load();
    }
}