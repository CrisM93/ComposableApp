package com.uami.myfirstcomposableapp.Components

import android.widget.Scroller
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.uami.myfirstcomposableapp.R


@Composable
fun MyImage(modifier: Modifier) {
    Column(modifier = modifier) {
        /*     Image(
                 painter = painterResource(R.drawable.ic_card_cuadrante),
                 "avatar image profile",
                 modifier = Modifier
                     .height(100.dp)
                     .width(100.dp),
                 contentScale = ContentScale.Inside
             )
             Image(
                 painter = painterResource(R.drawable.images),
                 "avatar image profile",
                 modifier = Modifier
                     .size(300.dp)
                     .clip(CircleShape),
                 contentScale = ContentScale.Crop
             )

        Image(
            painter = painterResource(R.drawable.images),
            "avatar image profile",
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(50)),//topEnd = 70.dp, bottomStart = 70.dp)
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(R.drawable.images),
            "avatar image profile",
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(50))
                .border(width = 5.dp, color = Color.Red, shape = RoundedCornerShape(50)),
            contentScale = ContentScale.Crop
        )*/
        Image(
            painter = painterResource(R.drawable.images),
            "avatar image profile",
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(50))
                .border(
                    width = 5.dp, shape = CircleShape, brush = Brush.linearGradient(
                        colors = listOf(Color.Red, Color.Blue, Color.Yellow)
                    )
                ),
            contentScale = ContentScale.Crop
        )


    }

}

@Composable
fun MyNetworkImage(modifier: Modifier){
    AsyncImage(model = "https://www.google.com/search?sca_esv=b8c7a0b4c4f85b93&sxsrf=APpeQnsT1HGYZEOJGucql7_sbRlkrxNyCQ:1788232117624&udm=2&fbs=ABfTbFUDadgeu2mn4mYJ8iEZ1GUDd8ABuXxNzQEi57SWOuuPdfVFhgBbO079P_7XyIRUXsGD3WYkjpd1kQvRnhWpFJrtn9-1bAv_-3vuFh7eyZiYDaI9_Y96aGnFqpMkAXavDZWtoo5X2pmqqul3kRjKR64_X79bATkZZdfVzKJpk4LkLTNoxwqG927h9CDCR8dziyHIZ087fxEXioPWDspLCjqaJ0P5hg&q=imagenes&sa=X&ved=2ahUKEwiu8pXhs8yWAxXMyMkDHbAhMKYQtKgLegQIGxAB&biw=984&bih=927&dpr=1#sv=CAMSURoyKhBlLTVIOVR5TnBJcmluQzFNMg41SDlUeU5wSXJpbkMxTToOMHM5QWl3UHVrZllCWE0gBCoXCgFzEhBlLTVIOVR5TnBJcmluQzFNGAEwARgHIMCvhPYPSggQARgBIAEoAQ", contentDescription = "imaefrom net")
}