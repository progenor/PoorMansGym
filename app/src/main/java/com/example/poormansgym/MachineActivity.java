package com.example.poormansgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.poormansgym.databinding.ActivityMachineBinding;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class MachineActivity extends AppCompatActivity {

    ActivityMachineBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMachineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int id3=-1;

        Intent intent = this.getIntent();

        if(intent != null){
            String name = intent.getStringExtra("name");
            int imageId = intent.getIntExtra("imageid", R.drawable.no_img);
            id3 = intent.getIntExtra("pos", -1);

            binding.mimg.setImageResource(imageId);
            binding.name.setText(name);

        }

        //getting the todays date
        Calendar calendar = Calendar.getInstance();
        String date = DateFormat.getDateInstance().format(calendar.getTime());

        binding.tdate.setText(date);

        int finalId3 = id3;
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Workout workout;
                try{


                    workout = new Workout(-1, date, Integer.parseInt(binding.sets.getText().toString()),
                            Integer.parseInt(binding.reps.getText().toString()), Integer.parseInt(binding.weight.getText().toString()), finalId3);
                    //Toast.makeText(MachineActivity.this, "**ERROR** "+ finalId3, Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    workout = new Workout(-1, "error", -1, -1, -1, -1);
                    Toast.makeText(MachineActivity.this, "**ERROR** "+e.toString(), Toast.LENGTH_SHORT).show();
                }


                DBHelper dbHelper = new DBHelper(MachineActivity.this);

                boolean idk = dbHelper.addOne(workout);
                Toast.makeText(MachineActivity.this, "Added: "+(idk ? "true":"false"), Toast.LENGTH_SHORT).show();


            }
        });

        binding.buttonPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: show all the stuff with the same ID2

                DBHelper dbHelper = new DBHelper(MachineActivity.this);

                List<Workout> everythingId = dbHelper.getEverythingId(finalId3);


                try{
//                  String ev = everythingId.toString();
//                  String[] arr = ev.split("[Workout{id20}]");
                    StringBuilder builder = new StringBuilder();


                    for(Workout i : everythingId){
                        builder.append("D: ").append(i.getDate()).append(" S: ")
                                .append(i.getSets()).append(" R: ").append(i.getReps()).append(" W: ").append(i.getWeight());
                    }

                    Toast.makeText(MachineActivity.this, builder.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MachineActivity.this, "ERROR"+e, Toast.LENGTH_SHORT).show();
                }
//
            }
        });




    }
}