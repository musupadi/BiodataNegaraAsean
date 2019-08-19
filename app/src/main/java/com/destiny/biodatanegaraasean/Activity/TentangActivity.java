package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.biodatanegaraasean.R;

public class TentangActivity extends AppCompatActivity {
    Button kembali;
    TextView deskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        deskripsi=(TextView)findViewById(R.id.tvInfoRizki);
        kembali=(Button)findViewById(R.id.btnKembali);
        final MediaPlayer Suara = MediaPlayer.create(TentangActivity.this,R.raw.rizki);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TentangActivity.super.onBackPressed();
            }
        });
        deskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TentangActivity.this, "Tekan Untuk Mendengarkan Deskripsi Saya", Toast.LENGTH_SHORT).show();
            }
        });
        deskripsi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Suara.start();
                return true;
            }
        });

    }
}
