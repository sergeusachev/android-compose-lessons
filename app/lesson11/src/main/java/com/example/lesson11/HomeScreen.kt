package com.example.lesson11

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lesson11.MainActivity.Companion.TAG

@Composable
fun HomeScreen() {
    Log.d(TAG, "HomeScreen")
    val list = remember {
        List(50) { "Item ${it + 1}" }.toMutableStateList()
    }
    LazyColumn(
        modifier = Modifier
            .background(color = Color.DarkGray)
            //.verticalScroll(rememberScrollState())
    ) {
        item {
            TextButton(onClick = {
                Log.d(TAG, "--- append ---")
                list.add(0, "Item ${list.size + 1}")
            }) {
                Text(text = "Append")
            }
        }
        items(list) { item ->
            SomeItem(text = item)
        }
    }
}

@Composable
fun SomeItem(text: String) {
    Log.d(
        TAG,
        "SomeItem $text"
    )
    Text(
        text = text,
        fontSize = 20.sp,
        modifier = Modifier.padding(16.dp)
    )
}