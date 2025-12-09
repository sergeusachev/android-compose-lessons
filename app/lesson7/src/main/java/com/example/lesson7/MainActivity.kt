package com.example.lesson7

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val checked = mutableStateOf(true)
        val text = mutableStateOf("some text")
        setContent {
            HomeScreen(
                checked = checked,
                text = text,
                onCheckedChange = {
                    //Log.d(DEBUG_TAG, "New checked state: $it")
                    checked.value = it
                },
                onTextValueChanged = {
                    text.value = it
                }
            )
        }
    }

    companion object {
        const val DEBUG_TAG = "lesson6_debug"
    }
}
