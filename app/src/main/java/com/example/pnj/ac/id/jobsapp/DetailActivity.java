package com.example.pnj.ac.id.jobsapp;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity{

    TextView contentTanggal, contentTitle, contentDeskripsi, contentNama, contentLokasi;
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();

        contentTitle = findViewById(R.id.contentTitle);
        contentNama = findViewById(R.id.contentNama);
        contentLokasi = findViewById(R.id.contentLokasi);
        contentTanggal = findViewById(R.id.contentTanggal);
        contentDeskripsi = findViewById(R.id.contentDeskripsi);
        imageView = findViewById(R.id.imageView);

        if(extras!=null) {
            contentTitle.setText(extras.getString("title",""));
            contentNama.setText(extras.getString("nama",""));
            contentLokasi.setText(extras.getString("lokasi",""));
            contentTanggal.setText(extras.getString("tanggal",""));
            contentDeskripsi.setText(extras.getString("deskripsi",""));

            new GetImageUrl(imageView).execute(extras.getString("image",""));
        }

    }
}
