package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button clickme ;
    String Texthere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickme = (Button)findViewById(R.id.button);
        text = (EditText)findViewById(R.id.text);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Texthere = text.getText().toString();
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                intent.putExtra("Text",Texthere);
                startActivity(intent);
            }
        });
    }
}