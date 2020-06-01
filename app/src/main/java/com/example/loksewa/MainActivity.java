package com.example.loksewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type casting
        //Managing the Objects of the view
        CardView youtube=findViewById(R.id.youtube);
        CardView loksyllabus=findViewById(R.id.looksewasyllbus);
        CardView mcq=findViewById(R.id.mcq);
        CardView aboutus=findViewById(R.id.aboutus);

        youtube.setOnClickListener(this);
        loksyllabus.setOnClickListener(this);
        mcq.setOnClickListener(this);
        aboutus.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){                         //For the youtube ,, passing to next intent
            case R.id.youtube:
                /*Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity( launchIntent );*/
                Intent youtubeplaylist = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCudFxp2sHnBY2Q25e-3UTiw/playlists"));//link of gyane playlist
                startActivity(youtubeplaylist);
                break;
            case R.id.looksewasyllbus:             //for the syllabus
                Intent looksewasyllbaus= new Intent(this,LoksewaSyllabus.class);
                startActivity(looksewasyllbaus);
                break;
            case R.id.mcq:                           //Multiple choice questions
                Intent mcq= new Intent(this,MCQ.class);
                startActivity(mcq);
                break;
            case R.id.aboutus:                        //Only displaying the content needed
                Intent aboutus=new Intent(this,AboutUs.class);
                startActivity(aboutus);
                break;
        }

    }
}
