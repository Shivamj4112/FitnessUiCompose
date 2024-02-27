package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.AppToolBar
import com.appworld.fitnessuicompose.componants.SimpleButton
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.lightGrey
import com.appworld.fitnessuicompose.ui.theme.lightPink
import com.appworld.fitnessuicompose.ui.theme.mediumPink
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class BluetoothActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
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
                                    finish()
                                })
                        }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(it)
                                    .padding(top = 10.sdp)
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {

                                Column(
                                    modifier = Modifier,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {

                                    SimpleTextComponent(
                                        text = "Connect your device",
                                        fontSize = 25.ssp,
                                        color = Color.Black
                                    )
                                    SimpleTextComponent(
                                        text = "Turn on your bluetooth",
                                        fontSize = 14.ssp,
                                        color = lightGrey,
                                        paddingTop = 5.sdp
                                    )
                                }



                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {

                                    Image(
                                        modifier = Modifier
                                            .height(80.sdp)
                                            .width(80.sdp),
                                        painter = painterResource(id = R.drawable.ic_smart_watch),
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(lightGrey)
                                    )

                                    Box(
                                        modifier = Modifier
                                            .padding(end = 5.sdp)
                                            .width(6.sdp)
                                            .height(6.sdp)
                                            .background(
                                                color = lightPink,
                                                shape = RoundedCornerShape(size = 20.sdp)
                                            )
                                    ) {}

                                    Box(
                                        modifier = Modifier
                                            .padding(end = 10.sdp)
                                            .width(8.sdp)
                                            .height(8.sdp)
                                            .background(
                                                color = mediumPink,
                                                shape = RoundedCornerShape(size = 20.sdp)
                                            )
                                    ) {}

                                    Image(
                                        modifier = Modifier
                                            .height(70.sdp)
                                            .width(70.sdp),
                                        painter = painterResource(id = R.drawable.ic_bluetooth),
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(buttonPink)
                                    )

                                    Box(
                                        modifier = Modifier
                                            .padding(start = 10.sdp)
                                            .width(8.sdp)
                                            .height(8.sdp)
                                            .background(
                                                color = mediumPink,
                                                shape = RoundedCornerShape(size = 20.sdp)
                                            )
                                    ) {}

                                    Box(
                                        modifier = Modifier
                                            .padding(start = 5.sdp)
                                            .width(6.sdp)
                                            .height(6.sdp)
                                            .background(
                                                color = lightPink,
                                                shape = RoundedCornerShape(size = 20.sdp)
                                            )
                                    ) {}

                                    Image(
                                        modifier = Modifier
                                            .height(80.sdp)
                                            .width(80.sdp),
                                        painter = painterResource(id = R.drawable.ic_smartphone),
                                        contentDescription = null,
                                        colorFilter = ColorFilter.tint(lightGrey)
                                    )
                                }



                                Column(
                                    modifier = Modifier
                                        .padding(horizontal = 30.sdp, vertical = 20.sdp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {

                                    SimpleTextComponent(
                                        text = "Single tap to connect your device",
                                        paddingBottom = 30.sdp,
                                    )
                                    SimpleButton(text = "CONNECT") {

                                    }
                                }
                            }


                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BluetoothPreview() {
    Scaffold(
        topBar = {
            AppToolBar(
                size = 22.sdp, onClick = {

                })
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .padding(top = 10.sdp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    SimpleTextComponent(
                        text = "Connect your device",
                        fontSize = 25.ssp,
                        color = Color.Black
                    )
                    SimpleTextComponent(
                        text = "Turn on your bluetooth",
                        fontSize = 14.ssp,
                        color = lightGrey,
                        paddingTop = 5.sdp
                    )
                }



                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        modifier = Modifier
                            .height(80.sdp)
                            .width(80.sdp),
                        painter = painterResource(id = R.drawable.ic_smart_watch),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(lightGrey)
                    )

                    Box(
                        modifier = Modifier
                            .padding(end = 5.sdp)
                            .width(6.sdp)
                            .height(6.sdp)
                            .background(
                                color = lightPink,
                                shape = RoundedCornerShape(size = 20.sdp)
                            )
                    ) {}

                    Box(
                        modifier = Modifier
                            .padding(end = 10.sdp)
                            .width(8.sdp)
                            .height(8.sdp)
                            .background(
                                color = mediumPink,
                                shape = RoundedCornerShape(size = 20.sdp)
                            )
                    ) {}

                    Image(
                        modifier = Modifier
                            .height(70.sdp)
                            .width(70.sdp),
                        painter = painterResource(id = R.drawable.ic_bluetooth),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(buttonPink)
                    )

                    Box(
                        modifier = Modifier
                            .padding(start = 10.sdp)
                            .width(8.sdp)
                            .height(8.sdp)
                            .background(
                                color = mediumPink,
                                shape = RoundedCornerShape(size = 20.sdp)
                            )
                    ) {}

                    Box(
                        modifier = Modifier
                            .padding(start = 5.sdp)
                            .width(6.sdp)
                            .height(6.sdp)
                            .background(
                                color = lightPink,
                                shape = RoundedCornerShape(size = 20.sdp)
                            )
                    ) {}

                    Image(
                        modifier = Modifier
                            .height(80.sdp)
                            .width(80.sdp),
                        painter = painterResource(id = R.drawable.ic_smartphone),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(lightGrey)
                    )
                }



                Column(
                    modifier = Modifier
                        .padding(horizontal = 30.sdp, vertical = 20.sdp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    SimpleTextComponent(
                        text = "Single tap to connect your device",
                        paddingBottom = 30.sdp,
                    )
                    SimpleButton(text = "CONNECT") {

                    }
                }
            }


        }
    }
}
