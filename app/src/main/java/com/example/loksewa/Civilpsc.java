package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Civilpsc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilpsc);

        PDFView psc=findViewById(R.id.civilpsc);
         psc.fromAsset("civilpsc.pdf").load();
    }
}