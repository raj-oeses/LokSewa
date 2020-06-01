package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Electrical extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);
        Button nea=findViewById(R.id.electricalnea);
        Button ntc= findViewById(R.id.electricalntc);

        nea.setOnClickListener(this);
        ntc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.electricalnea:
                Intent nea=new Intent(this,Electricalnea.class);
                startActivity(nea);
                break;
            case R.id.electricalntc:
                Intent ntc=new Intent(this,Electricalntc.class);
                startActivity(ntc);
                break;
        }

    }
}