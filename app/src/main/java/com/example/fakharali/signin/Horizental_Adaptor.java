package com.example.fakharali.signin;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Fakhar Ali on 2/4/2019.
 */

public class Horizental_Adaptor extends RecyclerView.Adapter<Horizental_Adaptor.HorizentalViewHolder> {

    ArrayList<statusPojo> arrayList;
    Context context;

    public Horizental_Adaptor(ArrayList<statusPojo> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public HorizentalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.status_list,parent,false);
        return new HorizentalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizentalViewHolder holder, int position) {

        int images=arrayList.get(position).getImages();
        String txtnames=arrayList.get(position).getTitles();

        //setting images

        holder.status_ImageView.setImageResource(images);
        holder.status_TV.setText(txtnames);

        //Onclick code

        holder.status_ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "You clicked", Toast.LENGTH_SHORT).show();
                //full screen dialog code
                Dialog dialog;
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class HorizentalViewHolder extends RecyclerView.ViewHolder{


        TextView status_TV;
        ImageView status_ImageView;
        public HorizentalViewHolder(View itemView) {
            super(itemView);
            status_ImageView=itemView.findViewById(R.id.status_img);
            status_TV=itemView.findViewById(R.id.status_title);
        }
    }
}
