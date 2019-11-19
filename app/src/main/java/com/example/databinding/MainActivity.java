package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainViewBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_view);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_view);
        binding.tvHeading.setText("Welcome to data binding.");
        binding.tvSubHeadingOne.setText("Welcome to this Android Tutorial on DataBinding");
    }
}
