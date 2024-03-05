
package com.example.onboardingcompose.screen

import android.media.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.R
import com.example.onboardingcompose.util.OnBoardingPage

@Preview
@Composable
fun  testUi( ){
    Column(modifier = Modifier.fillMaxWidth()
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.70f),
            contentAlignment = Alignment.Center
        ){
            Image(
                painterResource(id =  R.drawable.first),
                contentDescription = "Pager Image"
            )
        }
        Text(modifier =Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)
            .padding(top=20.dp),
        text="Experience Lorem Ipsum",
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
        Text(modifier =Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)
            .padding(top=20.dp),
            text="Check Sum",
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}