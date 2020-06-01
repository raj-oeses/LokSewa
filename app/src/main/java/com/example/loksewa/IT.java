package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import android.widget.Button;

public class IT extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_t);
        Button rbb=findViewById(R.id.itrbb);
        Button nrb=findViewById(R.id.itnrb);
        Button nbl=findViewById(R.id.itnbl);

        rbb.setOnClickListener(this);
        nrb.setOnClickListener(this);
        nbl.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.itrbb:
                Intent rbb=new Intent(this,Itrbb.class);
                startActivity(rbb);
                break;
            case R.id.itnrb:
                Intent nrb=new Intent(this,Itnrb.class);
                startActivity(nrb);
                break;
            case R.id.itnbl:
                Intent nbl=new Intent(this,Itnbl.class);
                startActivity(nbl);
                break;
        }

    }
}