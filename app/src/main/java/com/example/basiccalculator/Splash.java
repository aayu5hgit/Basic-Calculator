package com.example.basiccalculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {

    TextView name;
    LottieAnimationView intro;
    Animation fadein;
    Window window;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //STATUS BAR COLOR CODE:
        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.white));
        }
        name = findViewById(R.id.name);
        intro = findViewById(R.id.lottie);

        fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);

        name.startAnimation(fadein);

        name.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        intro.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        //SWITCHING ACTIVITY CODE:
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}