package com.example.projectmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity2 extends AppCompatActivity {
    public static final String EXTRA_KOMIK = "extra_komik";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        Komik komik = getIntent().getParcelableExtra(EXTRA_KOMIK);

        ImageView ivPhoto = findViewById(R.id.iv_detail_image);
        TextView tvJenis = findViewById(R.id.tv_detail_jenis);
        TextView tvHarga = findViewById(R.id.tv_detail_harga);


        ivPhoto.setImageResource(komik.getGambar());
        tvJenis.setText(komik.getNama());
        tvHarga.setText(komik.getHarga());

    }
}