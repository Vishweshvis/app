package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit ;
        Button button ;
        button = findViewById(R.id.button);
        edit = findViewById(R.id.editTextTextPersonName);
        //Selection.setSelection((Spannable) edit,2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Username = edit.getText().toString();

                if (Username.isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter the number", Toast.LENGTH_SHORT).show();

                } else {
                    button.setEnabled(true);
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    i.putExtra("name", Username);
                    startActivity(i);

                }
            }
        });

    }
}