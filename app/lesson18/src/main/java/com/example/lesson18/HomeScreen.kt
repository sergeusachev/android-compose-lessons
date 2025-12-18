package com.example.lesson18

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lesson18.MainActivity.Companion.TAG
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(
) {
    Column {
        var sliderPosition by remember { mutableStateOf(1f) }
        Slider(
            value = sliderPosition,
            valueRange = 1f..10f,
            onValueChange = { sliderPosition = it }
        )

        TrackPosition(position = sliderPosition)
    }
}

@Composable
fun TrackPosition(position: Float) {

    val positionState = rememberUpdatedState(newValue = position)

    LaunchedEffect(key1 = Unit) {
        while(true) {
            delay(1000)
            Log.d(TAG, "track position ${positionState.value}")
        }
    }
}

/*@Composable
fun HomeScreen(
) {
    val count by produceState(initialValue = 0) {
        while (true) {
            delay(1000)
            value += 1
        }
    }

    Text(text = "count = $count")
}*/

/*
@Composable
fun HomeScreen() {
    val count by produceState(initialValue = 0) {
        dataProducer.subscribe {
            value = it
        }

        awaitDispose {
            dataProducer.unSubscribe()
        }
    }
    Text(text = "count = $count")
}*/
