package com.example.bambooverse;


import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WebsiteSearch extends AppCompatActivity {
    private RecyclerView recyclerView1;
    private List<Item> itemList;
    private ItemAdapter itemAdapter;
    private SearchView searchView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_search);

        searchView1 = findViewById(R.id.searchView1);
        searchView1.clearFocus();
        searchView1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }

        });
        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();

        itemList.add(new Item("Bamboo blueamana" , R.drawable.website));
        itemList.add(new Item("Bamboo Farming and Production in the Philippines" , R.drawable.website));
        itemList.add(new Item("Bamboo Technoguide" , R.drawable.website));

        itemAdapter = new ItemAdapter(itemList);
        recyclerView1.setAdapter(itemAdapter);

    }
    private void filterList(String text) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getItemName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);

            }

        }
        if (filteredList.isEmpty()) {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        }else{

        }
    }

}
