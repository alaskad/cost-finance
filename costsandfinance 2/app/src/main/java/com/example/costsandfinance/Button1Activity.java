package com.example.costsandfinance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Button1Activity extends AppCompatActivity {
    public static final String key = "key1";
private Button enter;
private EditText text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        enter = findViewById(R.id.enter);
        text1 = findViewById(R.id.text1);

        String str = text1.getText().toString();
        enter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent11 = new Intent (Button1Activity.this,MainActivity.class);

               intent11.putExtra(Button1Activity.key, str);
                startActivity(intent11);

            }
        });

    }
}