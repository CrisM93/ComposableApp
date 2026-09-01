package com.uami.myfirstcomposableapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.uami.myfirstcomposableapp.Components.MyButtons
import com.uami.myfirstcomposableapp.Components.MyIcon
import com.uami.myfirstcomposableapp.Components.MyImage
import com.uami.myfirstcomposableapp.Components.MyNetworkImage
import com.uami.myfirstcomposableapp.Components.MySwitch
import com.uami.myfirstcomposableapp.Components.MyTextField
import com.uami.myfirstcomposableapp.Components.MyTextFieldParent
import com.uami.myfirstcomposableapp.Components.MyTexts
import com.uami.myfirstcomposableapp.Components.Progress
import com.uami.myfirstcomposableapp.Components.ProgressAdvance
import com.uami.myfirstcomposableapp.Components.ProgressAnimation
import com.uami.myfirstcomposableapp.Components.layout.ConstraintBarrier
import com.uami.myfirstcomposableapp.Components.layout.ConstraintExampleGuide
import com.uami.myfirstcomposableapp.Components.layout.MyBasicConsaintLayout
import com.uami.myfirstcomposableapp.Components.state.MyState
import com.uami.myfirstcomposableapp.ui.theme.MyFirstComposableAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposableAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    //MyBox()
                    //MyColumn(Modifier.padding(innerPadding))
                    //MyRow(Modifier.padding(innerPadding))
                    //MyComplexLayout(Modifier.padding(innerPadding))
                    //MyComplexLayoutTarea(Modifier.padding(innerPadding))
                    //ConstraintExampleGuide(Modifier.padding(innerPadding))
                    //ConstraintExampleGuide(Modifier.padding(innerPadding))
                    //MyBasicConsaintLayout(Modifier.padding(innerPadding))
                    //MyTexts(Modifier.padding(innerPadding))
                    //MyTextFieldParent(Modifier.padding(innerPadding))
                    //MyButtons(Modifier.padding(innerPadding))
                    //MyImage(Modifier.padding(innerPadding))
                    //MyNetworkImage(Modifier.padding(innerPadding))
                    //MyIcon()
                    //ProgressAdvance(Modifier.padding(innerPadding))
                    //ProgressAnimation(Modifier.padding(innerPadding))
                    MySwitch(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposableAppTheme {
        Greeting("Android")
    }
}*/
/*
@Preview(
    widthDp = 20,
    heightDp = 20,
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_3
)
@Composable
fun Example1(){
    Log.d("herp", "")
    Text("CRIS")
}*/