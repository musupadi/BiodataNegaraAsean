package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destiny.biodatanegaraasean.R;

public class MainActivity extends AppCompatActivity {
    Button AsiaTenggara,Asean,Kuis,Tentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AsiaTenggara=(Button)findViewById(R.id.btnAsiaTenggara);
        Asean=(Button)findViewById(R.id.btnAsean);
        Kuis=(Button)findViewById(R.id.btnKuis);
        Tentang=(Button)findViewById(R.id.btnTentang);

        Asean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AseanActivity.class);
                startActivity(intent);
            }
        });
        AsiaTenggara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListAseanActivity.class);
                startActivity(intent);
            }
        });
        Kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(MainActivity.this, KuisActivity.class);
                goInput.putExtra("NO",String.valueOf(0));
                goInput.putExtra("SCORE",String.valueOf(0));
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });
        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
    }
}
