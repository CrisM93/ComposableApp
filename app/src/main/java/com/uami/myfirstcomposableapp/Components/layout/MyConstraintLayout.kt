package com.uami.myfirstcomposableapp.Components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun MyBasicConsaintLayout(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxCyan, boxBlack, boxGray, boxGreen, boxYellow, boxMagenta, boxRed, boxLightGray, boxBlue) = createRefs()

        Box(
            Modifier
                .size(175.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxMagenta.top)
                    end.linkTo(boxMagenta.end)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    start.linkTo(boxCyan.end)
                    bottom.linkTo(boxCyan.bottom)
                    top.linkTo(boxCyan.top)
                })

        Box(
            Modifier
                .size(175.dp)
                .background(Color.Gray)
                .constrainAs(boxGray) {
                    start.linkTo(boxBlack.end)
                    bottom.linkTo(boxBlack.bottom)
                    top.linkTo(boxBlack.top)
                })

        Box(
            Modifier
                .size(175.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.start)
                    end.linkTo(boxYellow.end)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    end.linkTo(boxYellow.start)
                    bottom.linkTo(boxYellow.top)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    start.linkTo(boxYellow.end)
                    bottom.linkTo(boxYellow.top)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    start.linkTo(boxYellow.end)
                    top.linkTo(boxYellow.bottom)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.LightGray)
                .constrainAs(boxLightGray) {
                    end.linkTo(boxYellow.start)
                    top.linkTo(boxYellow.bottom)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                })
    }

}

@Composable
fun ConstraintExampleGuide(modifier: Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val boxRed = createRef()
        //val topGuide = createGuidelineFromTop(25.dp)
        val topGuide = createGuidelineFromTop(0.1f)
        Box(
            Modifier
                .size(150.dp)
                .background(Red)
                .constrainAs(boxRed)
                {top.linkTo(topGuide)})
    }
}

@Composable
fun ConstraintBarrier(modifier: Modifier){

}