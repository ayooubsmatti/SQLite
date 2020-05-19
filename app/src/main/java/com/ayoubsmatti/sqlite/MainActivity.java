package com.ayoubsmatti.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Controller.DatabaseHandler;
import Model.Person;

public class MainActivity extends AppCompatActivity {

    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHandler(this);
        db.addPerson(new Person("ayoub","smatti","alicante",24));
        db.addPerson(new Person("takie","laarbi","alicante",26));

        List<Person> personList =db.getPeople();
        for (Person p :personList){
            String myinfo = "ID: "+ p.getId() +" Name: " + p.getName();
            Log.d("people info",myinfo);
        }
    }
}
