package com.uami.myfirstcomposableapp.login

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! JUAN",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ExamplePreview() {
    Example("dad")
}

@Composable
fun Example(a: String) {//ya no existen match_parent para todoe el ancho y alto es fillMaxSize, no hay margin
    Text(
        text = "Cris $a", modifier = Modifier
            .background(Color.Red)
            .padding(16.dp)
            .clickable {
                Log.d("Example", "")
            }
    )
}

