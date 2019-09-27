package com.example.recyclerviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.recyclerviewactivity.Model.Mahasiswa;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter mAdapter;
    private ArrayList<Mahasiswa> mahasiswaarrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        parseData();

        recyclerView = findViewById(R.id.RecyclerMain);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MahasiswaAdapter(mahasiswaarrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
    }

    private void parseData() {
        mahasiswaarrayList = new ArrayList<>();
        mahasiswaarrayList.add(new Mahasiswa("eeeeeeeee", "72140003", "083876640644"));
        mahasiswaarrayList.add(new Mahasiswa("Yalina Hosea", "72170112", "083865465644"));
        mahasiswaarrayList.add(new Mahasiswa("aaaaaa", "72140099", "083876640644"));
        mahasiswaarrayList.add(new Mahasiswa("bbbbbb", "71229087", "08908678679"));
        mahasiswaarrayList.add(new Mahasiswa("hhhhhhhh", "7619100", "67867888987"));
        mahasiswaarrayList.add(new Mahasiswa("cccccc", "73679873", "80988689898"));
    }
}
