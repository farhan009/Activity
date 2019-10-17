package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        textView = findViewById(R.id.activity_TextView_id);
        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String value = bundle.getString("tag");
            textView.setText(value);
        }
    }
}
