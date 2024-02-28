package com.appworld.fitnessuicompose.componants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import com.appworld.fitnessuicompose.ui.theme.lightGrey
import com.appworld.fitnessuicompose.ui.theme.lightPink
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
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
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SimpleTextComponent(text = "178 cm", color = Color.White, fontSize = 14.ssp)
                    SimpleTextComponent(text = "Height", color = lightPink, fontSize = 11.ssp)
                }
                Divider(
                    color = lightPink,
                    modifier = Modifier
                        .height(30.sdp)  //fill the max height
                        .width(1.dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SimpleTextComponent(text = "24", color = Color.White, fontSize = 14.ssp)
                    SimpleTextComponent(text = "Year old", color = lightPink, fontSize = 11.ssp)
                }
                Divider(
                    color = lightPink,
                    modifier = Modifier
                        .height(30.sdp)  //fill the max height
                        .width(1.dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SimpleTextComponent(text = "78 kg", color = Color.White, fontSize = 14.ssp)
                    SimpleTextComponent(text = "Weight", color = lightPink, fontSize = 11.ssp)
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
                    .padding(end = 10.sdp, top = 10.sdp)
                    .size(size)
                    .clickable(enabled = true, onClick = onClick),

                )

        },
        modifier = Modifier.height(60.sdp),

        )
}

@Composable
fun ProfileButton(
    id: String,
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    text: String = "",
    textPaddingVertical: Dp = 3.sdp,
    textSize: TextUnit = 14.ssp,
    textColor: Color = Color.White,
    selectedId: String = "bt_badges",
    onClick: (String) -> Unit,
) {
    Button(
        modifier = Modifier
            .wrapContentSize()
            .padding(all = padding)
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            ),
        shape = RoundedCornerShape(10.sdp),
        onClick = { onClick(id) },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (selectedId == id) buttonPink else lightPink
        ),
    ) {
        SimpleTextComponent(
            text = text,
            color = if (selectedId == id) Color.White else buttonPink,
            fontSize = textSize,
            paddingVertical = textPaddingVertical,
        )
    }
}

@Composable
fun BadgesLayout(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    textTitle: String = "Text Title",
    textBody: String = "Text Body",
    textDate: String = "Text Date",
    textTime: String = "Text Time",
    image: Int = R.drawable.ic_exercise,
    onClick: () -> Unit,
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = padding)
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .height(90.sdp)
            .background(color = lightPink, shape = RoundedCornerShape(50f))
            .clickable(enabled = true, onClick = onClick),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Image(
            modifier = Modifier
                .padding(start = 20.sdp)
                .size(50.sdp),

            painter = painterResource(id = image),
            contentDescription = null
        )
        Column(modifier = Modifier
            .padding(start = 20.sdp)
            .padding(vertical = 15.sdp)
            .fillMaxSize()) {

            SimpleTextComponent(text = textTitle, color = textTitleColor, fontSize = 15.ssp)
            SimpleTextComponent(text = textBody, color = lightGrey  , fontSize = 10.ssp)

            Row (modifier = Modifier
                .padding(top = 15.sdp)){
                SimpleTextComponent(text = textDate, color = lightGrey, fontSize = 12.ssp)
                SimpleTextComponent(text = textTime, color = lightGrey  , fontSize = 12.ssp, paddingStart = 10.sdp)
            }

        }

    }

}

@Composable
fun HistoryLayout(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    textTitle: String = "Text Title",
    textBody: String = "Text Body",
    textDate: String = "12",
    textMonth: String = "AUG",
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = padding)
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .height(70.sdp)
            .background(color = lightPink, shape = RoundedCornerShape(50f))
            .clickable(enabled = true, onClick = onClick),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Column(
            modifier = Modifier
                .padding(start = 20.sdp)
                .size(40.sdp)
                .background(color = buttonPink, shape = RoundedCornerShape(5.sdp)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
        ){
            SimpleTextComponent(text = textDate, color = Color.White, fontSize = 15.ssp)
            SimpleTextComponent(text = textMonth, color = Color.White, fontSize = 8.ssp)
        }
        Column(modifier = Modifier
            .padding(start = 20.sdp)
            .padding(vertical = 15.sdp)
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,) {

            SimpleTextComponent(text = textTitle, color = textTitleColor, fontSize = 15.ssp)
            SimpleTextComponent(text = textBody, color = lightGrey  , fontSize = 10.ssp,paddingTop = 5.sdp)
            
        }
    }
}
@Composable
fun StatsButton(
    id: String,
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    text: String = "JAN",
    textPaddingVertical: Dp = 0.sdp,
    textSize: TextUnit = 14.ssp,
    selectedId: String = "JAN",
    onClick: (String) -> Unit,
) {
    Button(
        modifier = Modifier
            .padding(all = padding)
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .wrapContentSize()  ,
        shape = RoundedCornerShape(5.sdp),
        onClick = { onClick(id) },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (selectedId == id) buttonPink else lightPink
        ),
    ) {
        FillWidthTextComponent(
            text = text,
            color = if (selectedId == id) Color.White else buttonPink,
            fontSize = textSize,
            paddingVertical = textPaddingVertical,
        )
    }
}

@Composable
fun FillWidthTextComponent(
    text: String,
    color: Color = lightGrey,
    fontSize: TextUnit = 14.ssp,
    fontFamily: FontFamily = circular_std_medium,
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        modifier = Modifier
            .padding(all = padding)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical),
        textAlign = textAlign,
        text = text,
        color = color,
        fontSize = fontSize,
        fontFamily = fontFamily,
    )
}


@Preview(showSystemUi = true)
@Composable
fun ProfileScreenPreview() {

    Column {
        TopBar() {}
        UserDetails()
        ProfileButton(id = "") {}
        BadgesLayout(){}
        HistoryLayout(paddingTop = 10.sdp){}
        StatsButton(id = "JAN", text = "JAN",textSize = 8.ssp,
            paddingEnd = 10.sdp,){}

    }


}