package com.example.loksewanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CivilPSC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_p_s_c);

        Storage str=new Storage();
        final ListView listView=findViewById(R.id.lstviewcivil);
        Intent message=getIntent();
        final int pos1=message.getIntExtra("position",0);
        listView.setAdapter(new CustomListAdaptere(this,str.Civil(pos1)));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //int pos1=message.getIntExtra("position",0);

                Intent display = new Intent(getApplicationContext(), DisplayActivity.class);
                Storage str = new Storage();
                display.putExtra("final", str.Civilsub(pos1, position));
                Toast.makeText(getApplicationContext(), str.Civilsub(pos1, position), Toast.LENGTH_SHORT).show();

                startActivity(display);

            }
        });
    }
}