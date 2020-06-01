package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Electntv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electntv);
        PDFView ntv=(PDFView)findViewById(R.id.electntv);
        ntv.fromAsset("electntv.pdf").load();
    }
}