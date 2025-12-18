package com.example.lesson19

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.lesson19.MainActivity.Companion.TAG
import kotlin.math.roundToInt

@Composable
fun HomeScreen(
) {
    Column {
        val sliderPosition = remember { mutableStateOf(1f) }
        MySlider(sliderPosition)
        val roundedPosition by remember {
            derivedStateOf {
                sliderPosition.value.roundToInt()
            }
        }
        Text(text = "$roundedPosition")
        Log.d(TAG, "HomeScreen $roundedPosition")
    }
}

@Composable
fun MySlider(sliderPosition: MutableState<Float>) {
    Slider(
        value = sliderPosition.value,
        valueRange = 1f..10f,
        onValueChange = { sliderPosition.value = it }
    )
}

/*@Composable
fun HomeScreen(
) {
    Column {
        var count by remember { mutableStateOf(0) }
        Text(
            text = "count = $count",
            modifier = Modifier.clickable { count++ })

        val countBinary by remember { derivedStateOf { count.toString(2) } }
        Text(text = "countBinary = $countBinary")
    }
}*/

/*
@Composable
fun HomeScreen(
) {
    Column {
        var count by remember { mutableStateOf(0) }
        Text(text = "count = $count", modifier = Modifier.clickable { count++ })
    }
}*/
