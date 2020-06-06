package com.example.loksewanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SecondLayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layer);

        final Storage str=new Storage();
        final ListView listView=findViewById(R.id.lstview3);
        Intent message=getIntent();

        final int pos2=message.getIntExtra("finalpdffile",0);
        final int pos1=message.getIntExtra("position",0);

        listView.setAdapter(new CustomListAdaptere(this,str.DisplayThird(pos1,pos2)));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (pos2!=3) {
                    Intent display = new Intent(getApplicationContext(), DisplayActivity.class);
                    //Storage str = new Storage();
                    display.putExtra("final", str.PdfFile(pos1, pos2, position));
                    Toast.makeText(getApplicationContext(), str.PdfFile(pos1, pos2, position), Toast.LENGTH_SHORT).show();

                    startActivity(display);
                }
                else{
                    Intent display = new Intent(getApplicationContext(), CivilPSC.class);
                    display.putExtra("position", position);

                    startActivity(display);
                }
            }
        });
    }
}