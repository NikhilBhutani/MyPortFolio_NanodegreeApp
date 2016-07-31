package com.github.nikhilbhutani.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button popularMovies;
    private Button stockHawk;
    private Button buildItBigger;
    private Button makeYourAppMaterial;
    private Button goUbiquitous;
    private Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initButtons();
        
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies App", Toast.LENGTH_SHORT).show();
            }
        });


        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk App", Toast.LENGTH_SHORT).show();

            }
        });

        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk App", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initButtons() {
        
        popularMovies = (Button)findViewById(R.id.popular_movies);
        stockHawk = (Button)findViewById(R.id.stock_hawk);
        buildItBigger = (Button)findViewById(R.id.build_it_bigger);
        makeYourAppMaterial = (Button)findViewById(R.id.make_app_material);
        goUbiquitous = (Button)findViewById(R.id.go_ubiquitous);
        capstone = (Button)findViewById(R.id.capstone);
        
    }
}
