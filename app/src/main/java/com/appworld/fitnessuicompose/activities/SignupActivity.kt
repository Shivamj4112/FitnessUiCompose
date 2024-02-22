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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
import com.appworld.fitnessuicompose.componants.TermsAndConditionsText
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
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

                        SimpleTextComponent(text = "Create an account", fontSize = 27.ssp, color = textTitleColor)

                        var username by remember { mutableStateOf("") }
                        var email by remember { mutableStateOf("") }
                        var phone by remember { mutableStateOf("") }
                        var dob by remember { mutableStateOf("") }
                        var password by remember { mutableStateOf("") }

                        SimpleEditText(hint = "Username", paddingTop = 30.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Text,onTextChange = {
                            username = it
                        })
                        SimpleEditText(hint = "Email", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Email,onTextChange = {
                            email = it
                        })
                        SimpleEditText(hint = "Phone", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Phone,onTextChange = {
                            phone = it
                        })
                        SimpleEditText(hint = "Date of birth (dd/mm/yyyy)", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Number,onTextChange = {
                            dob = it
                        })
                        SimpleEditText(hint = "Password", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Password,onTextChange = {
                            password = it
                        })

                        SimpleButton(paddingHorizontal = 15.sdp, paddingTop = 20.sdp, text = "Sign up") {

                            if (username.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && dob.isNotEmpty() && password.isNotEmpty()){

                                Toast.makeText(this@SignupActivity, "Email :- $email", Toast.LENGTH_SHORT).show()
                                startActivity(Intent(this@SignupActivity,VerifyPhoneActivity::class.java))
                            }
                            else{
                                Toast.makeText(this@SignupActivity, "Enter feilds ", Toast.LENGTH_SHORT).show()
                            }
                        }


                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            TermsAndConditionsText(paddingVertical = 20.sdp, paddingHorizontal = 15.sdp){
                                Toast.makeText(this@SignupActivity, "You click on terms", Toast.LENGTH_SHORT).show()
                            }
                        }




                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true , showBackground = true)
@Composable
fun SignupPreview(){
    FitnessUiComposeTheme {
        // A surface container using the 'background' color from the theme
        Scaffold(
            topBar = {
                AppToolBar(
                    size = 22.sdp,
                    onClick = {
                    })
            }
        ) { it ->

            Column(modifier = Modifier
                .padding(it)
                .padding(horizontal = 10.sdp)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {

                SimpleTextComponent(text = "Create an account", fontSize = 27.ssp, color = textTitleColor)

                var username by remember { mutableStateOf("") }
                var email by remember { mutableStateOf("") }
                var phone by remember { mutableStateOf("") }
                var dob by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                SimpleEditText(hint = "Username", paddingTop = 30.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Text,onTextChange = {
                    username = it
                })
                SimpleEditText(hint = "Email", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Email,onTextChange = {
                    email = it
                })
                SimpleEditText(hint = "Phone", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Phone,onTextChange = {
                    phone = it
                })
                SimpleEditText(hint = "Date of birth (dd/mm/yyyy)", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Number,onTextChange = {
                    dob = it
                })
                SimpleEditText(hint = "Password", paddingTop = 10.sdp, paddingHorizontal = 15.sdp, keyboardType = KeyboardType.Password,onTextChange = {
                    password = it
                })

                SimpleButton(paddingHorizontal = 15.sdp, paddingTop = 20.sdp, text = "Sign up") {

                    if (username.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && dob.isNotEmpty() && password.isNotEmpty()){

//                        Toast.makeText(this@ResetPasswordActivity, "Email :- $email", Toast.LENGTH_SHORT).show()
                    }
                    else{
//                        Toast.makeText(this@ResetPasswordActivity, "Enter email to reset", Toast.LENGTH_SHORT).show()
                    }

                }

                Box (modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center){

                    TermsAndConditionsText(paddingVertical = 20.sdp, paddingHorizontal = 15.sdp){
                    }
                }



            }
        }
    }
}
