package com.appworld.fitnessuicompose.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
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
import com.appworld.fitnessuicompose.componants.SimpleButton
import com.appworld.fitnessuicompose.componants.SimpleEditText
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class ResetPasswordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUiComposeTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        AppToolBar(
                            size = 22.sdp,
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

                        SimpleTextComponent(text = "Reset your password", fontSize = 26.ssp, color = textTitleColor)

                        SimpleTextComponent(text = "Please enter your email address. You will receive a link to create a new password via email.", fontSize = 12.ssp , paddingHorizontal = 20.sdp, paddingTop = 12.sdp)

                        var email by remember { mutableStateOf("") }
                        SimpleEditText(hint = "Enter Email", paddingTop = 40.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Email,onTextChange = {
                            email = it
                        })

                        SimpleButton(paddingHorizontal = 15.sdp, paddingTop = 20.sdp, text = "Send password reset email") {

                            if (email.isNotEmpty()){

                                Toast.makeText(this@ResetPasswordActivity, "Email :- $email", Toast.LENGTH_SHORT).show()
                            }
                            else{
                                Toast.makeText(this@ResetPasswordActivity, "Enter email to reset", Toast.LENGTH_SHORT).show()
                            }

                        }



                    }
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ResetPasswordPreview() {
    FitnessUiComposeTheme {
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
            ) {

                Column(modifier = Modifier
                    .padding(it)
                    .padding(horizontal = 10.sdp)
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    SimpleTextComponent(text = "Reset your password", fontSize = 26.ssp, color = textTitleColor)

                    SimpleTextComponent(text = "Please enter your email address. You will receive a link to create a new password via email.", fontSize = 12.ssp , paddingHorizontal = 20.sdp, paddingTop = 12.sdp)

                    var email by remember { mutableStateOf("") }
                    SimpleEditText(hint = "Enter Email", paddingTop = 40.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Email,onTextChange = {
                        email = it
                    })

                    SimpleButton(paddingHorizontal = 15.sdp, paddingTop = 20.sdp, text = "Send password reset email") {

                        if (email.isNotEmpty()){


                        }
                        else{

                        }

                    }



                }
            }

        }
    }
}