package com.appworld.fitnessuicompose.activities

import android.content.Intent
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.BadgesLayout
import com.appworld.fitnessuicompose.componants.HistoryLayout
import com.appworld.fitnessuicompose.componants.ProfileButton
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.componants.StatsButton
import com.appworld.fitnessuicompose.componants.TopBar
import com.appworld.fitnessuicompose.componants.UserDetails
import com.appworld.fitnessuicompose.model.BadgeItem
import com.appworld.fitnessuicompose.model.HistoryItem
import com.appworld.fitnessuicompose.model.StatsItem
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
                                startActivity(Intent(this@ProfileActivity,SettingActivity::class.java))
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
                                id = "bt_badges", selectedId = currentSelectedId, text = "BADGES", textSize = 12.ssp, textPaddingVertical = 5.sdp
                            ) {clickedId ->
                                currentSelectedId = clickedId
                            }

                            ProfileButton(id = "bt_history",selectedId = currentSelectedId, text = "HISTORY", textSize = 12.ssp, textPaddingVertical = 5.sdp   ) {clickedId ->
                                currentSelectedId = clickedId
                            }
                            ProfileButton(id = "bt_stats", selectedId = currentSelectedId, text = "STATS", textSize = 12.ssp, textPaddingVertical = 5.sdp) {clickedId ->
                                currentSelectedId = clickedId
                            }
                        }


                        if (currentSelectedId == "bt_badges") {

                            BadgesDataFunction()
                        } else if (currentSelectedId == "bt_history") {
                            HistoryDataFunction()
                        }
                        else{
                            StatsDataFunction()
                        }

                    }
                }
            }
        }
    }

    @Composable
    private fun BadgesDataFunction() {
        val data = listOf(
            BadgeItem(
                "Best Workout",
                "27 exercises completed",
                "10/08/2020",
                "17:24",
                R.drawable.ic_exercise
            ),
            BadgeItem(
                "Workout of the week",
                "727 exercises completed",
                "07/08/2020",
                "12:11",
                R.drawable.ic_bike
            ),
            BadgeItem(
                "99 days",
                "45 exercises completed",
                "03/08/2020",
                "07:39",
                R.drawable.ic_weightlifting
            ),
            BadgeItem(
                "Best of Yoga",
                "359 exercises completed",
                "24/07/2020",
                "15:02",
                R.drawable.ic_yoga
            ),
            BadgeItem(
                "Strength Master",
                "200 exercises completed",
                "14/08/2020",
                "14:20",
                R.drawable.ic_strength
            ),
            BadgeItem(
                "Flexibility Guru",
                "120 exercises completed",
                "13/08/2020",
                "12:15",
                R.drawable.ic_flexibility
            ),
            BadgeItem(
                "Balance Pro",
                "90 exercises completed",
                "12/08/2020",
                "10:10",
                R.drawable.ic_balance
            ),
            BadgeItem(
                "Speed Demon",
                "210 exercises completed",
                "10/08/2020",
                "20:00",
                R.drawable.ic_speed
            ),

            )
        LazyColumn(modifier = Modifier.padding(top = 20.sdp)) {
            items(data) { item ->
                BadgesLayout(
                    textTitle = item.title,
                    textBody = item.body,
                    textDate = item.date,
                    textTime = item.time,
                    image = item.image,
                    paddingHorizontal = 15.sdp,
                    paddingBottom = 10.sdp
                ) {
                    Toast.makeText(
                        this@ProfileActivity,
                        item.title + " Clicked!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    @Composable
    private fun StatsDataFunction() {
        var currentSelectedStats: String by remember { mutableStateOf("JAN") }
        Image(
            modifier = Modifier
                .padding(horizontal = 15.sdp)
                .padding(top = 10.sdp)
                .fillMaxWidth()
                .width(100.sdp),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.img_graph),
            contentDescription = null
        )

        val dataStats = listOf(
            StatsItem("JAN"),
            StatsItem("FEB"),
            StatsItem("MAR"),
            StatsItem("APR"),
            StatsItem("MAY"),
            StatsItem("JUN"),
            StatsItem("JUL"),
            StatsItem("AUG"),
            StatsItem("SEP"),
            StatsItem("OCT"),
            StatsItem("NOV"),
            StatsItem("DEC")
        )

        LazyRow(
            modifier = Modifier
                .padding(top = 20.sdp)
                .padding(horizontal = 15.sdp)
        ) {
            items(dataStats) { item ->
                StatsButton(
                    id = item.stats,
                    text = item.stats,
                    textSize = 10.ssp,
                    paddingEnd = 10.sdp,
                    selectedId = currentSelectedStats
                ) { clickedStats ->
                    currentSelectedStats = clickedStats
                }
            }
        }
    }

    @Composable
    private fun HistoryDataFunction() {

        val dataHistory = listOf(
            HistoryItem("Quads & Deltoids", "27 exercises completed", "12", "AUG"),
            HistoryItem("Chest & Abs", "10 exercises completed", "10", "AUG"),
            HistoryItem("Back & Biceps", "5 exercises completed", "8", "AUG"),
            HistoryItem("Shoulder", "45 exercises completed", "7", "AUG"),
            HistoryItem("Legs", "45 exercises completed", "7", "AUG"),
            HistoryItem("Shoulder", "45 exercises completed", "7", "AUG"),
            HistoryItem("Legs & Glutes", "15 exercises completed", "15", "AUG"),
            HistoryItem("Full Body", "30 exercises completed", "13", "AUG"),
            HistoryItem("Cardio", "20 exercises completed", "11", "AUG"),
            HistoryItem("Arms", "18 exercises completed", "9", "AUG"),
            HistoryItem("Core", "22 exercises completed", "6", "AUG"),

            )
        LazyColumn(modifier = Modifier.padding(top = 20.sdp)) {
            items(dataHistory) { item ->
                HistoryLayout(
                    textTitle = item.title,
                    textBody = item.body,
                    textDate = item.date,
                    textMonth = item.month,
                    paddingHorizontal = 15.sdp,
                    paddingBottom = 10.sdp
                ) {
                    Toast.makeText(
                        this@ProfileActivity,
                        item.title + " Clicked!",
                        Toast.LENGTH_SHORT
                    ).show()
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



        }
    }
}
