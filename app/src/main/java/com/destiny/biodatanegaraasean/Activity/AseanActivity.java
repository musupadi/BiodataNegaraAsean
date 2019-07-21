package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destiny.biodatanegaraasean.R;

public class AseanActivity extends AppCompatActivity {
    Button maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asean);

        maps=(Button)findViewById(R.id.btnMaps);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(AseanActivity.this,MapsActivity.class);
                goInput.putExtra("MAPS",String.valueOf(R.drawable.maps_asean));
                AseanActivity.this.startActivities(new Intent[]{goInput});
            }
        });
    }
}
