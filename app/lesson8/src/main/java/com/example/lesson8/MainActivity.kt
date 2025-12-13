package com.example.lesson8

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
        val counter = mutableIntStateOf(0)
        val checkedState = mutableStateOf(false)
        setContent {
            HomeScreen(
                counter = counter,
                onCounterClick = { counter.intValue++ },
                checkedState = checkedState,
                onCheckedStateChange = { checkedState.value = it }
            )
        }
    }

    companion object {
        const val DEBUG_TAG = "lesson8_debug"
    }
}
