package com.example.bai2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] backgrounds = {
            R.drawable.bg1,
            R.drawable.bg2,
            R.drawable.bg3
    };

    private ImageView backgroundImage;
    private Switch switchBackground;
    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundImage = findViewById(R.id.backgroundImage);
        switchBackground = findViewById(R.id.switchBackground);

        // Xử lý sự kiện khi bấm vào Switch
        switchBackground.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                changeBackground();
            }
        });
    }

    private void changeBackground() {
        int randomIndex = random.nextInt(backgrounds.length);
        backgroundImage.setImageResource(backgrounds[randomIndex]);
    }
}
