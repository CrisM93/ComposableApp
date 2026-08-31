package com.uami.myfirstcomposableapp.Components

import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtons(modifier: Modifier) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.i("Cris", "Boton pulsado") },
            enabled = true,
            shape = RoundedCornerShape(40.dp),
            border = BorderStroke(4.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = Color.White,
                disabledContainerColor = Color.Yellow,
                disabledContentColor = Color.Green
            )
        ) {
            Text("pulsame")
        }

        OutlinedButton(
            onClick = { },
            Modifier.padding(24.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.Blue)
        ) {
            Text("Outline")
        }

        TextButton(onClick = {}) {
            Text("TextButton")
        }

        ElevatedButton(onClick = {}) {
            Text("ElevatedButton")
        }

        FilledTonalButton(onClick = {}) { }
        Button(onClick = {}) { }

    }
}