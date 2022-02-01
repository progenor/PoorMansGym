package com.example.poormansgym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<Machine> {

    public ListAdapter(Context context, ArrayList<Machine> machineArrayList){
        super(context, R.layout.list_item, machineArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Machine machine = getItem(position);

        if(convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        ImageView imageView = convertView.findViewById(R.id.machineImage);
        TextView machineName = convertView.findViewById(R.id.machineName);


        imageView.setImageResource(machine.imgId);
        machineName.setText(machine.name);

        return convertView;
    }
}
