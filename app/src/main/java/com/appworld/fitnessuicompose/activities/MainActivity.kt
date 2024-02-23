package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.ElevatedCardComponant
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import com.appworld.fitnessuicompose.ui.theme.lightPink
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUiComposeTheme {
                Surface(color = MaterialTheme.colorScheme.background) {

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White))
                    {

                        Box(modifier = Modifier.height(100.sdp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(horizontal = 15.sdp, vertical = 10.sdp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier) {
                                    SimpleTextComponent(
                                        text = "Hello",
                                        fontSize = 18.ssp,
                                        fontFamily = circular_std_medium
                                    )
                                    SimpleTextComponent(
                                        text = "Jhon Smith",
                                        fontSize = 20.ssp,
                                        fontFamily = circular_std_medium,
                                        color = textTitleColor
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    contentAlignment = Alignment.CenterEnd
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(45.sdp)
                                            .clip(shape = CircleShape),
                                        painter = painterResource(id = R.drawable.intro_img),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        alignment = Alignment.CenterEnd
                                    )
                                }
                            }
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(topStart = 33.dp, topEnd = 33.dp))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(lightPink)
                                    .padding(horizontal = 18.sdp, vertical = 20.sdp),
                            ) {

                                SimpleTextComponent(
                                    text = "Let's continue your fitness challenge.",
                                    fontSize = 13.ssp,
                                    fontFamily = circular_std_medium,
                                )

                                ElevatedCardComponant(paddingTop = 10.sdp)
                            }
                        }


                    }


                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainPreview() {
    FitnessUiComposeTheme {
        Surface(color = MaterialTheme.colorScheme.background) {

            Column(modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White))
            {

                Box(modifier = Modifier.height(100.sdp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 15.sdp, vertical = 10.sdp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier) {
                            SimpleTextComponent(
                                text = "Hello",
                                fontSize = 18.ssp,
                                fontFamily = circular_std_medium
                            )
                            SimpleTextComponent(
                                text = "Jhon Smith",
                                fontSize = 20.ssp,
                                fontFamily = circular_std_medium,
                                color = textTitleColor
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.CenterEnd
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(45.sdp)
                                    .clip(shape = CircleShape),
                                painter = painterResource(id = R.drawable.intro_img),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                alignment = Alignment.CenterEnd
                            )
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(topStart = 33.dp, topEnd = 33.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(lightPink)
                            .padding(horizontal = 18.sdp, vertical = 20.sdp),
                    ) {

                        SimpleTextComponent(
                            text = "Let's continue your fitness challenge.",
                            fontSize = 13.ssp,
                            fontFamily = circular_std_medium,
                        )

                        ElevatedCardComponant(paddingTop = 10.sdp)
                    }
                }


            }


        }
    }
}
