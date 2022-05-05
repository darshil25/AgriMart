package com.example.agrimart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openNewActivitylgn();
            }
        });
        Button button1=(Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivityContactus();
            }
        });
        Button button3 =(Button) findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewaboutus();
            }
        });
        Button button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewMSP();
            }
        });
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewNAM();
            }
        });

    }

    private void openNewNAM() {
        String url="https://farmer.gov.in/mspstatements.aspx";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void openNewActivitylgn(){
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openNewMSP(){
        String url="https://enam.gov.in/web/";

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
    public void openNewActivityContactus(){
        Intent intent1=new Intent(this,Contectus.class);
        startActivity(intent1);
    }
    public void openNewaboutus(){
        Intent intent2=new Intent(this,AboutusActivity.class);
        startActivity(intent2);
    }
}