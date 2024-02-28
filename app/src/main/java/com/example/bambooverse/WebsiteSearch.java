package com.example.bambooverse;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
        recyclerView1 = findViewById(R.id.recyclerView1);

}
