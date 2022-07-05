package com.example.assignment4android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(dataListQueu()));
    }

    public ArrayList<Model> dataListQueu() {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1 = new Model();
        ob1.setName("Hamza");
        ob1.setEmail("Hamza@gmail.com");
        ob1.setContact("03401477376");

        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setName("Hamza");
        ob2.setEmail("Hamza@gmail.com");
        ob2.setContact("03401477376");
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setName("Umair");
        ob3.setEmail("Umair@gmail.com");
        ob3.setContact("03401477376");
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setName("Shahrukh");
        ob4.setEmail("Shahrukh@gmail.com");
        ob4.setContact("03401477376");
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setName("Imad");
        ob5.setEmail("Imad@gmail.com");
        ob5.setContact("03401477376");
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setName("haseed");
        ob6.setEmail("haseed@gmail.com");
        ob6.setContact("03401477376");
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setName("khanzada");
        ob7.setEmail("khanzada@gmail.com");
        ob7.setContact("03401477376");
        holder.add(ob7);

        Model ob8 = new Model();
        ob8.setName("fahad");
        ob8.setEmail("fahad@gmail.com");
        ob8.setContact("03401477376");
        holder.add(ob8);

        Model ob9 = new Model();
        ob9.setName("abdullah");
        ob9.setEmail("abdullah@gmail.com");
        ob9.setContact("03401477376");
        holder.add(ob9);

        Model ob10 = new Model();
        ob10.setEmail("ali@gmail.com");
        ob10.setContact("03401477376");
        ob10.setName("ali");
        holder.add(ob10);

        Model ob11 = new Model();
        ob11.setName("adil");
        ob11.setEmail("adil@gmail.com");
        ob11.setContact("03401477376");
        holder.add(ob11);

        Model ob12 = new Model();
        ob12.setName("adnan");
        ob12.setEmail("adnan@gmail.com");
        ob12.setContact("03401477376");
        holder.add(ob12);

        Model ob13 = new Model();
        ob13.setName("zulkif");
        ob13.setEmail("zulkif@gmail.com");
        ob13.setContact("03401477376");
        holder.add(ob13);

        return holder;
    }
}