package com.example.fakharali.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Videos extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<MyVideoPojo> myVideoPojos=new ArrayList<>();
    ProgrammingAdapter adapter;
    ArrayList<String> spinerlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        recyclerView=findViewById(R.id.recyclerView);
        myVideoPojos.add(new MyVideoPojo(R.drawable.trese,"Natural beauty","One year Ago"));
        myVideoPojos.add(new MyVideoPojo(R.drawable.sports,"A beautiful Scene","Three Months Ago"));
        myVideoPojos.add(new MyVideoPojo(R.drawable.watch,"A beautiful Watch","two Months Ago"));
        myVideoPojos.add(new MyVideoPojo(R.drawable.river,"A beautiful river","One day Ago"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ProgrammingAdapter(myVideoPojos,spinerlist,Videos.this);
        recyclerView.setAdapter(adapter);
    }
}
