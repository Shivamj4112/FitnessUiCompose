package com.appworld.fitnessuicompose.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.componants.SimpleTextComponent
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import com.appworld.fitnessuicompose.ui.theme.lightGrey
import com.appworld.fitnessuicompose.ui.theme.lightPink
import com.appworld.fitnessuicompose.ui.theme.lightestPink
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserDetails(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    titleText: String = "",
    bodyText: String = "",
    titleFontSize: TextUnit = 0.ssp,
    bodyFontSize: TextUnit = 0.ssp,
) {

    Box(
        modifier = Modifier
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .padding(all = padding)
            .height(108.sdp)
            .fillMaxWidth()
    ) {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.sdp),
        ) {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = buttonPink),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                        SimpleTextComponent(text = "178 cm", color = Color.White , fontSize = 16.ssp)
                        SimpleTextComponent(text = "Height", color = lightPink, fontSize = 13.ssp)
                }
                Divider(
                    color = lightPink,
                    modifier = Modifier
                        .height(30.sdp)  //fill the max height
                        .width(1.dp)
                )
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    SimpleTextComponent(text = "24", color = Color.White , fontSize = 16.ssp)
                    SimpleTextComponent(text = "Year old", color = lightPink, fontSize = 13.ssp)
                }
                Divider(
                    color = lightPink,
                    modifier = Modifier
                        .height(30.sdp)  //fill the max height
                        .width(1.dp)
                )
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    SimpleTextComponent(text = "78 kg", color = Color.White , fontSize = 16.ssp)
                    SimpleTextComponent(text = "Weight", color = lightPink, fontSize = 13.ssp)
                }

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    toolbarTitle: String = "",
    size: Dp = 22.sdp,
    onClick: () -> Unit
) {

    TopAppBar(
        title = {
            SimpleTextComponent(text = toolbarTitle)
        },
        actions = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = "Setting",
                modifier = Modifier
                    .padding(start = 5.sdp, top = 3.sdp)
                    .size(size)
                    .clickable(enabled = true, onClick = onClick),

                )

        },
        modifier = Modifier.height(50.sdp),

        )
}

@Preview(showSystemUi = true)
@Composable
fun ProfileScreenPreview() {

    TopBar(){}
    UserDetails()

}