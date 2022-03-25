package com.muradaslanov.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.muradaslanov.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        View Binding

        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

   Intent intent = getIntent();

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSentLandmark();

//        binding.cityView.setImageBitmap();

        //   Casting
//   Landmark selectedLandmark =(Landmark) intent.getSerializableExtra("landmark");
   binding.cityText.setText(selectedLandmark.name);
   binding.countryText.setText(selectedLandmark.country);
   binding.cityView.setImageResource(selectedLandmark.image);

    }
}