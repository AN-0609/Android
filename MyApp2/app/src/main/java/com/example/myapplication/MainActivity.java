package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name1,name2,phone;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = (EditText) findViewById(R.id.name1);
        name2 = (EditText) findViewById(R.id.name2);
        phone = (EditText) findViewById(R.id.phone);
        show = (TextView) findViewById(R.id.show);

    }

    public void onclick(View v){
        show.setText(name1.getText().toString()+name2.getText()+"的電話是"+phone.getText());
    }
}