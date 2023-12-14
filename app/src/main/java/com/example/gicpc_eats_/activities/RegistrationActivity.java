package com.example.gicpc_eats_.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.gicpc_eats_.MainActivity;
import com.example.gicpc_eats_.R;
import com.example.gicpc_eats_.RegisterRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etnombre, etcontrasena, etcorreo;
    Button btnregistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etnombre=(EditText) findViewById(R.id.usuario);
        etcontrasena=(EditText)findViewById(R.id.Contra_inicio);
        etcorreo=(EditText)findViewById(R.id.correo);

        btnregistrar=(Button) findViewById(R.id.btn_registrar);

        btnregistrar.setOnClickListener(this);

    }

    public void login(View view) {
         startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }
    public void inicio(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }

    @Override
    public void onClick(View view) {
        final String nombre=etnombre.getText().toString();
        final String contrasena=etcontrasena.getText().toString();
        final String correo=etcorreo.getText().toString();
        Response.Listener<String> respoListerner= new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse=new JSONObject(response);
                    boolean success=jsonResponse.getBoolean("success");
                    if(success){
                        Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                        RegistrationActivity.this.startActivity(intent);

                    }else{
                        AlertDialog.Builder builder=new AlertDialog.Builder(RegistrationActivity.this);
                        builder.setMessage("Error Al Registrar")
                                .setNegativeButton("Retry",null)
                                .create().show();

                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        RegisterRequest registerRequest=new RegisterRequest(nombre,contrasena,correo, respoListerner);
        RequestQueue queue= Volley.newRequestQueue(RegistrationActivity.this);
        queue.add(registerRequest);
       //startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));




    }
}