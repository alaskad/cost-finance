package com.example.costsandfinance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private ImageButton button11;
    private ImageButton button22;
    private ImageButton button33;
    private ImageButton button44;
    private ImageButton button55;
    private ImageButton buttonAdd;
    private TextView goods11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goods11 = findViewById(R.id.goods11);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        button11 = findViewById(R.id.goods1);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent5 = new Intent(MainActivity.this, Button1Activity.class);
                startActivity(intent5);

            }
        });

        button22 = findViewById(R.id.transport1);
        button22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, activity_button2.class);
                startActivity(intent1);
            }
        });
        button33 = findViewById(R.id.shops1);
        button33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent(MainActivity.this, activity_button3.class);
                startActivity(intent2);
            }
        });
        button44 = findViewById(R.id.family1);
        button44.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent3 = new Intent(MainActivity.this, activity_button4.class);
                startActivity(intent3);
            }
        });
        button55 = findViewById(R.id.health1);
        button55.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent4 = new Intent(MainActivity.this, activity_button5.class);
                startActivity(intent4);
            }
        });
        buttonAdd = findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });


    }
}