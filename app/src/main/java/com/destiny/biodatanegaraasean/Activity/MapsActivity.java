package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.destiny.biodatanegaraasean.R;

public class MapsActivity extends AppCompatActivity {
    Button kembali;
    ImageView maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        maps=(ImageView)findViewById(R.id.ivMaps);
        kembali=(Button)findViewById(R.id.btnKembali);
        Intent data = getIntent();
        final String Maps = data.getStringExtra("MAPS");
        maps.setImageResource(Integer.parseInt(Maps));
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MapsActivity.super.onBackPressed();
            }
        });
    }
}
