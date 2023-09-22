package com.example.demo5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo5.databinding.ActivitySharedPreferencesLoginDemoBinding;

public class SharedPreferencesLoginDemo extends AppCompatActivity {
    ActivitySharedPreferencesLoginDemoBinding binding;
    private String prefName = "MyLoginPref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySharedPreferencesLoginDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SharedPreferences sh = getSharedPreferences(prefName, MODE_PRIVATE);
        binding.btnLogIn.setOnClickListener(v -> {
            if (binding.chkRemember.isChecked()) {
                SharedPreferences.Editor myEdit = sh.edit();
                myEdit.putString("email", binding.edtEmail.getText().toString());
                myEdit.putString("password", binding.edtPassword.getText().toString());
                myEdit.apply();
            }
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}