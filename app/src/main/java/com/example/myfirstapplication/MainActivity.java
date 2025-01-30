package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save_user(View v) {
        EditText ed_firstname = findViewById(R.id.first_name);

        Toast.makeText(this, "First Name: " + ed_firstname.getText().toString(), Toast.LENGTH_LONG).show();
    }
}