package com.example.bambooverse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private List<Item> itemList;

    // Constructor
    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    // View Holder for each item in the RecyclerView
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView itemName;
        public ImageView itemImage;

        public ItemViewHolder(View view) {
            super(view);
            itemName = view.findViewById(R.id.item_name);
            itemImage = view.findViewById(R.id.item_image);
        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_layout parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.itemName.setText(item.getItemName());
        holder.itemImage.setImageResource(item.getImageResource());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // Method to update the RecyclerView with filtered data
    public void filterList(List<Item> filteredList) {
        itemList = filteredList;
        notifyDataSetChanged();
    }
}
