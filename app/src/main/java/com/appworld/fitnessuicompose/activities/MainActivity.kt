package com.appworld.fitnessuicompose.activities

import android.content.Intent
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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.SimpleButton
import com.appworld.fitnessuicompose.componants.SimpleEditText
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.componants.TextButtonComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
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

                    Column(
                        Modifier
                            .fillMaxSize()
                            .background(
                                color = Color.White
                            )
                    ) {

                        Row(
                            modifier = Modifier
                                .height(80.sdp)
                                .padding(horizontal = 15.sdp)
                                .padding(top = 10.sdp),
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

                                    )
                            }


                        }

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(topStart = 33.dp, topEnd = 33.dp))
                                .background(Color.Red)
                                .padding(horizontal = 18.sdp, vertical = 20.sdp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            SimpleTextComponent(
                                text = "Welcome back",
                                color = MaterialTheme.colorScheme.secondary,
                                fontSize = 25.ssp,
                                fontFamily = circular_std_medium,
                            )

                            SimpleTextComponent(
                                text = "Login to your account",
                                fontSize = 13.ssp,
                                fontFamily = circular_std_medium,
                                paddingTop = 7.sdp,
                                paddingHorizontal = 20.sdp,
                            )

                            var email by remember { mutableStateOf("") }
                            var password by remember { mutableStateOf("") }

                            SimpleEditText(
                                paddingTop = 30.sdp,
                                hint = "Enter Email",
                                keyboardType = KeyboardType.Email,
                                onTextChange = {
                                    email = it
                                })
                            SimpleEditText(
                                paddingTop = 8.sdp,
                                hint = "Enter Password",
                                keyboardType = KeyboardType.Password,
                                onTextChange = {
                                    password = it
                                })

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 7.sdp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                val context = LocalContext.current
                                TextButtonComponent(
                                    text = "Forget Password ?",
                                    fontSize = 13.ssp,
                                    fontFamily = circular_std_medium,
                                ) {
                                    context.startActivity(Intent(context, ResetPasswordActivity::class.java))
                                }
                            }

                            SimpleButton(text = "Login", paddingTop = 25.sdp) {

                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxSize(),
                                horizontalArrangement = Arrangement.Center,

                                verticalAlignment = Alignment.Bottom
                            ) {
                                SimpleTextComponent(
                                    text = "Don't have an account?",
                                    fontSize = 12.ssp,
                                )
                                TextButtonComponent(
                                    text = "Sign up",
                                    color = buttonPink,
                                    fontSize = 12.ssp,
                                    onClick = {
                                    }
                                )
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

            Column(
                Modifier
                    .fillMaxSize()
                    .background(
                        color = Color.White
                    )
            ) {

                Box (modifier = Modifier
                    .height(100.sdp)){
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 15.sdp, vertical = 20.sdp),
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

                                )
                        }


                    }
                }

                Box (modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 33.dp, topEnd = 33.dp))){
                    Column(
                        modifier = Modifier
                            .fillMaxSize()

                            .background(Color.Red)
                            .padding(horizontal = 18.sdp, vertical = 20.sdp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        SimpleTextComponent(
                            text = "Welcome back",
                            color = MaterialTheme.colorScheme.secondary,
                            fontSize = 25.ssp,
                            fontFamily = circular_std_medium,
                        )

                        SimpleTextComponent(
                            text = "Login to your account",
                            fontSize = 13.ssp,
                            fontFamily = circular_std_medium,
                            paddingTop = 7.sdp,
                            paddingHorizontal = 20.sdp,
                        )

                        var email by remember { mutableStateOf("") }
                        var password by remember { mutableStateOf("") }

                        SimpleEditText(
                            paddingTop = 30.sdp,
                            hint = "Enter Email",
                            keyboardType = KeyboardType.Email,
                            onTextChange = {
                                email = it
                            })
                        SimpleEditText(
                            paddingTop = 8.sdp,
                            hint = "Enter Password",
                            keyboardType = KeyboardType.Password,
                            onTextChange = {
                                password = it
                            })

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 7.sdp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            val context = LocalContext.current
                            TextButtonComponent(
                                text = "Forget Password ?",
                                fontSize = 13.ssp,
                                fontFamily = circular_std_medium,
                            ) {
                                context.startActivity(Intent(context, ResetPasswordActivity::class.java))
                            }
                        }

                        SimpleButton(text = "Login", paddingTop = 25.sdp) {

                        }

                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,

                            verticalAlignment = Alignment.Bottom
                        ) {
                            SimpleTextComponent(
                                text = "Don't have an account?",
                                fontSize = 12.ssp,
                            )
                            TextButtonComponent(
                                text = "Sign up",
                                color = buttonPink,
                                fontSize = 12.ssp,
                                onClick = {
                                }
                            )
                        }


                    }
                }


            }



        }
    }
}