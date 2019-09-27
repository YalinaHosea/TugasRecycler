package com.example.recyclerviewactivity;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewactivity.Model.Mahasiswa;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {

    private ArrayList<Mahasiswa> datalist;
    public MahasiswaAdapter(ArrayList<Mahasiswa> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(datalist.get(position).getNama());
        holder.txtNpm.setText(datalist.get(position).getNpm());
        holder.txtnohp.setText(datalist.get(position).getNohp());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         private TextView txtNama, txtNpm, txtnohp;
         public ViewHolder(View view){
             super(view);
             txtNama = view.findViewById(R.id.txtNamaMhs);
             txtNpm = view.findViewById(R.id.txtNpmMhs);
             txtnohp = view.findViewById(R.id.txtNhpmMhs);

         }
    }
}

