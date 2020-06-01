package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Computer extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        Button ntc=findViewById(R.id.compntc);      //Type casting
        Button psc=findViewById(R.id.comppsc);

        psc.setOnClickListener(this);
        ntc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.compntc:
                Intent ntc=new Intent(this,Compntc.class);
                startActivity(ntc);
                break;
            case R.id.comppsc:
                Intent psc=new Intent(this,Comppsc.class);
                startActivity(psc);
                break;
        }
    }
}