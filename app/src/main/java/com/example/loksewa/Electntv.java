package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Electntv extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electntv);
        Button asstech = findViewById(R.id.assistanttechnician);
        Button electeng = findViewById(R.id.electronicengineering);
        Button seniorasstech = findViewById(R.id.seniorassistanttechnician);

        asstech.setOnClickListener(this);
        electeng.setOnClickListener(this);
        seniorasstech.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.electntc:
                Intent asstech = new Intent(this, Electntvasstech.class);
                startActivity(asstech);
            case R.id.electarilines:
                Intent electeng = new Intent(this, Electntvelectteng.class);
                startActivity(electeng);
                break;
            case R.id.electntv:
                Intent seniorasstech = new Intent(this, Electseniorasstech.class);
                startActivity(seniorasstech);
                break;

        }
    }
}