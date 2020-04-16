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
        // The demo using activity_main is taken from Android documentation for MotionLayout.
        // See https://developer.android.com/training/constraint-layout/motionlayout/examples#multi-state
        // setContentView(R.layout.activity_main);

        // This other demo is taken from the Reddit thread.
        setContentView(R.layout.activity_second);

    }
}
