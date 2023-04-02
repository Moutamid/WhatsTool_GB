package com.moutamid.gbwhatstool;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.moutamid.gbwhatstool.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {
    ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
        finish();
//        new Handler().postDelayed(() -> {
//            startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
//            finish();
//        }, 5000);

    }
}