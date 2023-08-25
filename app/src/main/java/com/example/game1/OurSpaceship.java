package com.example.game1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class OurSpaceship {
    Context context;
    Bitmap ourSpaceship;
    int ox , oy;
    boolean isAlive = true;
    int ourVelocity;
    Random random;

    public OurSpaceship(Context context){
        this.context= context;
        ourSpaceship = BitmapFactory.decodeResource(context.getResources(), R.drawable.fighter);
        random = new Random();
        resetOurSpaceship();
    }

    public Bitmap getOurSpaceship(){
        return ourSpaceship;
    }

    int getOurSpaceshipWidth(){
        return ourSpaceship.getWidth();
    }

    private void resetOurSpaceship() {
        ox= random.nextInt(game1.screenWidth);
        oy= game1.screenHeight - ourSpaceship.getHeight();
        ourVelocity= 10+random.nextInt(6);
    }


}
