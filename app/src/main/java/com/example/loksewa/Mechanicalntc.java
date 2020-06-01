package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mechanicalntc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanicalntc);
        PDFView ntc=findViewById(R.id.mechntcpdf);
        ntc.fromAsset("mechntc.pdf").load();
    }
}