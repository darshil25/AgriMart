package com.example.agrimart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                                                Toast.makeText(MainActivity2.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                                            }else
                                                Toast.makeText(MainActivity2.this, "LOGIN FAILED!!", Toast.LENGTH_SHORT).show();
                                        }
                                    }
        );
        Button button22 = (Button) findViewById(R.id.loginbtn);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }
        });
    }
    private void openLoginPage() {
        Intent intent1=new Intent(this,Login.class);
        startActivity(intent1);

    }
}