package com.appworld.fitnessuicompose.componants

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.appworld.fitnessuicompose.R
import com.appworld.fitnessuicompose.ui.theme.buttonPink
import com.appworld.fitnessuicompose.ui.theme.circular_std_medium
import com.appworld.fitnessuicompose.ui.theme.lightGrey
import com.composeuisuite.ohteepee.OhTeePeeInput
import com.composeuisuite.ohteepee.configuration.OhTeePeeCellConfiguration
import com.composeuisuite.ohteepee.configuration.OhTeePeeConfigurations
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppToolBar(
    toolbarTitle: String = "",
    size: Dp = 25.sdp,
    onClick: () -> Unit
) {

    TopAppBar(
        title = {
            SimpleTextComponent(text = toolbarTitle)
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier
                    .padding(start = 5.sdp, top = 3.sdp)
//                    .padding(vertical = 8.sdp)
                    .size(size)
                    .clickable(enabled = true, onClick = onClick),

                )

        },
        modifier = Modifier.height(50.sdp),

        )
}

@Composable
fun TermsAndConditionsText(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    onTermsClick: () -> Unit,
) {

    Row(
        modifier = Modifier
            .padding(all = padding)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical),
    ) {

        val text = buildAnnotatedString {
            append("By clicking Sign up you agree to the following ")
            pushStyle(SpanStyle(color = buttonPink, textDecoration = TextDecoration.Underline))
            append("Terms and Conditions")
            pop()
            append(" without reservation.")
            addStringAnnotation("URL", "terms", 47, 66)
        }

        ClickableText(
            text = text,
            onClick = { offset ->
                text.getStringAnnotations("URL", offset, offset)
                    .firstOrNull()?.let { annotation ->
                        if (annotation.item == "terms") {
                            onTermsClick()
                        }
                    }
            }
        )
    }

}

@Composable
fun OtpTextComponent(
    onTextChange: (String) -> Unit
) {
    var otpValue: String by remember { mutableStateOf("") }

    // this config will be used for each cell
    val defaultCellConfig = OhTeePeeCellConfiguration.withDefaults(
        borderColor = Color.LightGray,
        borderWidth = 1.sdp,
        shape = RoundedCornerShape(10.sdp),
        textStyle = TextStyle(
            color = Color.Black
        ),

        )
    val activeCellConfig = OhTeePeeCellConfiguration.withDefaults(
        borderColor = buttonPink,
        borderWidth = 1.sdp,
        shape = RoundedCornerShape(10.sdp),
        textStyle = TextStyle(
            color = Color.Black
        ),

        )


    OhTeePeeInput(
        value = otpValue,
        onValueChange = { newValue, isValid ->
            otpValue = newValue
            onTextChange(newValue)
        },
        configurations = OhTeePeeConfigurations.withDefaults(
            cellsCount = 6,
            activeCellConfig = activeCellConfig,
            emptyCellConfig = defaultCellConfig,
            cellModifier = Modifier
                .padding(horizontal = 4.sdp)
                .size(35.sdp),
            placeHolder = "-",
//            obscureText = "*"
        ),

        )

}

@Composable
fun ElevatedCardComponant(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
) {
    val listNum = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9",)
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
            .fillMaxWidth()
            .height(45.sdp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 10.dp)
        ) {
            for (i in listNum) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(end = 10.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Surface(
                        shape = CircleShape, shadowElevation = 2.dp,
                    ) {
                        Text(
                            text = i,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                            fontSize = 10.ssp
                        )
                    }
                }
            }

        }


    }
}

@Composable
fun SimpleTextComponent(
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

@Composable
fun TextButtonComponent(
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
    onClick: () -> Unit,
) {
    Text(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(all = padding)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical),

        text = text,
        color = color,
        fontSize = fontSize,
        fontFamily = fontFamily,

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleEditText(
    paddingStart: Dp = 0.sdp,
    paddingTop: Dp = 0.sdp,
    paddingEnd: Dp = 0.sdp,
    paddingBottom: Dp = 0.sdp,
    paddingHorizontal: Dp = 0.sdp,
    paddingVertical: Dp = 0.sdp,
    padding: Dp = 0.sdp,
    hint: String = "",
    onTextChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text
) {

    var isPasswordVisible by remember { mutableStateOf(false) }
    val textState = remember { mutableStateOf("") }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = padding)
            .padding(
                start = paddingStart,
                top = paddingTop,
                end = paddingEnd,
                bottom = paddingBottom
            )
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical),
        shape = RoundedCornerShape(12.sdp),
        colors = TextFieldDefaults.textFieldColors(
            disabledTextColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),

        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyboardType),
        value = textState.value,
        onValueChange = {
            textState.value = it
            onTextChange(it)
        },

        singleLine = true,

        placeholder = {
            SimpleTextComponent(text = hint)
        },
        visualTransformation = if (keyboardType == KeyboardType.Password && !isPasswordVisible) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        trailingIcon = {
            if (keyboardType == KeyboardType.Password) {
                val icon = if (isPasswordVisible) {
                    painterResource(id = R.drawable.ic_hide)
                } else {
                    painterResource(id = R.drawable.ic_visible)
                }
                IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                    Icon(
                        icon,
                        contentDescription = "Toggle Password Visibility",
                        Modifier.size(width = 20.sdp, height = 20.sdp)
                    )
                }
            }
        }
    )


}

@Composable
fun SimpleButton(
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
            .fillMaxWidth()
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
        colors = ButtonDefaults.buttonColors(containerColor = buttonPink)
    )
    {
        SimpleTextComponent(
            text = text,
            color = textColor,
            padding = 5.sdp,
        )
    }
}

@Composable
fun SimpleImageView(src: Int = R.drawable.ic_running, size: Dp = 40.sdp) {

    Image(
        modifier = Modifier.size(size),
        painter = painterResource(id = src),
        contentDescription = null,
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview() {

    Column {
        SimpleTextComponent(text = "Hello")
        SimpleImageView()
//        SimpleEditText()
        SimpleButton() {}
        OtpTextComponent() {}
        ElevatedCardComponant()
    }

}
