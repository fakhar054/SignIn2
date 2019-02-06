package com.example.fakharali.signin;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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

public class WatchedProgrammingAdapter extends RecyclerView.Adapter<WatchedProgrammingAdapter.ProgrammingViewHolder> {

    ArrayList<WatchPojo> arrayList;
    Context context;

    public WatchedProgrammingAdapter(ArrayList<WatchPojo> arrayList,Context context) {
      this.arrayList=arrayList;
      this.context=context;
    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.watched_list,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
     int images=arrayList.get(position).getImage();
     String txttitle=arrayList.get(position).getTitle();
     String txtdescription=arrayList.get(position).getDescription();

     //for setting images and textView
       holder.watch_image.setImageResource(images);
       holder.watch_title.setText(txttitle);
       holder.watched_subtitle.setText(txtdescription);
    //for setting spinner
        ArrayAdapter<CharSequence> spinnerAdaptor;
        spinnerAdaptor=ArrayAdapter.createFromResource(context,R.array.watched_spinner,android.R.layout.simple_spinner_item);
        spinnerAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        holder.watch_spinner.setAdapter(spinnerAdaptor);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView watch_image;
        TextView watch_title;
        TextView watched_subtitle;
        Spinner watch_spinner;

       public ProgrammingViewHolder(View itemView) {
           super(itemView);
           watch_image=itemView.findViewById(R.id.watch_image);
           watch_title=itemView.findViewById(R.id.watch_title);
           watch_spinner=itemView.findViewById(R.id.watch_spinner);
           watched_subtitle=itemView.findViewById(R.id.watched_subtitle);


       }
   }


}
