package com.uami.myfirstcomposableapp.Components

import android.util.Log
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
    AsyncImage(
        model = "https://i.pinimg.com/736x/85/59/d2/8559d2762630519ffdc78fafeba76e46.jpg", contentDescription = "imaefrom net",
        modifier = modifier.size(250.dp),
        onError = {Log.i("image", "Ha ocurrido un error ${it.result.throwable.message}")})
}