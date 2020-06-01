package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mechanicalairlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanicalairlines);
        PDFView airlines=findViewById(R.id.mechairlinespdf);
        airlines.fromAsset("mecharilines.pdf").load();
    }
}