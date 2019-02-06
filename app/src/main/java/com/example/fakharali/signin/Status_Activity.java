package com.example.fakharali.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Status_Activity extends AppCompatActivity {
    RecyclerView list;
    ArrayList<statusPojo> arrayList=new ArrayList<>();
    Horizental_Adaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_);

        list=findViewById(R.id.list);
        arrayList.add(new statusPojo(R.drawable.river,"natural beauty"));
        arrayList.add(new statusPojo(R.drawable.trese,"Beatiful trees"));
        arrayList.add(new statusPojo(R.drawable.dollars,"American Dollars"));
        arrayList.add(new statusPojo(R.drawable.river,"natural beauty"));
        arrayList.add(new statusPojo(R.drawable.trese,"Beatiful trees"));
        arrayList.add(new statusPojo(R.drawable.dollars,"American Dollars"));

        list.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adaptor=new Horizental_Adaptor(arrayList,Status_Activity.this );
        list.setAdapter(adaptor);


    }
}
