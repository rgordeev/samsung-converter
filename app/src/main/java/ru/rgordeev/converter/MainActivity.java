package ru.rgordeev.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        TextView out = findViewById(R.id.amountOut);
        EditText input = findViewById(R.id.amount);
        Double amount = Double.valueOf(input.getText().toString().equals("") ? "0" : input.getText().toString());

        String output = String.format("%.2f USD is about %.2f RUR", amount, amount * 62.1673);

        out.setText(output);

    }
}
