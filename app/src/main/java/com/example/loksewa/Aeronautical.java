package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Aeronautical extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aeronautical);
        Button oe = findViewById(R.id.aerooe);
        Button sto = findViewById(R.id.aerosto);

        oe.setOnClickListener(this);
        sto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aerooe:
                Intent oe = new Intent(this, Aerooe.class);
                startActivity(oe);
                break;
            case R.id.aerosto:
                Intent sto = new Intent(this, Aerosto.class);
                startActivity(sto);
                break;

        }
    }
}