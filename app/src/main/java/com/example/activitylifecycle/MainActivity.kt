package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"OnCreatedCalled.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStartCalled")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestartCalled")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResumeCalled")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPauseCalled")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStopCalled")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroyedCalled")
    }
}
