package com.emmanuel_rono.composetut.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.emmanuel_rono.composetut.R



@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GoogleButton(){
var clicked by remember { mutableStateOf(false) }
    Surface(
        onClick={clicked=!clicked},
        shape= Shapes.medium,
        border= BorderStroke(width = 1.dp, color = Color.LightGray),
        color=MaterialTheme.colors.surface
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(id = R.drawable.ic_google_logo),
                contentDescription = "Logo for Google",
                tint = Color.Unspecified
            )
            Text("Signup Here")

        }
    }
}
