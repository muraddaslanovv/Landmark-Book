package com.muradaslanov.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.muradaslanov.landmarkbookjava.databinding.ActivityMainBinding;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmark> landList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data

        landList = new ArrayList<Landmark>();

Landmark eiffel = new Landmark("Eiffel","France", R.drawable.eiffel);
Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
Landmark maiden = new Landmark("Maiden","Azerbaijan",R.drawable.maiden);


        landList.add(eiffel);
        landList.add(pisa);
        landList.add(maiden);

//        Not efficient!
//        Bitmap
//        Bitmap pisaBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.pisa);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdaptor landmarkAdaptor = new LandmarkAdaptor(landList);
        binding.recyclerView.setAdapter(landmarkAdaptor);

    }
}