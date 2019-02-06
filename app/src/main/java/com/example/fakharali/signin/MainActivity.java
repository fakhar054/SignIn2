package com.example.fakharali.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView textView2,help,timeWatched,membership,setting,turn;
    Spinner spinner;
    ArrayAdapter<CharSequence> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2=findViewById(R.id.textView2);
       membership=findViewById(R.id.membership);
       timeWatched=findViewById(R.id.timeWatched);
       setting=findViewById(R.id.setting);
        help=findViewById(R.id.help);
        turn=findViewById(R.id.turn);


        //code for spinner
        spinner=findViewById(R.id.spinner);
        arrayAdapter=ArrayAdapter.createFromResource(this,R.array.spinnerdemo,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Videos.class);
                startActivity(intent);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,watch_later.class);
                startActivity(intent);
            }
        });

        timeWatched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Time_Watched.class);
                startActivity(intent);
            }
        });

        membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Paid_Membership.class);
                startActivity(intent);
            }
        });
setting.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,SettingActivity.class);
        startActivity(intent);
    }
});
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Status_Activity.class);
                startActivity(intent);
            }
        });


    }
}
