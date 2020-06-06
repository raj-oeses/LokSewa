package com.example.loksewanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FirstLayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layer);

        final ListView listView=findViewById(R.id.lstview2);
        Storage str= new Storage();

        Intent message=getIntent();
        final int pos1=message.getIntExtra("position",0);
        listView.setAdapter(new CustomListAdaptere(this,str.SubSubjects(pos1)));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent display=new Intent(getApplicationContext(),SecondLayer.class);
                display.putExtra("finalpdffile",position);
                display.putExtra("position",pos1);

                startActivity(display);

            }
        });
    }
}