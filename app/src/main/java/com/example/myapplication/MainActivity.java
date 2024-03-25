package com.example.myapplication;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    // Data
    private ArrayList<DataModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        prepareData();
        adapter = new MyAdapter(data);
        recyclerView.setAdapter(adapter);
    }
    private void prepareData() {
        data.add(new DataModel("Abmi Sukma", "12250120341", R.drawable.woman));
        data.add(new DataModel("Ahmad Kurniawan", "12250111514", R.drawable.man));
        data.add(new DataModel("Aufa Hajati", "12250120338", R.drawable.woman));
        data.add(new DataModel("Daffa Finanda", "12250111603", R.drawable.man));
        data.add(new DataModel("Daffa Ikhwan Nurfauzan", "12250110979", R.drawable.man));
        data.add(new DataModel("Dwi Jelita", "12250120331", R.drawable.woman));
        data.add(new DataModel("Dwi Mahdini", "12250111298", R.drawable.man));
        data.add(new DataModel("Fajri", "12250110382", R.drawable.man));
        data.add(new DataModel("Fakhri", "12250111381", R.drawable.man));
        data.add(new DataModel("Farras Latief", "12250111328", R.drawable.man));
        data.add(new DataModel("Gilang Ramadhan Indra", "12250111323", R.drawable.man));
        data.add(new DataModel("Hafidz AlHadid Rahman", "12250111794", R.drawable.man));
        data.add(new DataModel("Haritsah Naufaldi", "12250110361", R.drawable.man));
        data.add(new DataModel("M. Nabil Dhawami", "12250111527", R.drawable.man));
        data.add(new DataModel("Muh. Zaki Erbai Syas", "12250111134", R.drawable.man));
        data.add(new DataModel("Muhammad Aditya Rinaldi", "12250111048", R.drawable.man));
        data.add(new DataModel("Muhammad Dhimas Hadid", "12250111231", R.drawable.man));
        data.add(new DataModel("Muhammad Faruq", "12250111791", R.drawable.man));
        data.add(new DataModel("M. Rafly Wirayudha", "12250111489", R.drawable.man));
        data.add(new DataModel("Nurika Dwi Wahyuni", "12250120360", R.drawable.woman));
        data.add(new DataModel("Ogya Secio Noegroho. S", "12250111346", R.drawable.man));
        data.add(new DataModel("Rahma Laksita", "12250124357", R.drawable.woman));
        data.add(new DataModel("Surya Hidayatullah", "12250111759", R.drawable.man));


    }
}
