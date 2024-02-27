package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.BadgesLayout
import com.appworld.fitnessuicompose.componants.ProfileButton
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.componants.TopBar
import com.appworld.fitnessuicompose.componants.UserDetails
import com.appworld.fitnessuicompose.model.BadgeItem
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class ProfileActivity : ComponentActivity() {
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
                            TopBar(
                                size = 22.sdp, onClick = {

                                })
                        }
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(it)
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Image(
                                modifier = Modifier
                                    .height(80.sdp)
                                    .width(80.sdp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop,
                                painter = painterResource(id = R.drawable.intro_img),
                                contentDescription = null
                            )

                            SimpleTextComponent(
                                text = "Jhon Smith",
                                fontSize = 18.ssp,
                                paddingTop = 10.sdp,
                                color = textTitleColor
                            )
                            SimpleTextComponent(text = "Member since June 2020", fontSize = 14.ssp)

                            UserDetails(paddingTop = 20.sdp, paddingHorizontal = 15.sdp)

                            var currentSelectedId: String by remember { mutableStateOf("bt_badges") }
                            Row(
                                modifier = Modifier
                                    .padding(horizontal = 15.sdp)
                                    .padding(top = 20.sdp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                ProfileButton(
                                    id = "bt_badges",
                                    selectedId = currentSelectedId,
                                    text = "BADGES",
                                    textSize = 12.ssp,
                                    textPaddingVertical = 5.sdp
                                ) { clickedId ->

                                    currentSelectedId = clickedId
                                }
                                ProfileButton(
                                    id = "bt_history",
                                    selectedId = currentSelectedId,
                                    text = "HISTORY",
                                    textSize = 12.ssp,
                                    textPaddingVertical = 5.sdp
                                ) { clickedId ->
                                    currentSelectedId = clickedId
                                }
                                ProfileButton(
                                    id = "bt_stats",
                                    selectedId = currentSelectedId,
                                    text = "STATS",
                                    textSize = 12.ssp,
                                    textPaddingVertical = 5.sdp
                                ) { clickedId ->
                                    currentSelectedId = clickedId
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
fun ProfilePreview() {

    Scaffold(
        topBar = {
            TopBar(
                size = 22.sdp, onClick = {

                })
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                modifier = Modifier
                    .height(80.sdp)
                    .width(80.sdp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.intro_img),
                contentDescription = null
            )

            SimpleTextComponent(
                text = "Jhon Smith",
                fontSize = 18.ssp,
                paddingTop = 10.sdp,
                color = textTitleColor
            )
            SimpleTextComponent(text = "Member since June 2020", fontSize = 14.ssp)

            UserDetails(paddingTop = 20.sdp, paddingHorizontal = 15.sdp)

            Row(
                modifier = Modifier
                    .padding(horizontal = 15.sdp)
                    .padding(top = 20.sdp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                ProfileButton(
                    id = "bt_badges",
                    text = "BADGES",
                    textSize = 12.ssp,
                    textPaddingVertical = 5.sdp
                ) {



                }

                ProfileButton(id = "bt_history", text = "HISTORY", textSize = 12.ssp, textPaddingVertical = 5.sdp   ) {

                }
                ProfileButton(
                    id = "bt_stats",
                    text = "STATS",
                    textSize = 12.ssp,
                    textPaddingVertical = 5.sdp
                ) {

                }
            }

            val data = listOf(
                BadgeItem("Title 1", "Body 1", "Date 1", "Time 1", R.drawable.ic_exercise),
                BadgeItem("Title 2", "Body 2", "Date 2", "Time 2", R.drawable.ic_bike),
                BadgeItem("Title 3", "Body 3", "Date 3", "Time 3", R.drawable.ic_exercise),
                BadgeItem("Title 4", "Body 4", "Date 4", "Time 4", R.drawable.ic_exercise),
                BadgeItem("Title 5", "Body 5", "Date 5", "Time 5", R.drawable.ic_exercise)
            )

            LazyColumn {
                items(data) { item ->
                    BadgesLayout(
                        textTitle = item.title,
                        textBody = item.body,
                        textDate = item.date,
                        textTime = item.time,
                        image = item.image,
                    )
                }
            }


        }


    }
}
