package com.example.projectmobile;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private ArrayList<Komik> Listkomik;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListAdapter(ArrayList<Komik> Listkomik) {
        this.Listkomik = Listkomik;
    }

    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListAdapter.ListViewHolder holder, int position) {
        Komik komik = Listkomik.get(position);
        holder.imgPhoto.setImageResource(komik.getGambar());
        holder.tvName.setText(komik.getNama());
        holder.tvHarga.setText(komik.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(Listkomik.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return Listkomik.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Komik data);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHarga;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_image);
            tvName = itemView.findViewById(R.id.tv_jenis);
            tvHarga = itemView.findViewById(R.id.tv_harga);
        }
    }
}