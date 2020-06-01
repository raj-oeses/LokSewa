package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mechanical extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);
        Button psc=findViewById(R.id.mechpsc);
        Button airlines=findViewById(R.id.mechairlines);
        Button ntc= findViewById(R.id.mechntc);

        psc.setOnClickListener(this);
        airlines.setOnClickListener(this);
        ntc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mechpsc:
                Intent psc=new Intent(this,Mechanicalpsc.class);
                startActivity(psc);
                break;
            case R.id.mechairlines:
                Intent airlines=new Intent(this,Mechanicalairlines.class);
                startActivity(airlines);
                break;
            case R.id.mechntc:
                Intent ntc=new Intent(this,Mechanicalntc.class);
                startActivity(ntc);
                break;
        }

    }
}