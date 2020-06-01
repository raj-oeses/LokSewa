package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civil extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        Button psc=findViewById(R.id.psc);
        Button ntc=findViewById(R.id.ntc);

        psc.setOnClickListener(this);
        ntc.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.psc:
                Intent psc=new Intent(this,Civilpsc.class);
                startActivity(psc);
                break;
            case R.id.ntc:
                Intent ntc=new Intent(this,Civilntc.class);
                startActivity(ntc);
                break;
            case R.id.adbl:
                Intent adbl=new Intent(this,Civiladbl.class);
                startActivity(adbl);
                break;
            case R.id.nea:
                Intent nea=new Intent(this,Civilnea.class);
                startActivity(nea);
                break;

        }

    }
}