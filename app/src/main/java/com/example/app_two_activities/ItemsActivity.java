package com.example.app_two_activities;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.app_two_activities.dal.ItemsDaMockup;
import com.example.app_two_activities.dal.Movie;

import java.util.List;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemsActivity extends AppCompatActivity {
    private ListView lstItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_items);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lstItems = findViewById(R.id.lstItems);
        ItemsDaMockup da = new ItemsDaMockup();

        List<Movie> movies = da.getAllMovies();
        ArrayAdapter<Movie> adapter  = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, movies );

        lstItems.setAdapter(adapter);

    }
}