package com.example.lesson16

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.lesson16.MainActivity.Companion.TAG

@Composable
fun HomeScreen() {
    Column {
        var checked by remember { mutableStateOf(false) }
        Checkbox(checked = checked, onCheckedChange = { checked = it })
        if (checked) {
            val myObject = remember { MyObject() }
        }
    }
}

@Composable
fun ClickCounter() {
    var count by remember { mutableStateOf(0) }
    Text(
        text = "Count $count",
        modifier = Modifier.clickable { count++ }
    )
}

class MyObject : RememberObserver {

    init {
        Log.d(TAG, "init")
    }

    override fun onRemembered() {
        Log.d(TAG, "onRemembered")
    }

    override fun onForgotten() {
        Log.d(TAG, "onForgotten")
    }

    override fun onAbandoned() {
        Log.d(TAG, "onAbandoned")
    }

}