package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Itrbb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itrbb);
        PDFView rbb=findViewById(R.id.itrbbpdf);
        rbb.fromAsset("itrbb.pdf").load();
    }
}