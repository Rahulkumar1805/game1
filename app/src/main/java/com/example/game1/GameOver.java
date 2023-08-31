package com.example.game1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {
    TextView tvPoints, highScore;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        int points= getIntent().getExtras().getInt("Points");
        int hs = getIntent().getExtras().getInt("HighScore");
        tvPoints= findViewById(R.id.tvPoints);
        highScore= findViewById(R.id.highScore);
        tvPoints.setText(""+points);
        highScore.setText(" "+hs);

    }
    public  void restart (View v){
        Intent intent = new Intent(GameOver.this, StartUp.class);
        startActivity(intent);
        finish();
    }
    public void exit(View v){
        finish();
    }
}
