package com.example.lesson12

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class HomeScreenUiState(
    val count: Int = 0,
    val enabled: Boolean = false
)

class HomeViewModel : ViewModel() {

    private val _uiState = mutableStateOf(HomeScreenUiState())
    val uiState: State<HomeScreenUiState> = _uiState

    fun onCounterClick() {
        _uiState.update {
            it.copy(count = it.count + 1)
        }
    }

    fun setEnabled(enabled: Boolean) {
        _uiState.update {
            it.copy(enabled = enabled)
        }
    }

    private fun MutableState<HomeScreenUiState>.update(
        updater: (HomeScreenUiState) -> HomeScreenUiState
    ) {
        this.value = updater(this.value)
    }
}