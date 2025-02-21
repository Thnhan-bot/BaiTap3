package com.example.bai1;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] backgrounds = {
            R.drawable.bg1,
            R.drawable.bg2,
            R.drawable.bg3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView backgroundImage = findViewById(R.id.backgroundImage);
        Random random = new Random();
        int randomIndex = random.nextInt(backgrounds.length);
        backgroundImage.setImageResource(backgrounds[randomIndex]);
    }
}
