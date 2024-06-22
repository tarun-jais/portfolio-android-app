package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class contact extends AppCompatActivity {
       private EditText nm,ms;
       private Firebase Ref;
       ConstraintLayout bt;
       ImageView instagram,linkd,facebook,twitter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        nm=findViewById(R.id.name);
        ms=findViewById(R.id.chat);
        bt=findViewById(R.id.button);
        instagram=findViewById(R.id.insta);
        linkd=findViewById(R.id.lin);
        facebook=findViewById(R.id.fb);
        twitter=findViewById(R.id.tw);

        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://portfolio-db03a-de");

        // feedback button
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=nm.getText().toString();
                String message=ms.getText().toString();
                Firebase rname=Ref.child("Username");
                rname.setValue(user);

                Firebase feedback=Ref.child("Feedback");
                feedback.setValue(message);

                Toast.makeText(contact.this, "Message Sended", Toast.LENGTH_LONG).show();

            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/tarun-jais");
            }
        });

        linkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/tarun-kumar-666071208/");
            }
        });


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/tarun-jais");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://leetcode.com/u/tarunjais/");
            }
        });


    }



    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}