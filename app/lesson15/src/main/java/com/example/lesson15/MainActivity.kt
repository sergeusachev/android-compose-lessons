package com.example.lesson15

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize().safeDrawingPadding()) {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "userList",
                    modifier = Modifier.weight(1f)
                ) {
                    composable("userList") { UserListScreen(
                        onUser1Click = { navController.navigate("user/1") },
                        onUser2Click = { navController.navigate("user/2") }
                    ) }
                    composable(
                        route = "user/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.StringType })
                    ) {
                        val userId = it.arguments?.getString("id")
                        UserScreen(userId)
                    }
                }

                Text(
                    text = "Users",
                    modifier = Modifier.clickable { navController.navigate("userList") }
                )
            }
        }
    }

    companion object {
        const val TAG = "lesson15_debug"
    }
}
