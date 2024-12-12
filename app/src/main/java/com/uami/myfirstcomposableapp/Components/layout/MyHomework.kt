package com.uami.myfirstcomposableapp.Components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyComplexLayoutTarea(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Cyan),
            Alignment.Center

        ) {
            Text("Ejemplo 1")
        }

        Spacer(Modifier.height(20.dp))

        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                Alignment.Center
            ) {
                Text("Ejemplo 2")
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                Alignment.Center
            ) {
                Text("Ejemplo 3")
            }
        }
        Spacer(Modifier.height(20.dp))

        Box(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Magenta),
            Alignment.Center
        ) {
            Text("Ejemplo 4")
        }
    }
}