package com.example.lesson15

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lesson15.MainActivity.Companion.TAG

@Composable
fun UserScreen(
    id: String?,
    userViewModel: UserViewModel = viewModel()
) {
    Text(text = "User $id")
    Log.d(TAG,"user $id")
    Log.d(TAG,"viewModel ${userViewModel.hashCode().toHexString()}")
    Log.d(TAG,"viewModelStoreOwner ${LocalViewModelStoreOwner.current?.javaClass?.simpleName}")
}