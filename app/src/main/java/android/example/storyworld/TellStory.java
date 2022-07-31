package android.example.storyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TellStory extends AppCompatActivity implements TextToSpeech.OnInitListener{
    TextToSpeech textToSpeech;
    Button listen;
    TextView txt_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_story);

        Intent intent = getIntent();
        // Get Selected Image Id
        int position = intent.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(imageAdapter.images[position]);



        StoryDataAdapter storyDataAdapter = new StoryDataAdapter(this);
        txt_view = findViewById(R.id.txt_view);
        txt_view.setText(storyDataAdapter.stories[position]);

        textToSpeech = new TextToSpeech(this, this);
        listen = findViewById(R.id.listen);

        listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speak();

            }
        });
    }

    @Override
    public void onInit(int i) {

    }


    private void speak() {
        String words = txt_view.getText().toString();
        textToSpeech.speak(words,TextToSpeech.QUEUE_FLUSH,null);



    }
}