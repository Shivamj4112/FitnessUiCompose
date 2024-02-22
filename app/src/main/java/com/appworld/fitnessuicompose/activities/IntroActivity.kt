package com.appworld.fitnessuicompose.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.SimpleButton
import com.appworld.fitnessuicompose.componants.SimpleImageView
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.componants.TextButtonComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUiComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .background(MaterialTheme.colorScheme.background),

                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        SimpleImageView(size = 90.sdp)
                        SimpleTextComponent(
                            text = "Shape Your Body",
                            color = MaterialTheme.colorScheme.secondary,
                            fontSize = 25.ssp,
                            fontFamily = circular_std_medium,
                            paddingTop = 20.sdp,
                        )
                        SimpleTextComponent(
                            text = "Boost your knowledge on the blog. Find your fit with wear and gear.",
                            fontSize = 12.ssp,
                            fontFamily = circular_std_medium,
                            paddingTop = 10.sdp,
                            paddingHorizontal = 20.sdp,
                        )

                    }
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 15.sdp)
                            .wrapContentWidth()
                            .wrapContentHeight(Alignment.Bottom)
                            .padding(bottom = 30.sdp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        SimpleButton(text = "Login", paddingBottom = 20.sdp) {

                            startActivity(Intent(this@IntroActivity,LoginActivity::class.java))
                        }

                        Row {
                            SimpleTextComponent(
                                text = "Don't have an account?",
                                fontSize = 12.ssp,
                            )
                            TextButtonComponent(
                                text = "Sign up",
                                color = buttonPink,
                                fontSize = 12.ssp,
                                onClick = {
                                    startActivity(Intent(this@IntroActivity,SignupActivity::class.java))
                                }
                            )
                        }

                    }

                    Image(
                        painter = painterResource(id = R.drawable.intro_img),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        alpha = 0.2f
                    )

                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_YES ,
//    showBackground = true,
//    name = "Dark Mode"
//)
@Composable
fun PreviewComponantsIntro() {
    FitnessUiComposeTheme {
        Surface(modifier = Modifier.fillMaxSize()) {

            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .background(MaterialTheme.colorScheme.background),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                SimpleImageView(size = 90.sdp)
                SimpleTextComponent(
                    text = "Shape Your Body",
                    color = MaterialTheme.colorScheme.secondary,
                    fontSize = 25.ssp,
                    fontFamily = circular_std_medium,
                    paddingTop = 20.sdp,
                )
                SimpleTextComponent(
                    text = "Boost your knowledge on the blog. Find your fit with wear and gear.",
                    fontSize = 13.ssp,
                    fontFamily = circular_std_medium,
                    paddingTop = 10.sdp,
                    paddingHorizontal = 20.sdp,
                )

            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 15.sdp)
                    .wrapContentWidth()
                    .wrapContentHeight(Alignment.Bottom)
                    .padding(bottom = 30.sdp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SimpleButton(text = "Login", paddingBottom = 20.sdp) {}

                Row {
                    SimpleTextComponent(
                        text = "Don't have an account?",
                        fontSize = 12.ssp,
                    )
                    SimpleTextComponent(
                        text = "Sign up",
                        color = buttonPink,
                        fontSize = 12.ssp,

                    )
                }
            }

            Image(
                painter = painterResource(id = R.drawable.intro_img),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.2f
            )

        }
    }
}