package com.example.lesson21

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

/*@Composable
fun HomeScreen() {
    Button(onClick = { }) {
        Text(text = "Some text")
    }
}*/

/*@Composable
fun HomeScreen() {
    Column {
        Button(onClick = { }) {
            Text(text = "Some text")
        }
        Text(text = "Some text")
    }
}*/

@Composable
fun HomeScreen() {
    Button(onClick = { }) {
        val textStyle = LocalTextStyle.current
        Text(text = "Some text (${textStyle.fontSize}, ${textStyle.letterSpacing})")
    }
}
