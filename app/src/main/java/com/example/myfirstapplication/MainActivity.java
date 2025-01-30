package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add java listener to button
        Button bt = findViewById(R.id.button);
//        We create an anonymous object/class from the interface to not have to create a class for each listener
//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//              Toast.makeText(MainActivity.this, "Submit with Java button", Toast.LENGTH_LONG).show());
//            }
//        });

        //        There is also the option of creating a lambda expression - best way for event listening
        bt.setOnClickListener(v -> {
//            Fits multiple lines or one
            Toast.makeText(this, "Submit with Java button", Toast.LENGTH_LONG).show();
        });
    }

    public void save_user(View v) {
        EditText ed_firstname = findViewById(R.id.first_name);

        Toast.makeText(this, "First Name: " + ed_firstname.getText().toString(), Toast.LENGTH_LONG).show();
    }
}