package com.example.lesson1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .background(color = Color.Gray),
            //.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "Home Screen",
            fontSize = 32.sp,
            color = Color.Cyan,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "1234567890",
            modifier = Modifier
                .align(Alignment.Start)
                .background(color = Color.Green)
                .padding(top = 16.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun RowExample() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Home Screen",
            fontSize = 32.sp,
            color = Color.DarkGray,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(color = Color.Magenta)
        )
        Spacer(
            modifier = Modifier
                .width(width = 8.dp)
                //.weight(1f)
                //.background(color = Color.DarkGray)
        )
        Text(
            text = "1234567890",
            modifier = Modifier
                .background(color = Color.Red)
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun RowExamplePreview() {
    RowExample()
}

@Composable
fun BoxExample() {
    Box {
        Text(
            text = "N",
            fontSize = 48.sp,
            modifier = Modifier
                //.background(color = Color.DarkGray)
        )
        Text(
            text = "ame",
            modifier = Modifier
                //.background(color = Color.Gray)
                .align(alignment = Alignment.BottomCenter)
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun BoxExamplePreview() {
    BoxExample()
}

@Composable
fun CombinationExample() {
    Row(verticalAlignment = CenterVertically) {
        Box {
            Text("N", fontSize = 48.sp)
            Text(
                text ="ame",
                modifier = Modifier
                    .align(BottomCenter)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text("Title")
            Text("Description")
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun CombinationExamplePreview() {
    CombinationExample()
}


