package com.example.lesson22

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Text(text = "Top bar")
        },
        bottomBar = {
            Text("Bottom bar")
        },
        floatingActionButton = {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = null
            )
        },
        content = {
            Text("Content ${it}")
        }
    )
}
