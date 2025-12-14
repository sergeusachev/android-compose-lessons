package com.example.lesson15

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun UserListScreen(
    onUser1Click: () -> Unit,
    onUser2Click: () -> Unit,
) {
    Column {
        Text(text = "Users screen")
        Text(
            text = "User 1",
            modifier = Modifier.clickable(onClick = onUser1Click)
        )
        Text(
            text = "User 2",
            modifier = Modifier.clickable(onClick = onUser2Click)
        )
    }
}