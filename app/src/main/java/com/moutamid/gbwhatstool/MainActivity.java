package com.moutamid.gbwhatstool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.moutamid.gbwhatstool.databinding.ActivityMainBinding;
import com.moutamid.gbwhatstool.utilis.Constants;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Constants.checkApp(this);

        Constants.calledIniti(this);
        Constants.loadIntersAD(this, this);
        Constants.showBannerAdd(binding.adView);

        binding.directChat.setOnClickListener(v -> {
            startActivity(new Intent(this, DirectChatActivity.class));
        });

        binding.textRepeat.setOnClickListener(v -> {
            startActivity(new Intent(this, TextRepeatActivity.class));
        });

        binding.blank.setOnClickListener(v -> {
            startActivity(new Intent(this, BlankMessageActivity.class));
        });

        binding.qrCodeScanner.setOnClickListener(v -> {
            startActivity(new Intent(this, QRScannerActivity.class));
        });

        binding.qrGener.setOnClickListener(v -> {
            startActivity(new Intent(this, QRGeneratorActivity.class));
        });

        binding.textEmoji.setOnClickListener(v -> {
            startActivity(new Intent(this, TextToEmojiActivity.class));
        });

        binding.statusSaver.setOnClickListener(v -> {
            startActivity(new Intent(this, StatusSaverActivity.class));
        });

    }
}