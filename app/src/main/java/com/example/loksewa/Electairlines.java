package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Electairlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electairlines);

        PDFView airlines=findViewById(R.id.electairlines);
        airlines.fromAsset("electairlines.pdf").load();
    }
}