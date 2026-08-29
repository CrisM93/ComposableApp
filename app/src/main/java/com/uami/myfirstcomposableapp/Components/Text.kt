package com.uami.myfirstcomposableapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier) {
    Column(modifier = modifier) {
        Text("Arantza")
        Text("Arantza", color = Color.Red)
        Text("Arantza", fontSize = 25.sp)
        Text("FontStyle", fontStyle = FontStyle.Italic)
        Text(
            "FontWeight",
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Text("LetterSpacing", letterSpacing = 2.sp)
        Text("TextDecoration", textDecoration = TextDecoration.Underline)
        Text(
            "TextDecoration",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )
        Text(
            "Align, Align, Align, Align, v, v,AlignAlignAlignAlign,Align,Align,AlignAlign,",
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }

}