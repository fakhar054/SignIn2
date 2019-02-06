package com.example.fakharali.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class watch_later extends AppCompatActivity {
    ArrayList<WatchPojo> watchPojos=new ArrayList<>();
    RecyclerView watch_recylerView;
    WatchedProgrammingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_later);

        watch_recylerView=findViewById(R.id.watch_recylerView);
        watchPojos.add(new WatchPojo(R.drawable.river,"This is river","One Year Ago"));
        watchPojos.add(new WatchPojo(R.drawable.trese,"Beautiful Natural Scene","Its Yesterdays Picture"));

        watch_recylerView.setLayoutManager(new LinearLayoutManager(this));

      adapter=new WatchedProgrammingAdapter(watchPojos,watch_later.this );
      watch_recylerView.setAdapter(adapter);
    }
}
