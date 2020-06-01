package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Comppsc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comppsc);
        PDFView psc = findViewById(R.id.comppsc);
        psc.fromAsset("comppsc.pdf").load();

    }
}