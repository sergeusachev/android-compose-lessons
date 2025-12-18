package com.example.lesson17

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.lesson17.MainActivity.Companion.TAG
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {
    Column {
        var checked by remember { mutableStateOf(true) }
        Checkbox(checked = checked, onCheckedChange = { checked = it })

        if (checked) {
            val scope = rememberCoroutineScope()
            Text(text = "Click", modifier = Modifier.clickable {
                scope.launch {
                    var count = 0
                    while (true) {
                        Log.d(TAG, "count = ${count++}")
                        delay(1000)
                    }
                }
            })
        }
    }
}