package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class cer extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> heading=new ArrayList<>();
    private ArrayList<String>description=new ArrayList<>();
    private ArrayList<Integer>image=new ArrayList<>();
    private recycleadapter adapter;
    RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cer);

        recyclerView=findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(cer.this));

        heading.add("Harvard X");
        heading.add("Coursera");
        heading.add("Coursera");
        heading.add("Coursera");
        heading.add("");

        description.add("Exercising Leadership: Foundational Principles");
        description.add("Object Oriented Programming in Java");
        description.add("Introduction to Android Mobile Application Development");
        description.add("Programming with JavaScript");
        description.add("");

        image.add(R.drawable.harvard);
        image.add(R.drawable.coursera);
        image.add(R.drawable.coursera);
        image.add(R.drawable.coursera);
        image.add(R.drawable.tarun1);

        adapter=new com.example.portfolio.recycleadapter(heading,description,image,cer.this);
        recyclerView.setAdapter(adapter);

    }

}