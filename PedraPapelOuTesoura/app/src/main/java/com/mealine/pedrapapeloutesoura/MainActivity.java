package com.mealine.pedrapapeloutesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPedra(View view) {
        chooseWinner("pedra");
    }

    public void onClickPapel(View view) {
        chooseWinner("papel");
    }

    public void onClickTesoura(View view) {
        chooseWinner("tesoura");
    }

    public void chooseWinner(String userOption) {
        // Get the app option
        String[] options = {"pedra", "papel", "tesoura"};
        int n = new Random().nextInt(3);
        String appOption = options[n];

        imageViewResult = findViewById(R.id.imageViewResult);
        textViewResult = findViewById(R.id.textViewResult);

        switch (appOption) {
            case "pedra":
                imageViewResult.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageViewResult.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageViewResult.setImageResource(R.drawable.tesoura);
        }

        if ((appOption == "pedra" && userOption == "tesoura") ||
            (appOption == "papel" && userOption == "pedra") ||
            (appOption == "tesoura" && userOption == "papel")) {
            textViewResult.setText("Você perdeu :(");
        } else if ((userOption == "pedra" && appOption == "tesoura") ||
                   (userOption == "papel" && appOption == "pedra") ||
                   (userOption == "tesoura" && appOption == "papel")) {
            textViewResult.setText("Você ganhou :)");
        } else {
            textViewResult.setText("Empatamos!");
        }
    }
}
