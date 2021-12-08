package com.example.github.sqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.github.R;

public class AddActivity extends AppCompatActivity {

    EditText title_input, judul_input, review_input;
    Button add_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_input = findViewById(R.id.title_input);
        judul_input = findViewById(R.id.judul_input);
        review_input = findViewById(R.id.review_input);
        add_Button = findViewById(R.id.add_button);
        add_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addReview(title_input.getText().toString().trim(),
                        judul_input.getText().toString().trim(),
                       review_input.getText().toString().trim());
            }
        });
    }
}