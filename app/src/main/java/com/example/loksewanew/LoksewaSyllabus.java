package com.example.loksewanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LoksewaSyllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loksewa_syllabus);
        final String[] subject = {"Aeronautical Engineering", "Architect Engineer","Automobile Engineering","Civil Engineering","Computer Engineering","Electrical Engineering","Electronics Engineering","IT Engineering","Mechanical Engineering"};
        //final String[] pdffile = {"OperationsEngineer.pdf", "SeniorTechnicalOfficer.pdf"};
        ListView ls = findViewById(R.id.lstview);
        //CustomListAdaptere customListAdaptere= new CustomListAdaptere(getApplicationContext(),subject);
        //ls.setAdapter(customListAdaptere);

        // ls.setAdapter(adapter);
        //  Normall ma default vako adapter use huntheyo
        //  since we have made our own adapter we are using this
        ls.setAdapter(new CustomListAdaptere(getApplicationContext(),subject));

        // now we are going for the onClickListener
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent display=new Intent(getApplicationContext(),DisplayActivity.class);
                display.putExtra("file",subject[position]);
                startActivity(display);
            }
        });
    }
}