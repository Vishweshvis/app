package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SyncRequest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView  view ;

        view = findViewById(R.id.textView);
        butt = findViewById(R.id.button2);
        Intent i = getIntent() ;//Intent();
        String Username  = i.getStringExtra("name");
        Toast.makeText(this, "hii"+Username, Toast.LENGTH_SHORT).show();
        int randnum = Random();

        view.setText(""+randnum);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share(Username,randnum);
            }
        });
    }
    public int Random(){
        Random ran = new Random();
        int limit = 1000;
        int randomgenerated = ran.nextInt(100);
        return randomgenerated;
    }


    public void share(String Username ,int randnum){
        String number = String.valueOf(randnum);
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("plain text");
        i.putExtra(Intent.EXTRA_SUBJECT,Username);
        i.putExtra(Intent.EXTRA_TEXT,randnum);
      startActivity(Intent.createChooser(i,"choose"));
    }
}