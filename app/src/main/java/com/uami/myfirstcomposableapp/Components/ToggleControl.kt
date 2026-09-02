package com.uami.myfirstcomposableapp.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.uami.myfirstcomposableapp.Components.state.CheckBoxState
import com.uami.myfirstcomposableapp.R

@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by remember { mutableStateOf(true) }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            thumbContent = { /*Text("A")*/Icon(
                painter = painterResource(R.drawable.baseline_person_24),
                contentDescription = ""
            )
            },
            enabled = true,
            colors = SwitchDefaults.colors(
                //bolita
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Cyan,
                //Icono
                checkedIconColor = Color.Green,
                uncheckedIconColor = Color.Cyan,
                disabledUncheckedIconColor = Color.Red,
                disabledCheckedIconColor = Color.Red,
                //Border
                checkedBorderColor = Color.Magenta,
                uncheckedBorderColor = Color.Magenta,
                disabledCheckedBorderColor = Color.Magenta,
                disabledUncheckedBorderColor = Color.Magenta,
                //track
                checkedTrackColor = Color.White,
                uncheckedTrackColor = Color.Black,
                disabledCheckedTrackColor = Color.Yellow,
                disabledUncheckedTrackColor = Color.White
            )
        )
    }
}

@Composable
fun MyCheckBox(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(false) }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { state = !state }) {
            Checkbox(
                checked = state,
                onCheckedChange = { state = it },
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Red,
                    checkmarkColor = Color.Blue,
                    uncheckedColor = Color.Blue,
                    disabledCheckedColor = Color.Yellow,
                    disabledUncheckedColor = Color.Green,
                )
            )
            Spacer(Modifier.width(12.dp))
            Text("Acepto los terminos y condiciones")
        }
    }
}

@Composable
fun ParentCheckBoxes(modifier: Modifier = Modifier) {
    var state by remember {
        mutableStateOf(
            listOf(
                CheckBoxState("terms", "Aceptar"),
                CheckBoxState("newsletter", "Recibir la newsletter", true),
                CheckBoxState("updates", "recibir updates")
            )
        )
    }

    Column(modifier = modifier.fillMaxSize()) {
        state.forEach { myState ->
            CheckBoxWithText(checkBoxState = myState) {
                state = state.map {
                    if (it.id == myState.id) {
                        myState.copy(checked = !myState.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}

@Composable
fun CheckBoxWithText(
    modifier: Modifier = Modifier,
    checkBoxState: CheckBoxState,
    onCheckedChange: (CheckBoxState) -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable { onCheckedChange(checkBoxState) }) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onCheckedChange(checkBoxState) },
            enabled = true
        )
        Spacer(Modifier.width(12.dp))
        Text(checkBoxState.label)
    }
}

@Composable
fun TriStateCheckBox(modifier: Modifier = Modifier) {
    var child1 by remember { mutableStateOf(false) }
    var child2 by remember { mutableStateOf(false) }

    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(child1, onCheckedChange = { child1 = it })
            Text("Ejemplo 1")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(child2, onCheckedChange = { child2 = it })
            Text("Ejemplo 2")
        }
    }

}

@Composable
fun Example(modifier: Modifier = Modifier) {
    var isVisible by remember { mutableStateOf(false) }
    Column(modifier = modifier) {
        Button(
            onClick = {
                isVisible = !isVisible
            }
        ) {
            Text("Mostrar/Ocultar")
        }

        if (isVisible) {
            Text("Hola 👋")
        }
    }
}