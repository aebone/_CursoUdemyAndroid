package com.mealine.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private EditText etGasolina;
    private EditText etAlcool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();
    }

    private void initializeComponents() {
        this.tvResult = findViewById(R.id.tvResult);
        this.etGasolina = findViewById(R.id.etGasolina);
        this.etAlcool = findViewById(R.id.etAlcool);
    }

    public void onCaculateClick(View view) {
        if (validateFields()) {
            if (Double.parseDouble(this.etAlcool.getText().toString()) /
                    Double.parseDouble(this.etGasolina.getText().toString()) >= 0.7) {
                tvResult.setText("Melhor usar gasolina");
            } else {
                tvResult.setText("Melhor usar alcool");
            }

        } else {
            tvResult.setText("Preencha os campos");
        }
    }

    private boolean validateFields() {
        if (this.etAlcool.getText().toString().equals("") || this.etGasolina.getText().toString().equals(""))
            return false;
        return true;
    }
}
