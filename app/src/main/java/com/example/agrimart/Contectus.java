package com.example.agrimart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contectus extends AppCompatActivity {
    private Button buttonSendEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contectus);
        this.buttonSendEmail = (Button) this.findViewById(R.id.button_sendEmail);

        this.buttonSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    public void sendEmail( )  {


        String[] recipients=new String[]{"darshil.thummar2020@vitbhopal.ac.in", "sardhara.shyam2020@vitbhopal.ac.in"};

        String subject="I want Help";

        String content ="I want help with .....";

        Intent intentEmail = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        intentEmail.putExtra(Intent.EXTRA_EMAIL, recipients);
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
        intentEmail.putExtra(Intent.EXTRA_TEXT, content);

        intentEmail.setType("text/plain");

        startActivity(Intent.createChooser(intentEmail, "Choose an email client from..."));
    }
}