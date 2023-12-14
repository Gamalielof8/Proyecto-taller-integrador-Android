package com.example.gicpc_eats_.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gicpc_eats_.MainActivity;
import com.example.gicpc_eats_.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Registro(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}