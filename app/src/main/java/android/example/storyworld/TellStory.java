package android.example.storyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class TellStory extends AppCompatActivity implements TextToSpeech.OnInitListener{
    TextToSpeech textToSpeech;
    ImageView listen;
    TextView txt_view;
    private int count = 0;
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


        textToSpeech= new TextToSpeech(getApplicationContext(), this, "com.google.android.tts");
        Set<String> a=new HashSet<>();
        a.add("male");//here you can give male if you want to select male voice.
        Voice v=new Voice("en-us-x-sfg#male_2-local",new Locale("en","US"),400,200,true,a);
        textToSpeech.setVoice(v);
        textToSpeech.setSpeechRate(0.8f);

        listen = findViewById(R.id.listen);

        listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 0) {
                    listen.setImageDrawable(getDrawable(R.drawable.pause_circle));
                    speak();
                    count++;
                } else{
                    listen.setImageDrawable(getDrawable(R.drawable.play_circle));
                    count = 0;
                    textToSpeech.stop();
                }

            }
        });
    }

    @Override
    public void onInit(int i) {

    }


    private void speak() {
            String words = txt_view.getText().toString();
            textToSpeech.speak(words,TextToSpeech.QUEUE_FLUSH,null,null);

    }
}