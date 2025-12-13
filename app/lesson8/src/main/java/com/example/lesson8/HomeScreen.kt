package com.example.lesson8

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    counter: State<Int>,
    onCounterClick: () -> Unit,
    checkedState: State<Boolean>,
    onCheckedStateChange: (Boolean) -> Unit
) {
    val counterValue = counter.value
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(height = 100.dp))
        ClickCounter(
            uppercase = checkedState.value,
            counterValue = counterValue,
            onCounterClick = onCounterClick
        )
        Spacer(modifier = Modifier.height(height = 16.dp))
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = onCheckedStateChange
        )
    }
}

@Composable
fun ClickCounter(
    uppercase: Boolean,
    counterValue: Int,
    onCounterClick: () -> Unit
) {
    val evenOdd = remember(uppercase) { EvenOdd(uppercase) }
    Text(
        text = "Clicks: $counterValue ${evenOdd.check(counterValue)}",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
    Log.d(
        MainActivity.DEBUG_TAG,
        "ClickCounter(counter = $counterValue, uppercase = $uppercase), $evenOdd"
    )
}

@Composable
fun InfoText(text: String) {
    Text(
        text = text,
        fontSize = 24.sp
    )
}

/*class EvenOdd() {
    fun check(value: Int): String {
        return if (value % 2 == 0) "even" else "odd"
    }
}*/

class EvenOdd(private val uppercase: Boolean) {
    fun check(value: Int): String {
        var result = if (value % 2 == 0) "even" else "odd"
        if (uppercase) result = result.uppercase()
        return result
    }

    override fun toString(): String {
        return "EvenOdd(uppercase = $uppercase, hashcode = ${hashCode().toHexString()})"
    }
}