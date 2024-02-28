package com.appworld.fitnessuicompose.componants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp


@Composable
fun SettingListComponent(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    titleText: String = "Email",
    bodyText: String = "studiopidea@hotmail.com",
    onClick : () -> Unit,
) {

    Box(modifier = Modifier
        .padding(all = padding)
        .padding(
            start = paddingStart,
            top = paddingTop,
            end = paddingEnd,
            bottom = paddingBottom
        )
        .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
        .fillMaxWidth()
        .wrapContentHeight()
        .background(color = Color.White, shape = RoundedCornerShape(10.sdp))
        .clickable(enabled = true, onClick = onClick)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.sdp, vertical = 15.sdp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

        ) {

            Column(
                modifier = Modifier
            ) {
                SimpleTextComponent(
                    text = titleText,
                    color = textTitleColor,
                    fontSize = 18.ssp,
                    fontFamily = circular_std_medium
                )
                SimpleTextComponent(text = bodyText, fontSize = 12.ssp, paddingTop = 10.sdp
                )

            }

            Image(
                modifier = Modifier
                    .size(15.sdp),
                painter = painterResource(id = R.drawable.ic_right_arrow),
                contentDescription = null,
            )


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SettingPreview() {
    SettingListComponent(){}
}
