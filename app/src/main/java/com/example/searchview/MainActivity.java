package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
SearchView search;
ListView list;
ArrayList<String> list1;
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search=findViewById(R.id.search);
        list=findViewById(R.id.list);
        list1=new ArrayList<String>();
        list1.add("Operating System");
        list1.add("Computer Organization and Architecture");
        list1.add("Java");
        list1.add("Web and Mobile Development");
adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list1);
    list.setAdapter(adapter);
    search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String s) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String s) {
            adapter.getFilter().filter(s);
            return false;
        }
    });
    }
}