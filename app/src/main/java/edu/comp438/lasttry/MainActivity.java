package edu.comp438.lasttry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = getResources().getStringArray(R.array.phone_name);
        String[] details = getResources().getStringArray(R.array.phone_details);

        recyclerView = findViewById(R.id.PhoneListView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new Adapter(this,name,details);
        recyclerView.setAdapter(adapter);

    }
}