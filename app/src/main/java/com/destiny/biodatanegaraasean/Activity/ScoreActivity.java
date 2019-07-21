package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destiny.biodatanegaraasean.R;

public class ScoreActivity extends AppCompatActivity {
    TextView SCORE;
    Button Kuis,Kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        SCORE = (TextView)findViewById(R.id.tvScore);
        Kuis = (Button)findViewById(R.id.btnKuis);
        Kembali = (Button)findViewById(R.id.btnKembali);
        Intent data = getIntent();
        final String Score = data.getStringExtra("SCORE");
        SCORE.setText("Selamat Anda mendapatkan Score : \n"+Score);
        Kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(ScoreActivity.this, KuisActivity.class);
                goInput.putExtra("NO",String.valueOf(0));
                goInput.putExtra("SCORE",String.valueOf(0));
                ScoreActivity.this.startActivities(new Intent[]{goInput});
            }
        });
        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
