package com.appworld.fitnessuicompose.componants

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import ir.kaaveh.sdpcompose.sdp

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .padding(all = 8.sdp)
            .fillMaxWidth(),

        ) {

        Box(contentAlignment = Alignment.CenterStart) {
            Image(
                modifier = Modifier.fillMaxWidth()
                    .height(90.sdp),
                painter = painterResource(id = R.drawable.workout1),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                colorFilter = ColorFilter.colorMatrix(
                    ColorMatrix().apply {
                        setToScale(0.6f, 0.6f, 0.6f, 1f)
                    })
            )
            Column(
                modifier = Modifier
                    .padding(start = 20.sdp)
            ) {
                SimpleTextComponent(text = "Today's workout", color = Color.White)
                SimpleTextComponent(text = "12 Exercises")
            }

        }

    }

}