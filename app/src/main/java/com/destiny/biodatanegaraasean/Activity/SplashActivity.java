package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.destiny.biodatanegaraasean.R;

public class SplashActivity extends AppCompatActivity {
    TextView tvSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvSplash = (TextView) findViewById(R.id.tvSplash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                changeActivity();
                finish();
            }
        }, 3000); //3000 L = 3 detik
    }
    private void changeActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
