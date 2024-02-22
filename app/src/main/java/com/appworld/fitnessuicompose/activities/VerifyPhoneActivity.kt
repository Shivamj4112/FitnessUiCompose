package com.appworld.fitnessuicompose.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.componants.AppToolBar
import com.appworld.fitnessuicompose.componants.OtpTextComponent
import com.appworld.fitnessuicompose.componants.SimpleButton
import com.appworld.fitnessuicompose.componants.SimpleEditText
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class VerifyPhoneActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUiComposeTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        AppToolBar(
                            size = 30.sdp,
                            onClick = {
                                finish()
                            })
                    }
                ) { it ->
                    Column(modifier = Modifier
                        .padding(it)
                        .padding(horizontal = 10.sdp)
                        .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        SimpleTextComponent(text = "Verify your phone", paddingTop = 15.sdp,fontSize = 26.ssp, color = textTitleColor)
                        SimpleTextComponent(text = "number",fontSize = 26.ssp, color = textTitleColor)
                        SimpleTextComponent(text = "We have sent you an SMS with a code to number +91 94788 16347", fontSize = 12.ssp , paddingHorizontal = 20.sdp, paddingTop = 12.sdp)

                        var otpvalue by remember { mutableStateOf("") }

                        Box (modifier = Modifier
                            .padding(top = 30.sdp)){
                            OtpTextComponent(onTextChange = {
                                otpvalue = it
                            })

                        }

                        SimpleButton(paddingHorizontal = 15.sdp, paddingTop = 40.sdp, text = "Verify") {
                            Toast.makeText(this@VerifyPhoneActivity, "Account Created Successfully", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this@VerifyPhoneActivity,LoginActivity::class.java))
                            finish()
                        }

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun VerifyPhonePreview() {
    FitnessUiComposeTheme {
        // A surface container using the 'background' color from the theme
        Scaffold(
            topBar = {
                AppToolBar(
                    size = 30.sdp,
                    onClick = {
                    })
            }
        ) { it ->
            Column(modifier = Modifier
                .padding(it)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {

                SimpleTextComponent(text = "Verify your phone", paddingTop = 15.sdp,fontSize = 26.ssp, color = textTitleColor)
                SimpleTextComponent(text = "number",fontSize = 26.ssp, color = textTitleColor)

                SimpleTextComponent(text = "We have sent you an SMS with a code to number +91 94788 16347", fontSize = 12.ssp , paddingHorizontal = 20.sdp, paddingTop = 12.sdp)

                var otpvalue by remember { mutableStateOf("") }

                Box (modifier = Modifier
                    .padding(top = 30.sdp)){
                    OtpTextComponent(onTextChange = {
                        otpvalue = it
                    })

                }

                SimpleButton(paddingHorizontal = 15.sdp, paddingTop = 40.sdp, text = "Verify") {
                }

            }
        }
    }
}