package com.example.pnj.ac.id.jobsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBeritaActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);

        Intent intent = getIntent();
        String image = intent.getStringExtra("image");
        String title = intent.getStringExtra("title");
        String nama = intent.getStringExtra("nama");
        String lokasi = intent.getStringExtra("lokasi");
        String tanggal = intent.getStringExtra("tanggal");
        String deskripsi = intent.getStringExtra("deskripsi");

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageURI(Uri.parse(image));

        TextView textViewTitle = findViewById(R.id.title);
        textViewTitle.setText(title);

        TextView textViewNama = findViewById(R.id.nama);
        textViewNama.setText(nama);

        TextView textViewLokasi = findViewById(R.id.lokasi);
        textViewLokasi.setText(lokasi);

        TextView textViewTanggal = findViewById(R.id.tanggal);
        textViewTanggal.setText(tanggal);

        TextView textViewDeskripsi = findViewById(R.id.deskripisi);
        textViewDeskripsi.setText(deskripsi);

    }
}
