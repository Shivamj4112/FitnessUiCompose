package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import android.widget.Toast
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
                Scaffold(
                    topBar = {
                        TopBar(
                            size = 22.sdp, onClick = {
                                Toast.makeText(this@ProfileActivity, "This Settings", Toast.LENGTH_SHORT).show()
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
                            ) {clickedId ->
                                currentSelectedId = clickedId
                            }

                            ProfileButton(id = "bt_history",selectedId = currentSelectedId, text = "HISTORY", textSize = 12.ssp, textPaddingVertical = 5.sdp   ) {clickedId ->
                                currentSelectedId = clickedId
                            }
                            ProfileButton(
                                id = "bt_stats",
                                selectedId = currentSelectedId,
                                text = "STATS",
                                textSize = 12.ssp,
                                textPaddingVertical = 5.sdp
                            ) {clickedId ->
                                currentSelectedId = clickedId
                            }
                        }

                        val data = listOf(
                            BadgeItem("Best Workout", "27 exercises completed", "10/08/2020", "17:24", R.drawable.ic_exercise),
                            BadgeItem("Workout of the week", "727 exercises completed", "07/08/2020", "12:11", R.drawable.ic_bike),
                            BadgeItem("99 days", "45 exercises completed", "03/08/2020", "07:39", R.drawable.ic_weightlifting),
                            BadgeItem("Best of Yoga", "359 exercises completed", "24/07/2020", "15:02", R.drawable.ic_yoga),
                        )

                        LazyColumn (modifier = Modifier.padding(top = 20.sdp)){
                            items(data) { item ->
                                BadgesLayout(
                                    textTitle = item.title,
                                    textBody = item.body,
                                    textDate = item.date,
                                    textTime = item.time,
                                    image = item.image,
                                    paddingHorizontal = 15.sdp,
                                    paddingBottom = 10.sdp
                                )
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
                BadgeItem("Best Workout", "27 exercises completed", "10/08/2020", "17:24", R.drawable.ic_exercise),
                BadgeItem("Workout of the week", "727 exercises completed", "07/08/2020", "12:11", R.drawable.ic_bike),
                BadgeItem("99 days", "45 exercises completed", "03/08/2020", "07:39", R.drawable.ic_weightlifting),
                BadgeItem("Best of Yoga", "359 exercises completed", "24/07/2020", "15:02", R.drawable.ic_yoga),
            )

            LazyColumn (modifier = Modifier.padding(top = 20.sdp)){
                items(data) { item ->
                    BadgesLayout(
                        textTitle = item.title,
                        textBody = item.body,
                        textDate = item.date,
                        textTime = item.time,
                        image = item.image,
                        paddingHorizontal = 15.sdp,
                        paddingBottom = 10.sdp
                    )
                }
            }
        }


    }
}
