package com.example.bluebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;



    String[] content = {"Today is happy", "Got an offer!","Interview tomorrow"};

    int[] avatar = {R.drawable.ava1,R.drawable.ava2, R.drawable.ava3};

    int[] pic = {R.drawable.ava1,R.drawable.ava2, R.drawable.prepare};



    String[] time ={"20/10/2020 03:13AM", "19/10/2019 04:20PM", "17/10/2019 12:13PM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_test);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);



        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AddNew.class);
                startActivity(intent);
            }
        });

        recyclerAdapter= new RecyclerAdapter(getList(),content,avatar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);

    }

    public void itemClick(View view){
        int position = recyclerView.getChildAdapterPosition(view);
        Toast.makeText(MainActivity.this, "Click " + getList().get(position),
                Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(MainActivity.this, ItemActivity.class);
         startActivity(intent);

    }

    private List<String> getList() {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            String string = "Item " + i;
            stringList.add(string);
        }
        return stringList;
    }


}