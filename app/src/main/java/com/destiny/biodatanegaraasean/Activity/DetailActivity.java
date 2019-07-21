package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.destiny.biodatanegaraasean.R;

public class DetailActivity extends AppCompatActivity {
    TextView Nama,IbuKota,Pemerintahan,Semboyan,LaguKebangsaan,MataUang,Bahasa,LuasArea,JumlahPenduduk,KodeTelpon,InternetDomain,Deskripsi;
    ImageView Bendera,Logo;
    Button Maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Nama=(TextView)findViewById(R.id.tvNegara);
        IbuKota=(TextView)findViewById(R.id.tvIbuKota);
        Pemerintahan=(TextView)findViewById(R.id.tvPemerintahan);
        Semboyan=(TextView)findViewById(R.id.tvSemboyan);
        LaguKebangsaan=(TextView)findViewById(R.id.tvLaguKebangsaan);
        MataUang=(TextView)findViewById(R.id.tvMataUang);
        Bahasa=(TextView)findViewById(R.id.tvBahasa);
        LuasArea=(TextView)findViewById(R.id.tvLuas);
        JumlahPenduduk=(TextView)findViewById(R.id.tvPenduduk);
        KodeTelpon=(TextView)findViewById(R.id.tvTelepon);
        InternetDomain=(TextView)findViewById(R.id.tvInternetDomain);
        Deskripsi=(TextView)findViewById(R.id.tvDeksripsi);
        Bendera=(ImageView)findViewById(R.id.ivBendera);
        Logo=(ImageView)findViewById(R.id.ivLogo);
        Maps=(Button)findViewById(R.id.btnMaps);

        Intent data = getIntent();
        final String NEGARA = data.getStringExtra("NEGARA");
        final String IBUKOTA = data.getStringExtra("IBUKOTA");
        final String PEMERINTAHAN = data.getStringExtra("PEMERINTAHAN");
        final String SEMBOYAN = data.getStringExtra("SEMBOYAN");
        final String LAGU = data.getStringExtra("LAGU");
        final String MATAUANG = data.getStringExtra("MATAUANG");
        final String BAHASA = data.getStringExtra("BAHASA");
        final String AREA = data.getStringExtra("AREA");
        final String PENDUDUK = data.getStringExtra("PENDUDUK");
        final String TELEPON = data.getStringExtra("TELEPON");
        final String DOMAIN = data.getStringExtra("DOMAIN");
        final String DESKRIPSI = data.getStringExtra("DESKRIPSI");
        final String BENDERA = data.getStringExtra("BENDERA");
        final String LOGO = data.getStringExtra("LOGO");
        final String MAPS = data.getStringExtra("MAPS");

        Nama.setText("•\tNama Negara : "+NEGARA);
        IbuKota.setText("•\tIbu Kota :"+IBUKOTA);
        Pemerintahan.setText("•\tPemerintahan :"+PEMERINTAHAN);
        Semboyan.setText("•\tSemboyan :"+SEMBOYAN);
        LaguKebangsaan.setText("•\tLagu Kebangsaan :"+LAGU);
        MataUang.setText("•\tMata Uang :"+MATAUANG);
        Bahasa.setText("•\tBahasa :"+BAHASA);
        LuasArea.setText("•\tLuas Area :"+AREA);
        JumlahPenduduk.setText("•\tJumlah Penduduk :"+PENDUDUK);
        KodeTelpon.setText("•\tKode Telepon :"+TELEPON);
        InternetDomain.setText("•\tInternet Domain :"+DOMAIN);
        Deskripsi.setText(DESKRIPSI);
        Bendera.setImageResource(Integer.parseInt(BENDERA));
        Logo.setImageResource(Integer.parseInt(LOGO));

        Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(DetailActivity.this,MapsActivity.class);
                goInput.putExtra("MAPS",MAPS);
                DetailActivity.this.startActivities(new Intent[]{goInput});
            }
        });
    }
}
