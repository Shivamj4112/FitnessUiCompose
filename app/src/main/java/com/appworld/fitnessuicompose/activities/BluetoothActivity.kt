package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.activities.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.componants.AppToolBar
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.lightGrey
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class BluetoothActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUiComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            AppToolBar(
                                size = 22.sdp, onClick = {

                                })
                        }
                    ){
                        Column(modifier = Modifier
                            .padding(it)) {

                            SimpleTextComponent(text = "Connect your device", fontSize = 18.ssp)

                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BluetoothPreview(){
    Scaffold(
        topBar = {
            AppToolBar(
                size = 22.sdp, onClick = {

                })
        }
    ){
        Column(modifier = Modifier
            .padding(it)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            SimpleTextComponent(text = "Connect your device", fontSize = 25.ssp , color =  Color.Black)
            SimpleTextComponent(text = "Turn on your bluetooth", fontSize = 14.ssp , color =  lightGrey, paddingTop = 10.sdp)

            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){


            }
        }
    }
}
