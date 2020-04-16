package com.fullstackoasis.motionlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Demo to fix issue discussed on Reddit, where an image wasn't constrained off-screen.
 * https://www.reddit.com/r/androiddev/comments/g1z01e/motionlayout_constraining_off_the_screen/
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This demo is taken from Android documentation for MotionLayout.
        // setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_second);

    }
}
