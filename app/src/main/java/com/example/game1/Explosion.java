package com.example.game1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {

    Bitmap[] explosion = new Bitmap[12];
    int explosionFrame;
    int ex ,ey;
    public  Explosion(Context context, int ex, int ey){
        explosion[0]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion1);
        explosion[1]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion2);
        explosion[2]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion3);
        explosion[3]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion4);
        explosion[4]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion5);
        explosion[5]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion6);
        explosion[6]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion7);
        explosion[7]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion8);
        explosion[8]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion9);
        explosion[9]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion10);
        explosion[10]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion11);
        explosion[11]= BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion12);
        explosionFrame =0;
        this.ex=ex;
        this.ey=ey;
    }

    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }

}
