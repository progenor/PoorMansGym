package com.example.poormansgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.poormansgym.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding bindig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindig = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bindig.getRoot());

        int[] imageId = {R.drawable.benchpress, R.drawable.deadlift, R.drawable.legpress};

        String[] name = {"Bench press", "Deadlift", "Leg press"};


        ArrayList<Machine> machineArrayList = new ArrayList<>();

        for(int i=0;i<imageId.length; i++) {

            Machine machine = new Machine(name[i], imageId[i]);
            machineArrayList.add(machine);
        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, machineArrayList);

        bindig.listView.setAdapter(listAdapter);
        bindig.listView.setClickable(true);
        bindig.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {

                Intent intent = new Intent(MainActivity.this, MachineActivity.class);

                intent.putExtra("name", name[pos]);
                intent.putExtra("imageid", imageId[pos]);
                intent.putExtra("pos", pos);

                startActivity(intent);

            }
        });

        bindig.listView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
                //TODO:rename the thing
            }
        });


    }




}