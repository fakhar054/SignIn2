package com.example.fakharali.signin;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fakhar Ali on 1/25/2019.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.programmingViewHolder>{

    ArrayList<MyVideoPojo> arrayList;
    Context context;
    ArrayList<String> spinner_item;
    public ProgrammingAdapter(ArrayList<MyVideoPojo> arrayList,ArrayList<String>spinner_item,Context context) {
        this.arrayList=arrayList;
        this.context=context;
        this.spinner_item=spinner_item;
    }

    @Override
    public programmingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new programmingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(programmingViewHolder holder, int position) {
    int images=arrayList.get(position).getImage();
    String txttitle=arrayList.get(position).getTitle();
    String txtdetails=arrayList.get(position).getDetials();
   // String options=spinner_item.get(position);

    holder.recycleImage.setImageResource(images);
    holder.videoTitle.setText(txttitle);
    holder.videoDescription.setText(txtdetails);

//    holder.videoSpinner.setAdapter();
        ArrayAdapter<CharSequence> arrayAdapter;
        arrayAdapter=ArrayAdapter.createFromResource(context,R.array.spinnerValues,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      holder.videoSpinner.setAdapter(arrayAdapter);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }



    //class that holds views
    public class programmingViewHolder extends RecyclerView.ViewHolder {

        Spinner videoSpinner;
        ImageView recycleImage;
        TextView videoTitle,videoDescription;

        public programmingViewHolder(View itemView) {
            super(itemView);

            recycleImage=itemView.findViewById(R.id.recycleImage);
            videoTitle=itemView.findViewById(R.id.videoTitle);
            videoDescription=itemView.findViewById(R.id.videoDescription);
            videoSpinner=itemView.findViewById(R.id.videoSpinner);



        }
    }
}
