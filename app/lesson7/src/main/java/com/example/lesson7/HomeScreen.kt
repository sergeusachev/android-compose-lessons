package com.example.lesson7

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    checked: State<Boolean>,
    text: State<String>,
    onCheckedChange: (Boolean) -> Unit,
    onTextValueChanged: (String) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        CheckBox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyTextField(
            text = text,
            onValueChanged = onTextValueChanged
        )
    }

}

@Composable
fun MyTextField(
    text: State<String>,
    onValueChanged: (String) -> Unit
) {
    OutlinedTextField(
        value = text.value,
        onValueChange = onValueChanged
    )
}

@Composable
fun CheckBox(
    checked: State<Boolean>,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checked.value,
            onCheckedChange = onCheckedChange,
        )
        Text(
            text = "Some checkbox text",
            fontSize = 18.sp,
            modifier = Modifier.clickable {
                onCheckedChange.invoke(!checked.value)
            }
        )
    }
}

/*@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    val checked = remember { mutableStateOf(true) }
    HomeScreen(
        checked = checked,
        onCheckedChange = {}
    )
}*/

