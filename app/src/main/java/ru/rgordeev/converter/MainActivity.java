package ru.rgordeev.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTextViewClick(View view) {
        TextView textView = findViewById(R.id.myTextView);
        Log.i("Info", "Component TextView was pressed");
    }
}
