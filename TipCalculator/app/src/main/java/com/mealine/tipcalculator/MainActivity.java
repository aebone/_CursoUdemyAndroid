package com.mealine.tipcalculator;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText tietPrice;
    private TextView tvTip;
    private TextView tvTotal;
    private TextView tvPercent;
    private SeekBar sbPercent;
    private String value;
    private Double tip;
    private Double total;
    private int percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupContent();
        setupValues();
    }

    private void setupContent() {
        this.tietPrice = findViewById(R.id.tietPrice);
        this.tvTip = findViewById(R.id.tvTipValue);
        this.tvTotal = findViewById(R.id.tvTotalValue);
        this.tvPercent = findViewById(R.id.tvPercent);
        this.sbPercent = findViewById(R.id.sbPercent);
    }

    private void setupValues() {
        sbPercent.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                value = tietPrice.getText().toString();
                percent = progress;
                tvPercent.setText(String.valueOf(progress) + "%");

                tip = ((Double.parseDouble(value) * percent) / 100);
                tvTip.setText("$" + String.valueOf(tip));
                total = tip + Double.parseDouble(value);
                tvTotal.setText("$" + String.valueOf(total));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
