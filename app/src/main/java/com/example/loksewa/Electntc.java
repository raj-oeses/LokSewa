package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Electntc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electntc);

        Button firstpapers=findViewById(R.id.electntcfirstpaper);
        Button secondpapers=findViewById(R.id.electntcsecondpaper);

        firstpapers.setOnClickListener(this);
        secondpapers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.electntcfirstpaper:
                Intent firstpaper=new Intent(this,Electntcfirst.class);
                startActivity(firstpaper);
                break;
            case R.id.electntcsecondpaper:
                Intent secondpaper=new Intent(this,Electntcsecond.class);
                startActivity(secondpaper);
                break;
        }
    }
}