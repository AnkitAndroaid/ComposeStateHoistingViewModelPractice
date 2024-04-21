package com.example.mycomposestatepractice

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class WellnessTask(val id: Int, val label: String, var checked: Boolean = false)
