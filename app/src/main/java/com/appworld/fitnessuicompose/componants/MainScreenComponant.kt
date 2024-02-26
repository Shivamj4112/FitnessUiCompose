package com.appworld.fitnessuicompose.componants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import com.appworld.fitnessuicompose.ui.theme.darkPink
import com.appworld.fitnessuicompose.ui.theme.textTitleColor
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Preview(showSystemUi = true)
@Composable
fun PreviewMain() {

    Column {

        SimpleWorkout()
        MaterialWorkout(paddingTop = 20.sdp)
        BluetoothWorkout(paddingTop = 20.sdp){}
        HorizontalMaterial(paddingTop = 20.sdp, paddingEnd = 5.sdp)
    }
}

@Composable
fun SimpleWorkout(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp
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
            .height(118.sdp)
            .fillMaxWidth()
    ) {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(100.sdp),
        ) {

            Box(contentAlignment = Alignment.CenterStart) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.sdp),
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
                    SimpleTextComponent(
                        text = "Today's workout",
                        color = Color.White,
                        fontSize = 18.ssp
                    )
                    SimpleTextComponent(text = "12 Exercises")
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 20.sdp)
                .fillMaxWidth()
                .fillMaxHeight(),
            contentAlignment = Alignment.BottomEnd
        ) {

            SmallButton(text = "START") {

            }

        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BluetoothWorkout(
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
    onClick : () -> Unit
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
                .height(100.sdp),
            onClick = onClick
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = buttonPink)
            ) {

                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.sdp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(2f),
                        verticalArrangement = Arrangement.Center
                    ) {
                        SimpleTextComponent(
                            text = titleText,
                            color = Color.White,
                            fontSize = 16.ssp,
                            fontFamily = circular_std_medium
                        )
                        SimpleTextComponent(text = bodyText, fontSize = 14.ssp)


                    }

                    Image(
                        modifier = Modifier
                            .size(50.sdp),
                        painter = painterResource(id = R.drawable.ic_smart_watch),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White)
                    )


                }
            }
        }
    }
}

@Composable
fun MaterialWorkout(
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
                .height(100.sdp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.sdp),
                    painter = painterResource(id = R.drawable.workout1),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    colorFilter = ColorFilter.colorMatrix(
                        ColorMatrix().apply {
                            setToScale(0.6f, 0.6f, 0.6f, 1f)
                        })
                )

                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.sdp),
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        SimpleTextComponent(
                            text = titleText,
                            color = Color.White,
                            paddingTop = 10.sdp,
                            fontSize = 18.ssp,
                            fontFamily = circular_std_medium
                        )
                        SimpleTextComponent(text = bodyText, fontSize = 14.ssp)

                        DefaultButton(
                            text = "Previous Workout",
                            fontSize = 10.ssp,
                            height = 25.sdp,
                            paddingTop = 15.sdp
                        ) {

                        }
                    }

                    Image(
                        modifier = Modifier
                            .size(15.sdp),
                        painter = painterResource(id = R.drawable.ic_right_arrow),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White)
                    )


                }
            }
        }
    }


}

@Composable
fun HorizontalMaterial(
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

    val state = rememberScrollState()
//    LaunchedEffect(Unit) { state.animateScrollTo(100) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(state)
    ) {
        repeat(2) {


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
//            .horizontalScroll(state)
                    .height(108.sdp)
                    .width(260.sdp)

            ) {
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.sdp),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.sdp),
                            painter = painterResource(id = R.drawable.workout1),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            colorFilter = ColorFilter.colorMatrix(
                                ColorMatrix().apply {
                                    setToScale(0.6f, 0.6f, 0.6f, 1f)
                                })
                        )

                        Row(
                            modifier = Modifier
                                .padding(horizontal = 20.sdp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {
                                SimpleTextComponent(
                                    text = titleText,
                                    color = Color.White,
                                    paddingTop = 10.sdp,
                                    fontSize = 18.ssp,
                                    fontFamily = circular_std_medium
                                )
                                SimpleTextComponent(text = bodyText, fontSize = 14.ssp)

                                DefaultButton(
                                    text = "Previous Workout",
                                    fontSize = 10.ssp,
                                    height = 25.sdp,
                                    paddingTop = 15.sdp
                                ) {

                                }
                            }

                            Image(
                                modifier = Modifier
                                    .size(15.sdp),
                                painter = painterResource(id = R.drawable.ic_right_arrow),
                                contentDescription = null,
                                colorFilter = ColorFilter.tint(Color.White)
                            )


                        }
                    }
                }
            }
        }

    }
}


@Composable
fun SmallButton(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    text: String = "",
    textColor: Color = Color.White,
    onClick: () -> Unit,

    ) {

    Button(
        modifier = Modifier

            .wrapContentWidth()
            .padding(all = padding)
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            ),
        shape = RoundedCornerShape(10.sdp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = buttonPink),
    )
    {
        SimpleTextComponent(
            text = text,
            color = textColor,
            paddingVertical = 3.sdp,
        )
    }
}

@Composable
fun DefaultButton(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    text: String = "",
    textColor: Color = Color.White,
    fontSize: TextUnit = 0.ssp,
    height: Dp = 0.sdp,
    onClick: () -> Unit,


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
            .height(height),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = darkPink),

        )
    {
        SimpleTextComponent(
            text = text,
            color = textColor,
            fontSize = fontSize
        )
    }
}
