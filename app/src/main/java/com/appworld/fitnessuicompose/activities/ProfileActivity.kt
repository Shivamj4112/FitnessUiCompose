package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.AppToolBar
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class ProfileActivity : ComponentActivity() {
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
                            TopBar(
                                size = 22.sdp, onClick = {

                                })
                        }
                    ) {
                        Column(modifier = Modifier
                            .padding(it)) {

                        }

                        
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfilePreview(){

    Scaffold(
        topBar = {
            TopBar(
                size = 22.sdp, onClick = {

                })
        }
    ) {
        Column(modifier = Modifier
            .padding(it)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(modifier = Modifier
                .height(110.sdp)
                .width(110.sdp)
                .clip(shape = CircleShape),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.intro_img),
                contentDescription = null)

            SimpleTextComponent(text = "Jhon Smith", fontSize = 18.ssp, paddingTop = 10.sdp, color = textTitleColor)
            SimpleTextComponent(text = "Member since June 2020", fontSize = 14.ssp, paddingTop = 10.sdp)

            UserDetails(paddingTop = 30.sdp, paddingHorizontal = 20.sdp)

        }


    }
}
