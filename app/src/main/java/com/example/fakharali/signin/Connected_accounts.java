package com.example.fakharali.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Connected_accounts extends AppCompatActivity {
    RecyclerView recylerView;
    ArrayList<AccountPojo> arrayList=new ArrayList<>();
    AcountRecyAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connected_accounts);

        recylerView=findViewById(R.id.recylerView);
        arrayList.add(new AccountPojo(R.drawable.trese,"FACEIT","Not connected"));

        recylerView.setLayoutManager(new LinearLayoutManager(this));
        adaptor=new AcountRecyAdaptor(arrayList,Connected_accounts.this);
        recylerView.setAdapter(adaptor);

    }
}
