package ru.rgordeev.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validatePassword(View view) {


        Log.i("Info", "password validation");

        TextView password = findViewById(R.id.userPassword);
        String pass = password.getText().toString();

        if (isPasswordStrong(pass)) {
            Log.i("Info", "Our password is strong");
        }

    }

    public void validateUserName(View view) {

        Log.i("Info", "Component TextView was pressed");
    }

    private boolean isPasswordStrong(String password) {
        String[] numbers = "0;1;2;3;4;5;6;7;8;9".split(";");
        String[] letters = "a;b;c;d;e;f;g;h;i;j;k;l;m;n;o;p;q;r;s;t;u;v;w;x;y;z".split(";");
        boolean containsNumbers = false;
        boolean containsLetters = false;

        for (String number: numbers) {
            if (password.contains(number)) {
                containsNumbers = true;
                break;
            }
        }

        for (String letter: letters) {
            if (password.contains(letter)) {
                containsLetters = true;
                break;
            }
        }

        return containsLetters && containsNumbers;
    }

    public void showData(View view) {
        TextView userName = findViewById(R.id.userName);
        TextView userPassword = findViewById(R.id.userPassword);

        Toast toast = Toast.makeText(this, String.format("UserName: %s UserPassword: %s",
                userName.getText().toString(), userPassword.getText().toString()),
                Toast.LENGTH_SHORT);
        toast.setMargin(30, 30);
        toast.show();
    }
}
