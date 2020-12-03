package com.example.projectmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.projectmobile.Data;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity2 extends AppCompatActivity {
    private CircleImageView circleImageView;
    private TextView tvNama;
    private TextView tvHarga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        circleImageView = findViewById(R.id.iv_detail_image);
        tvNama = findViewById(R.id.tv_detail_jenis);
        tvHarga = findViewById(R.id.tv_detail_harga);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String jenis = intent.getStringExtra("jenis");
        String photo = intent.getStringExtra("photo");
          Glide.with(getApplicationContext())
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(circleImageView);

        tvNama.setText(name);
        tvHarga.setText(jenis);

    }
}