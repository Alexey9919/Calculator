package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button buttonAnswer = findViewById(R.id.buttonAnswer);
        TextView textViewIncorrectAnswer = findViewById(R.id.textViewIncorrectAnswer);
        TextView textViewCorrectAnswer = findViewById(R.id.textViewCorrectAnswer);
        TextView textViewExample = findViewById((R.id.textViewExample));


        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        textViewExample.setText(a + " + " + b + " = ");



        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editTextAnswer.getText().toString();
                try {
                    int txt = Integer.parseInt(text);

                    if (a + b == txt) {
                        textViewCorrectAnswer.setVisibility(View.VISIBLE);
                        textViewIncorrectAnswer.setVisibility(View.INVISIBLE);
                    } else {
                        textViewCorrectAnswer.setVisibility(View.INVISIBLE);
                        textViewIncorrectAnswer.setVisibility(View.VISIBLE);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}