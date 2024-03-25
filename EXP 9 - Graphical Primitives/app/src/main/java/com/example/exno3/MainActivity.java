package com.example.exno3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
        //Setting the Bitmap as background for the ImageView
        ImageView i = findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);

        // Set background color
        canvas.drawColor(Color.parseColor("#F3E5F5")); // Light purple

        //Creating the Paint Objects and set their colors & TextSize
        Paint rectanglePaint = new Paint();
        rectanglePaint.setColor(Color.parseColor("#FF98AB")); // Red
        rectanglePaint.setTextSize(50);

        Paint circlePaint = new Paint();
        circlePaint.setColor(Color.parseColor("#80AC55")); // Teal
        circlePaint.setTextSize(50);

        Paint squarePaint = new Paint();
        squarePaint.setColor(Color.parseColor("#CFFC54")); // Orange
        squarePaint.setTextSize(50);

        Paint linePaint = new Paint();
        linePaint.setColor(Color.parseColor("#FF62C5")); // Purple
        linePaint.setTextSize(50);

        //To draw a Rectangle
        canvas.drawText("Rectangle", 420, 150, rectanglePaint);
        canvas.drawRect(400, 200, 650, 700, rectanglePaint);

        //To draw a Circle
        canvas.drawText("Circle", 120, 150, circlePaint);
        canvas.drawCircle(200, 350, 150, circlePaint);

        //To draw a Square
        canvas.drawText("Square", 120, 800, squarePaint);
        canvas.drawRect(50, 850, 350, 1150, squarePaint);

        //To draw a Line
        canvas.drawText("Line", 480, 800, linePaint);
        canvas.drawLine(520, 850, 520, 1150, linePaint);
    }
}
