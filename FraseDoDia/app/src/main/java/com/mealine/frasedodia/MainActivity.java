package com.mealine.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateSentence(View view) {
        String frases[] =
                {
                "Frase 1 ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... .... .... ... .... ... .... ... .... ...  ... ....  ... .... ",
                "Frase 2 ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... .... ",
                "Frase 3 ... ....  ... ....  ... ....   ... ....  ... ....  ... .... .... ... .... ... .... ...  ... ....  ... .... ",
                "Frase 4 ... ....  ... ....  ... ....  ... ....  ... ....  ... .... .... ... .... ... .... ... .... ... .... ... .... ...  ... ....  ... ....  ... .... ",
                "Frase 5 ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... ....  ... .... ... .... ... ....  "
                };

        TextView text = (TextView) findViewById(R.id.textViewResult);

        int n = new Random().nextInt(frases.length);

        text.setText(frases[n]);
    }
}
