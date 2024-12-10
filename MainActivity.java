package com.example.noteapplication; 
import android.widget.ImageView; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
import android.view.animation.Animation; 
import android.view.animation.TranslateAnimation; 
 
 
public class MainActivity extends AppCompatActivity { 
    private ImageView bouncingImage; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        bouncingImage = findViewById(R.id.bouncingImage); 
 
        // Set up the bouncing animation 
        startBouncingAnimation(); 
5 | P a g e  
    } 
    private void startBouncingAnimation() { 
        TranslateAnimation animation = new TranslateAnimation( 
                Animation.RELATIVE_TO_SELF, 0f, 
                Animation.RELATIVE_TO_SELF, 0f, 
                Animation.RELATIVE_TO_SELF, 0f, 
                Animation.RELATIVE_TO_SELF, 2f); 
 
 
        animation.setDuration(1000); 
        animation.setRepeatCount(Animation.INFINITE); 
        animation.setRepeatMode(Animation.REVERSE); 
 
        bouncingImage.startAnimation(animation); 
    } 
}
