package com.example.lesson6

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableIntStateOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val counter = mutableIntStateOf(0)
        setContent {
            HomeScreen(
                counter = counter,
                onCounterClick = {
                    counter.intValue++
                    Log.d(DEBUG_TAG, "Click! Count: ${counter.intValue}")
                }
            )
        }
    }

    companion object {
        const val DEBUG_TAG = "lesson6_debug"
    }
}
