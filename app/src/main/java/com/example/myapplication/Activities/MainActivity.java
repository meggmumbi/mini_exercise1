package com.example.myapplication.Activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBook(View view) {
        startActivity(new Intent(this, book.class));
    }

    public void onCar(View view) {
        startActivity(new Intent(this,Car.class));
    }

    public void onDress(View view) {
        startActivity(new Intent(this, dress.class));
    }

}
