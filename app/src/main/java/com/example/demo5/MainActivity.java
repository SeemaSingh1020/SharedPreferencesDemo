package com.example.demo5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String TAG = MainActivity.class.getSimpleName();
   String email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SharedPreferences sharedPreferences = getSharedPreferences("MyLoginPref", MODE_PRIVATE);
        email = sharedPreferences.getString("email", "");
        password = sharedPreferences.getString("password", "");
        Toast.makeText(this, "Login successful "+email+""+password, Toast.LENGTH_SHORT).show();


        binding.btnEmail.setOnClickListener(v -> {
                    Log.d(TAG, "ClickListener on btnEmail called");
                }
        );
        binding.btnApple.setOnClickListener(v -> {
                    Log.d(TAG, "ClickListener on btnApple called");
                }
        );
        binding.btnFacebook.setOnClickListener(v -> {
                    Log.d(TAG, "ClickListener on btnFacebook called");
                }
        );
        binding.tvLogin.setOnClickListener(v -> {
                    Log.d(TAG, "ClickListener on tvLogin called");
                }
        );
        Log.d(TAG, "onCreate: onCreated called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: onDestroy called");
    }
}