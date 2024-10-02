package com.example.zadanie4widoki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textviewreklama;
    TextView zadanie4;
    Button button1;
    EditText editText;
    String tekst;
    ToggleButton toggleButton;
    Switch aSwitch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        textviewreklama = findViewById(R.id.textView2);
        button1 = findViewById(R.id.button);
        editText = findViewById(R.id.editTextText);
        toggleButton = findViewById(R.id.toggleButton2);
        aSwitch = findViewById(R.id.switch1);
        zadanie4 = findViewById(R.id.textView3);


        //zadanie1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tekst = editText.getText().toString();
                textView.setText(tekst);

            }
        });
        //zadanie 2
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.fot1);


        //zadanie3
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    textviewreklama.setText("Brak pozwolenia na rekalmy");
                }else{
                    textviewreklama.setText("Reklamy włączone");
                }

            }
        });

        //zadanie4

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    zadanie4.setText("Switch nie zaznaczony");
                }else{
                    zadanie4.setText("Switch zaznaczony");
                }
            }
        });

    }
}