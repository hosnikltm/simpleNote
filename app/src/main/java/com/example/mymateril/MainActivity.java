package com.example.mymateril;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private  Note note;

    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<Note> notes;

    private FloatingActionButton button;
    GridLayoutManager gridLayoutManager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView = findViewById(R.id.recycler);
        notes = new ArrayList<>();
        adapter = new MyAdapter(notes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(gridLayoutManager);

        button = findViewById(R.id.floatingActionButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivityForResult(intent,123);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123  && data != null){
            if (resultCode == RESULT_OK){
                note = new Note();
                note.setTitle(data.getStringExtra("hosni"));
                note.setSubTitle(data.getStringExtra("1234"));
                notes.add(note);
                adapter.notifyDataSetChanged();
            }else {
                Toast.makeText(this,"error",Toast.LENGTH_LONG).show();
            }
        }
    }
}