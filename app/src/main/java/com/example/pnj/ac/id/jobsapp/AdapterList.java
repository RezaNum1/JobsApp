package com.example.pnj.ac.id.jobsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterList extends  ArrayAdapter<DataJob> {

    Context context;
    int resource;

     public AdapterList(Context context, int resource){
         super(context, resource);
         this.context = context;
         this.resource = resource;
     }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            holder = new Holder();
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.textTitle = convertView.findViewById(R.id.textTitle);
            holder.textNama = convertView.findViewById(R.id.textNama);
            holder.textLokasi = convertView.findViewById(R.id.textLokasi);
            holder.textTanggal = convertView.findViewById(R.id.textTanggal);

            convertView.setTag(holder);
        }else {
            holder = (Holder) convertView.getTag();
        }


        holder.textTitle.setText(getItem(position).getTitle());
        holder.textNama.setText(getItem(position).getNama());
        holder.textLokasi.setText(getItem(position).getLokasi());
        holder.textTanggal.setText(getItem(position).getTanggal());

        new GetImageUrl(holder.imageView).execute(getItem(position).imageUrl);


        return convertView;
    }

    class Holder{
         ImageView imageView;
         TextView textTitle;
         TextView textNama;
         TextView textLokasi;
         TextView textTanggal;
    }
}
