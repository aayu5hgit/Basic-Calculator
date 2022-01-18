package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    ImageView btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    ImageView btn_plus, btn_back, btn_minus, btn_divide, btn_module, btn_multiply, btn_dot, btn_ac, btn_equals;
    TextView inputText, outputText;
    String data;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //STATUS BAR COLOR CODE:
        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            //window.setStatusBarColor(this.getResources().getColor(R.color.white));
            window.setStatusBarColor(Color.TRANSPARENT);
        }

        inputText = findViewById(R.id.inputText);
        outputText = findViewById(R.id.outputText);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_divide = findViewById(R.id.btn_divide);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_dot = findViewById(R.id.btn_dot);
        btn_module = findViewById(R.id.btn_module);
        btn_ac = findViewById(R.id.btn_ac);
        btn_equals = findViewById(R.id.btn_equals);
        btn_back =findViewById(R.id.btn_back);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_0.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_1.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_2.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_3.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_4.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_5.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_6.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_7.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_8.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_9.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"9");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_ac.startAnimation(animation);
                inputText.setText("");
                outputText.setText("");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_dot.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+".");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_plus.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_minus.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data+"-");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_multiply.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data + "*");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_divide.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data + "/");
            }
        });

        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_module.startAnimation(animation);
                data = inputText.getText().toString();
                inputText.setText(data + "%");
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_back.startAnimation(animation);
                data = inputText.getText().toString();
                if(data.length()>0){
                    data = data.substring(0, data.length()-1);
                    inputText.setText(data);
                }
            }
        });
        
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.result);
                mediaPlayer.start();
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);
                btn_equals.startAnimation(animation);

                data =inputText.getText().toString();

                data = data.replaceAll("x", "*");
                data = data.replaceAll("%", "/100");
                data = data.replaceAll("/", "/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult="";

                Scriptable scriptable = rhino.initStandardObjects();
                finalResult = rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();

                if(inputText.length() == 0){
                    Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
                }

                outputText.setText(finalResult);

//                if(finalResult.isEmpty()){
//                    Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
//                    finalResult = "0";
//                }
            }
        });

    }
//    private void startAnimation(){
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
//        btn_equals.startAnimation(animation);
//        btn_dot.startAnimation(animation);
//        btn_module.startAnimation(animation);
//        btn_divide.startAnimation(animation);
//        btn_minus.startAnimation(animation);
//        btn_multiply.startAnimation(animation);
//        btn_plus.startAnimation(animation);
//        btn_ac.startAnimation(animation);
//        btn_0.startAnimation(animation);
//        btn_1.startAnimation(animation);
//        btn_2.startAnimation(animation);
//        btn_3.startAnimation(animation);
//        btn_4.startAnimation(animation);
//        btn_5.startAnimation(animation);
//        btn_6.startAnimation(animation);
//        btn_7.startAnimation(animation);
//        btn_8.startAnimation(animation);
//        btn_9.startAnimation(animation);
//
//
//    }
}