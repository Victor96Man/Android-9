package com.example.novenaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button beberBT;
    TextView beberTV;
    ImageView beberIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beberBT = (Button) findViewById(R.id.beberBT);
        beberTV = (TextView) findViewById(R.id.beberTV);
        beberIV = (ImageView) findViewById(R.id.beberIV);

        beberBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beberIV.setImageDrawable(getResources().getDrawable(R.drawable.cervezavacia));
                beberTV.setText(R.string.saciado);
            }
        });
    }
}
