package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 0
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text("You've had $count glasses.", Modifier.padding(top = 32.dp))
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text("Add one")

        }
    }
}