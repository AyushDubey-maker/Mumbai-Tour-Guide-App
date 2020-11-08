package com.example.tourguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hanks.htextview.base.HTextView;

import java.util.ArrayList;

import static com.example.tourguide.R.id.textViewFade;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getPlacesToVisit(View view){
        Intent i= new Intent(this,Activity_main2.class);
        startActivity(i);

    }
    public void getPlacesToStay(View view){
        Intent i= new Intent(this,Activity_main3.class);
        startActivity(i);

    }
    public void getPlacesToEat(View view){
        Intent i= new Intent(this,Activity_main4.class);
        startActivity(i);
    }
    public void getMoreInfo(View view){
        Intent i= new Intent(this,Activity_main5.class);
        startActivity(i);
    }
}
