package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Electronics extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        Button ntc=findViewById(R.id.electntc);
        Button airlines=findViewById(R.id.electarilines);
        Button ntv=findViewById(R.id.electntv);

        ntc.setOnClickListener(this);
        airlines.setOnClickListener(this);
        ntv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.electntc:
                Intent ntc=new Intent(this,Electntc.class);
                startActivity(ntc);
            case R.id.electarilines:
                Intent airlines=new Intent(this,Electairlines.class);
                startActivity(airlines);
                break;
            case R.id.electntv:
                Intent ntv=new Intent(this,Electntv.class);
                startActivity(ntv);
                break;
        }
    }
}