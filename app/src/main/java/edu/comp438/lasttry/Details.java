package edu.comp438.lasttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Details extends AppCompatActivity {
 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    textView=findViewById(R.id.textView);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String deet = i.getStringExtra("det");

        textView.setText(deet);
        textView.setMovementMethod(new ScrollingMovementMethod());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}