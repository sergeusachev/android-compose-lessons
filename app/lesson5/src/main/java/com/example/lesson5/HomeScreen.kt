package com.example.lesson5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun HomeScreen() {
    Column {
        ColorElips()
        Pictures()
        RemotePicture()
    }

}

@Composable
fun RemotePicture() {
    AsyncImage(
        model = "https://developer.android.com/images/android-go/next-billion-users_856.png",
        contentDescription = "I am an AsyncImage"
    )
}

@Composable
fun Pictures() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentScale = ContentScale.Crop,
            contentDescription = "I am an Image"
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            tint = Color.Yellow,
            contentDescription = "I am an Icon"
        )
    }
}

@Composable
fun ColorElips() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                .border(
                    width = 2.dp,
                    color = Color.DarkGray,
                    shape = CircleShape
                )
                .background(
                    brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Yellow, Color.Green)),
                    shape = CircleShape,
                    alpha = 1.0f
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}