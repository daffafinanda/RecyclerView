package com.example.myapplication ;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView nimTextView;
        public ImageView imageView;

        public MyViewHolder(View v) {
            super(v);
            nameTextView = v.findViewById(R.id.tv_nama);
            nimTextView = v.findViewById(R.id.tv_nim);
            imageView = v.findViewById(R.id.iv_foto);
        }
    }

    public MyAdapter(ArrayList<DataModel> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final DataModel currentItem = dataList.get(position);

        holder.nameTextView.setText(currentItem.getName());
        holder.nimTextView.setText(currentItem.getNim());
        holder.imageView.setImageResource(currentItem.getImageResource());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("name", currentItem.getName());
                intent.putExtra("nim", currentItem.getNim());
                intent.putExtra("imageResource", currentItem.getImageResource());
                v.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }
}


