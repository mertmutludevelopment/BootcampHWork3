package com.example.odev3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odev3.ui.theme.Odev3Theme
import com.example.odev3.ui.theme.buttonText
import com.example.odev3.ui.theme.container
import com.example.odev3.ui.theme.text1
import com.example.odev3.ui.theme.text2
import com.example.odev3.ui.theme.text3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Odev3Theme {
                MainPage()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(){
    val configuration = LocalConfiguration.current
    val ekranYuksekligi = configuration.screenHeightDp
    val ekranGenisligi = configuration.screenWidthDp

    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "STAR WARS") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = container,
                titleContentColor = Color.White
            )
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(text = stringResource(R.string.baslik) ,
                fontSize = (ekranGenisligi/11).sp
                )
            Image(painter = painterResource(id = R.drawable.sw_logo), contentDescription = "")

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = stringResource(R.string.text1),
                    color = text1,
                    fontSize = 18.sp,

                )

                Text(
                    text = stringResource(R.string.text2),
                    color = text2,
                    fontSize = 16.sp,

                )

                Text(
                    text = stringResource(R.string.text3),
                    color = text3,
                    fontSize = 14.sp,

                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),

                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Button(
                    {},
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = container,
                        contentColor = Color.Black
                    )
                )
                {
                    Text(stringResource(R.string.btnText1) ,fontSize = 22.sp)
                }
                Button(
                    {},
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = container,
                        contentColor = buttonText
                    )
                )
                {
                    Text(stringResource(R.string.btnText2), fontSize = 22.sp)
                }
            }
        }
    }



}
@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    Odev3Theme {
        MainPage()
    }
}