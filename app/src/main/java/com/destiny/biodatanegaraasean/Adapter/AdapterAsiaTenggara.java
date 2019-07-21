package com.destiny.biodatanegaraasean.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destiny.biodatanegaraasean.Activity.DetailActivity;
import com.destiny.biodatanegaraasean.Activity.MapsActivity;
import com.destiny.biodatanegaraasean.Model.DataModel;
import com.destiny.biodatanegaraasean.R;

import java.util.ArrayList;

public class AdapterAsiaTenggara extends RecyclerView.Adapter<AdapterAsiaTenggara.CardViewViewHolder>{
    private Context context;
    private ArrayList<DataModel> listAsean;


    private ArrayList<DataModel> getListAsean() {
        return listAsean;
    }
    public void setListAsean(ArrayList<DataModel> listAsean) {
        this.listAsean= listAsean;
    }
    public AdapterAsiaTenggara(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_negara, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final DataModel p = getListAsean().get(i);
        cardViewViewHolder.nama.setText(p.getNama());
        cardViewViewHolder.matauang.setText(p.getMataUang());
        cardViewViewHolder.ibukota.setText(p.getIbuKota());
        cardViewViewHolder.bendera.setImageResource(Integer.parseInt(p.getBendera()));
        cardViewViewHolder.list.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent goInput = new Intent(context, DetailActivity.class);
                goInput.putExtra("NEGARA",p.getNama());
                goInput.putExtra("IBUKOTA",p.getIbuKota());
                goInput.putExtra("PEMERINTAHAN",p.getPemerintahan());
                goInput.putExtra("SEMBOYAN",p.getSemboyan());
                goInput.putExtra("LAGU",p.getLaguKebangsaan());
                goInput.putExtra("MATAUANG",p.getMataUang());
                goInput.putExtra("BAHASA",p.getBahasa());
                goInput.putExtra("AREA",p.getLuasArea());
                goInput.putExtra("PENDUDUK",p.getPenduduk());
                goInput.putExtra("TELEPON",p.getTelepon());
                goInput.putExtra("DOMAIN",p.getDomain());
                goInput.putExtra("DESKRIPSI",p.getDeskripsi());
                goInput.putExtra("BENDERA",p.getBendera());
                goInput.putExtra("LOGO",p.getLambang());
                goInput.putExtra("MAPS",p.getPeta());
                context.startActivities(new Intent[]{goInput});
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListAsean().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        TextView nama,matauang,ibukota;
        LinearLayout list;
        ImageView bendera;
        CardViewViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvNama);
            matauang= itemView.findViewById(R.id.tvMataUang);
            list = itemView.findViewById(R.id.List);
            ibukota = itemView.findViewById(R.id.tvIbuKota);
            bendera = itemView.findViewById(R.id.ivBendera);
        }
    }
}