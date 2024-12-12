package com.uami.myfirstcomposableapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.uami.myfirstcomposableapp.Components.layout.ConstraintBarrier
import com.uami.myfirstcomposableapp.Components.layout.ConstraintExampleGuide
import com.uami.myfirstcomposableapp.Components.layout.MyBasicConsaintLayout
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
                    ConstraintBarrier(Modifier.padding(innerPadding))
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