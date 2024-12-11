package com.uami.myfirstcomposableapp.Components.layout

import androidx.compose.animation.Animatable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola 1", modifier = Modifier.background(Color.Red)) //linear layout vertical
        Text("Hola 2", modifier = Modifier.background(Color.Blue))
        Text("Hola 3", modifier = Modifier.background(Color.Cyan))
        Text("Hola 4", modifier = Modifier.background(Color.Yellow))
        Text("Hola 1", modifier = Modifier.background(Color.Red)) //linear layout vertical
        Text("Hola 2", modifier = Modifier.background(Color.Blue))
        Text("Hola 3", modifier = Modifier.background(Color.Cyan))
        Text("Hola 4", modifier = Modifier.background(Color.Yellow))
        Text("Hola 1", modifier = Modifier.background(Color.Red)) //linear layout vertical
        Text("Hola 2", modifier = Modifier.background(Color.Blue))
        Text("Hola 3", modifier = Modifier.background(Color.Cyan))
        Text("Hola 4", modifier = Modifier.background(Color.Yellow))
        Text("Hola 4", modifier = Modifier.background(Color.Yellow))
        Text("Hola 1", modifier = Modifier.background(Color.Red)) //linear layout vertical
        Text("Hola 2", modifier = Modifier.background(Color.Blue))
        Text("Hola 3", modifier = Modifier.background(Color.Cyan))
    }

}