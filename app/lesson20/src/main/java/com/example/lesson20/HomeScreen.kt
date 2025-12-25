package com.example.lesson20

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import com.example.lesson20.MainActivity.Companion.TAG

val LocalFontStyle = staticCompositionLocalOf { FontStyle.Normal }

@Composable
fun HomeScreen() {
    Column {
        val italicState = remember { mutableStateOf(false) }
        MyCheckbox("Italic", italicState)

        Log.d(TAG, "HomeScreen ${italicState.value}")

        val fontStyle = if (italicState.value) FontStyle.Italic else FontStyle.Normal
        CompositionLocalProvider(LocalFontStyle provides fontStyle) {
            MyText(text = "Text")
            Test()
        }
    }
}

@Composable
fun MyCheckbox(
    text: String,
    checked: MutableState<Boolean>,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checked.value,
            onCheckedChange = { checked.value = it })
        Text(text = text)
    }
}

@Composable
fun MyText(
    text: String,
) {
    Log.d(TAG, "MyText")
    Text(text = text, fontStyle = LocalFontStyle.current)
}

@Composable
fun Test() {
    Log.d(TAG, "Test")
    Text(text = "Test")
}