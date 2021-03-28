package org.samiulhaq.seekbarandanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void Animation(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        //imageView.animate().alpha(0).setDuration(500);
        //imageView.animate().translationXBy(500).setDuration(500);
        //imageView.animate().translationXBy(-500).setDuration(500);
        //imageView.animate().translationYBy(500).setDuration(500);
        //imageView.animate().translationYBy(-500).setDuration(500);
        //imageView.animate().rotation(180).setDuration(2000);

        //imageView.animate().rotation(180).alpha(0).setDuration(2000);

        //imageView.animate().scaleX(0.5f);
        //imageView.animate().scaleY(0.5f);
        //imageView.animate().scaleX(0.5f).scaleY(0.5f);

        //imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        imageView.animate().rotation(180).scaleX(0.5f).scaleY(0.5f).setDuration(2000);




    }
}