package com.example.agrimart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutusActivity extends AppCompatActivity {

    private Button buttonOpenURL1;
    private Button buttonOpenURL2;
    private Button buttonOpenURL3;
    private Button buttonOpenURL4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        this.buttonOpenURL1 = (Button) this.findViewById(R.id.button_openURL1);
        this.buttonOpenURL2 = (Button) this.findViewById(R.id.button_openURL2);
        this.buttonOpenURL3 = (Button) this.findViewById(R.id.button_openURL3);
        this.buttonOpenURL4 = (Button) this.findViewById(R.id.button_openURL4);


        this.buttonOpenURL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setButtonOpenURL1();

            }
        });
        this.buttonOpenURL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setButtonOpenURL2();

            }
        });
        this.buttonOpenURL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setButtonOpenURL3();

            }
        });
        this.buttonOpenURL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setButtonOpenURL4();
            }
        });
    }


    public void setButtonOpenURL1( )  {
        String url="https://www.instagram.com/darshil__25/";


        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
    public void setButtonOpenURL2( )  {
        String url="https://www.instagram.com/shyam_sardhara__1112/";


        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
    public void setButtonOpenURL3( )  {
        String url="https://www.instagram.com/kelvin_canon/";


        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
    public void setButtonOpenURL4( )  {
        String url="https://www.instagram.com/smitpatel6602/";


        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
}
