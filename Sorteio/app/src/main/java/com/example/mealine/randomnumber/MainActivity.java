package com.example.mealine.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private TextView textViewResult;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnJogar = (Button) findViewById(R.id.btnJogar);
        this.textViewResult = (TextView) findViewById(R.id.textViewResult);

        this.btnJogar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                n = new Random().nextInt(11);
                textViewResult.setText("Número sorteado: " + n);
            }
        });
    }
}
