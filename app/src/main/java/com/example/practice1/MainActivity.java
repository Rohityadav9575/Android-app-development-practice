package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview1);
        EditText editText = findViewById(R.id.edittextemail);
        String email=editText.getText().toString();
        EditText editText1 = findViewById(R.id.edittextpassword);
        String password=editText1.getText().toString();
        Button b1=findViewById(R.id.button1);
        Button b2=findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Viewing next page ",Toast.LENGTH_LONG).show();
                Intent i= new Intent(v.getContext(),ScrollingActivity.class);
                        startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Signing in",Toast.LENGTH_LONG).show();
            }
        });
    }
}
