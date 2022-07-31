package android.example.storyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridView_ extends AppCompatActivity {

    GridView grid_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        grid_view = findViewById(R.id.grid_view);

        grid_view.setAdapter(new ImageAdapter(this));

        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent next = new Intent(getApplicationContext(), TellStory.class);
                next.putExtra("id", position);
                startActivity(next);
            }
        });

    }
}