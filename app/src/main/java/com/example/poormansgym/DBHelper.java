package com.example.poormansgym;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {


    public static final String COSTUMER_TABLE = "COSTUMER_TABLE";
    public static final String DATE = "DATE";
    public static final String SETS = "SETS";
    public static final String REPS = "REPS";
    public static final String WEIGHT = "WEIGHT";
    public static final String ID = "ID";
    public static final String ID2 = "ID2";

    public DBHelper(@Nullable Context context) {
        super(context, "work.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + COSTUMER_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                "" + DATE + ", " + SETS + ", " + REPS + ", " + WEIGHT + "," + ID2 + ")";

        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldv, int newV) {
    //i dont think i will use this, like ever
    }

    public boolean addOne(Workout workout){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(DATE, workout.getDate());
        cv.put(SETS, workout.getSets());
        cv.put(REPS, workout.getReps());
        cv.put(WEIGHT, workout.getWeight());
        cv.put(ID2, workout.getId2());


        long insert = db.insert(COSTUMER_TABLE, null, cv);

        if (insert == -1)
            return false;
        else return true;


    }



    public List<Workout> getEverythingId(int id3){

        List<Workout> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + COSTUMER_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst())
        {
            do{
                int id2 = cursor.getInt(5);

                if(id2 == id3) {
                    int machID = cursor.getInt(0);
                    String date = cursor.getString(1);
                    int sets = cursor.getInt(2);
                    int reps = cursor.getInt(3);
                    int weight = cursor.getInt(4);


                    Workout workout = new Workout(machID, date, sets, reps,weight, 0);


                    returnList.add(workout);
                }

            }while(cursor.moveToNext());

        }
        else{
            //TODO: idk later something
        }

        cursor.close();
        db.close();

        return returnList;
    }






}
