package com.example.pnj.ac.id.jobsapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    AdapterList adapterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.activity_list_item));

        adapterList = new AdapterList(this, R.layout.itemlistview);
        listView.setAdapter(adapterList);
        initData();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataJob data = (DataJob) parent.getAdapter().getItem(position);
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("title",data.getTitle());
                intent.putExtra("nama",data.getNama());
                intent.putExtra("lokasi",data.getLokasi());
                intent.putExtra("image",data.getImageUrl());
                intent.putExtra("tanggal",data.getTanggal());
                intent.putExtra("deskripsi", data.getDeskripsi());
                startActivity(intent);

            }
        });
    }

    void initData(){
        ArrayList<DataJob> datas = new ArrayList<>();

        DataJob dataBerita1 = new DataJob();
        dataBerita1.setTitle("System Analyst");
        dataBerita1.setNama("Google Inc");
        dataBerita1.setLokasi("San Fransisco, USA");
        dataBerita1.setTanggal("Sabtu, 09/05/2019");
        dataBerita1.setImageUrl("https://bogor.net/wp-content/uploads/2018/02/evolving_google_identity_share.jpg");
        dataBerita1.setDeskripsi("Deskripsi Pekerjaan: System analyst bekerja pada tahap requirement dan design, walaupun kadangkala juga diperlukan untuk menyeberang dari tahap requirement dan design ke tahap construction/implementaion (coding/programming). Tentunya ini wajar karena biasanya seorang system analyst dahulunya juga seorang programmer. Tetapi seorang yang benar-benar diposisikan sebagai system analyst, tugas utamanya adalah membuat requirement dan desain software. \n" +
                "    Membangun/mengembangkan software terutama pada tahap requirement, design dan sebagian dalam tahap construction/implementation\n" +
                "    Membuat dokumen requiremant dan desain software berdasarkan proses bisnis customer/client\n" +
                "    Membuat proposal dan mempresentasikannya di hadapan stake holder / customer / client\n" +
                "    Membuat desain database bila aplikasi yang akan di bangun memerlukan database\n" +
                "    Membangun/mengembangkan framework/library untuk digunakan dalam pengembangan software oleh programmer\n");


        DataJob dataBerita2 = new DataJob();
        dataBerita2.setTitle("Animator");
        dataBerita2.setNama("Marvel Inc");
        dataBerita2.setLokasi("New York,New York, USA");
        dataBerita2.setTanggal("Minggu, 09/05/2019");
        dataBerita2.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/MarvelLogo.svg/1200px-MarvelLogo.svg.png");
        dataBerita2.setDeskripsi("Deskripsi Pekerjaan: System analyst bekerja pada tahap requirement dan design, walaupun kadangkala juga diperlukan untuk menyeberang dari tahap requirement dan design ke tahap construction/implementaion (coding/programming). Tentunya ini wajar karena biasanya seorang system analyst dahulunya juga seorang programmer. Tetapi seorang yang benar-benar diposisikan sebagai system analyst, tugas utamanya adalah membuat requirement dan desain software. \n" +
                "    Membangun/mengembangkan software terutama pada tahap requirement, design dan sebagian dalam tahap construction/implementation\n" +
                "    Membuat dokumen requiremant dan desain software berdasarkan proses bisnis customer/client\n" +
                "    Membuat proposal dan mempresentasikannya di hadapan stake holder / customer / client\n" +
                "    Membuat desain database bila aplikasi yang akan di bangun memerlukan database\n" +
                "    Membangun/mengembangkan framework/library untuk digunakan dalam pengembangan software oleh programmer\n");


        DataJob dataBerita3 = new DataJob();
        dataBerita3.setTitle("UI/UX");
        dataBerita3.setNama("Amazon Corp");
        dataBerita3.setLokasi("San Fransisco, USA");
        dataBerita3.setTanggal("Kamis, 09/05/2019");
        dataBerita3.setImageUrl("https://pmcvariety.files.wordpress.com/2018/01/amazon-logo.jpg?w=1000&h=562&crop=1");
        dataBerita3.setDeskripsi("\n" +
                "    Mendesain user interface agar menarik dan serasi secara visual dan user friendly\n" +
                "    Mendesain image/gambar/animasi yang akan digunakan di tampilan user interface (UI) software aplikasi\n\n" +
                "    Memiliki bakat/minat di seni rupa / desain visual\n" +
                "    Memahami dasar-dasar pemprograman baik web maupun secara umum\n" +
                "    Menguasai scripting untuk user interface seperti seperti HTML, DHTML, CSS, JavaScript, action script, XAML dll.\n" +
                "    Menguasai tools manipulasi image dan animasi\n");


        DataJob dataBerita4 = new DataJob();
        dataBerita4.setTitle("Databse Administrator");
        dataBerita4.setNama("Samsung Inc");
        dataBerita4.setLokasi("Seoul, South Korea");
        dataBerita4.setTanggal("Sabtu, 09/05/2019");
        dataBerita4.setImageUrl("http://artmarketbudapest.hu/wp-content/uploads/2018/09/samsung-logo.jpg");
        dataBerita4.setDeskripsi(" Tugas:\n" +
                "\n" +
                "    Merancang dan membangun database dalam sebuah sistem\n" +
                "    Merekomendasikan solusi terbaik dalam implementasi database baik dalam hal software maupun hardware\n" +
                "    Memaintain database agar dapat berjalan dengan baik dan optimal\n" +
                "\n" +
                "Keahlian yang Diperlukan:\n" +
                "\n" +
                "    Menguasai ERD, SQL dan desain database secara mendalam\n" +
                "    Menguasai berbagai teknik optimalisasi/tuning, backup dan maintain database\n" +
                "    Menguasai secara mendalam salah satu atau lebih RDBMS beserta tools yang ada.\n" +
                "    Memahami tentang salah satu platform/bahasa pemprograman untuk mengakses database\n" +
                "    Menguasai teknologi server, storage, operating system yang berkaitan dengan implementasi database\n");


        DataJob dataBerita5 = new DataJob();
        dataBerita5.setTitle("Software Engineer");
        dataBerita5.setNama("Apple Inc");
        dataBerita5.setLokasi("Seoul, South Korea");
        dataBerita5.setTanggal("Sabtu, 09/05/2019");
        dataBerita5.setImageUrl("https://www.apple.com/ac/structured-data/images/open_graph_logo.png?201809210816");
        dataBerita5.setDeskripsi(" Tugas:\n" +
                "\n" +
                "    Merancang dan membangun database dalam sebuah sistem\n" +
                "    Merekomendasikan solusi terbaik dalam implementasi database baik dalam hal software maupun hardware\n" +
                "    Memaintain database agar dapat berjalan dengan baik dan optimal\n" +
                "\n" +
                "Keahlian yang Diperlukan:\n" +
                "\n" +
                "    Menguasai ERD, SQL dan desain database secara mendalam\n" +
                "    Menguasai berbagai teknik optimalisasi/tuning, backup dan maintain database\n" +
                "    Menguasai secara mendalam salah satu atau lebih RDBMS beserta tools yang ada.\n" +
                "    Memahami tentang salah satu platform/bahasa pemprograman untuk mengakses database\n" +
                "    Menguasai teknologi server, storage, operating system yang berkaitan dengan implementasi database\n");



        DataJob dataBerita6 = new DataJob();
        dataBerita6.setTitle("Software Engineer");
        dataBerita6.setNama("BukaLapak Inc");
        dataBerita6.setLokasi("Seoul, South Korea");
        dataBerita6.setTanggal("Sabtu, 09/05/2019");
        dataBerita6.setImageUrl("https://www.bukalapak.com/images/new-brand-identity/1-logo-salah/logo_salah_9.png");
        dataBerita6.setDeskripsi(" Tugas:\n" +
                "\n" +
                "    Merancang dan membangun database dalam sebuah sistem\n" +
                "    Merekomendasikan solusi terbaik dalam implementasi database baik dalam hal software maupun hardware\n" +
                "    Memaintain database agar dapat berjalan dengan baik dan optimal\n" +
                "\n" +
                "Keahlian yang Diperlukan:\n" +
                "\n" +
                "    Menguasai ERD, SQL dan desain database secara mendalam\n" +
                "    Menguasai berbagai teknik optimalisasi/tuning, backup dan maintain database\n" +
                "    Menguasai secara mendalam salah satu atau lebih RDBMS beserta tools yang ada.\n" +
                "    Memahami tentang salah satu platform/bahasa pemprograman untuk mengakses database\n" +
                "    Menguasai teknologi server, storage, operating system yang berkaitan dengan implementasi database\n");


        DataJob dataBerita7 = new DataJob();
        dataBerita7.setTitle("Software Engineer");
        dataBerita7.setNama("Tokopedia Inc");
        dataBerita7.setLokasi("Seoul, South Korea");
        dataBerita7.setTanggal("Sabtu, 09/05/2019");
        dataBerita7.setImageUrl("https://statik.tempo.co/data/2015/10/10/id_444429/444429_620.jpg");
        dataBerita7.setDeskripsi(" Tugas:\n" +
                "\n" +
                "    Merancang dan membangun database dalam sebuah sistem\n" +
                "    Merekomendasikan solusi terbaik dalam implementasi database baik dalam hal software maupun hardware\n" +
                "    Memaintain database agar dapat berjalan dengan baik dan optimal\n" +
                "\n" +
                "Keahlian yang Diperlukan:\n" +
                "\n" +
                "    Menguasai ERD, SQL dan desain database secara mendalam\n" +
                "    Menguasai berbagai teknik optimalisasi/tuning, backup dan maintain database\n" +
                "    Menguasai secara mendalam salah satu atau lebih RDBMS beserta tools yang ada.\n" +
                "    Memahami tentang salah satu platform/bahasa pemprograman untuk mengakses database\n" +
                "    Menguasai teknologi server, storage, operating system yang berkaitan dengan implementasi database\n");


        datas.add(dataBerita1);
        datas.add(dataBerita2);
        datas.add(dataBerita3);
        datas.add(dataBerita4);
        datas.add(dataBerita5);
        datas.add(dataBerita6);
        datas.add(dataBerita7);

        adapterList.addAll(datas);
        adapterList.notifyDataSetChanged();
    }

}
