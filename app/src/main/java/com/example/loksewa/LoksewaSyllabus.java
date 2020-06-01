package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoksewaSyllabus extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loksewa_syllabus);
        //managing the objects
        Button electronics=findViewById(R.id.electronicsengineering);
        Button civil=findViewById(R.id.CivilEngineering);
        Button computer=findViewById(R.id.ComputerEngineering);
        Button electrical=findViewById(R.id.ElectricalEngineering);
        Button it=findViewById(R.id.ITEngineering);
        Button mechanical=findViewById(R.id.MechanicalEngineering);
        Button aero=findViewById(R.id.AeronauticalEngineering);

        electronics.setOnClickListener(this);
        civil.setOnClickListener(this);
        computer.setOnClickListener(this);
        electrical.setOnClickListener(this);
        it.setOnClickListener(this);
        mechanical.setOnClickListener(this);
        aero.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.electronicsengineering:
                Intent electonics= new Intent(this,Electronics.class);
                startActivity(electonics);
                break;
            case R.id.CivilEngineering:
                Intent civil= new Intent(this,Civil.class);
                startActivity(civil);
                break;
            case R.id.ComputerEngineering:
                Intent computer= new Intent(this,Computer.class);
                startActivity(computer);
                break;
            case R.id.ElectricalEngineering:
                Intent electrical= new Intent(this,Electrical.class);
                startActivity(electrical);
                break;
            case R.id.ITEngineering:
                Intent it= new Intent(this,IT.class);
                startActivity(it);
                break;
            case R.id.MechanicalEngineering:
                Intent mech= new Intent(this,Mechanical.class);
                startActivity(mech);
                break;
            case R.id.AeronauticalEngineering:
                Intent aero= new Intent(this,Aeronautical.class);
                startActivity(aero);
                break;
        }
    }
}