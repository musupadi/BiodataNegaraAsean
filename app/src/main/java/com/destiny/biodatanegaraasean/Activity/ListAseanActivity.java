package com.destiny.biodatanegaraasean.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.destiny.biodatanegaraasean.Adapter.AdapterAsiaTenggara;
import com.destiny.biodatanegaraasean.Model.DataModel;
import com.destiny.biodatanegaraasean.Model.Model;
import com.destiny.biodatanegaraasean.R;

import java.util.ArrayList;

public class ListAseanActivity extends AppCompatActivity {
    private ArrayList<DataModel> pList = new ArrayList<>();
    RecyclerView rvCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_asean);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        AdapterAsiaTenggara cardViewAdapter = new AdapterAsiaTenggara(this);
        pList.addAll(Model.getListData());
        cardViewAdapter.setListAsean(pList);
        rvCategory.setAdapter(cardViewAdapter);
    }
}
