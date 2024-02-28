package com.appworld.fitnessuicompose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.appworld.fitnessuicompose.componants.AppToolBar
import com.appworld.fitnessuicompose.componants.SettingListComponent
import com.appworld.fitnessuicompose.model.SettingItem
import com.appworld.fitnessuicompose.ui.theme.FitnessUiComposeTheme
import com.appworld.fitnessuicompose.ui.theme.lightestGrey
import com.appworld.fitnessuicompose.ui.theme.lightestPink
import ir.kaaveh.sdpcompose.sdp

class SettingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUiComposeTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        AppToolBar(
                            toolbarTitle = "Account settings",
                            size = 22.sdp,
                            backgroundColor = lightestPink,
                            onClick = {
                                finish()
                            },
                        )
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = lightestPink)
                            .padding(it)
                            .padding(top = 20.sdp)

                    ) {

                        val settingData = listOf(

                            SettingItem("Email", "studiopidea@hotmail.com"),
                            SettingItem("Phone", "Please add a valid phone number"),
                            SettingItem("Password", "Change password"),
                            SettingItem("Notifications", "Change notification settings"),
                            SettingItem("Deactivate Account", "Reactivate your account anytime")
                        )

                        LazyColumn(modifier = Modifier) {
                            items(settingData) { item ->
                                SettingListComponent(
                                    titleText = item.title,
                                    bodyText = item.body,
                                    paddingHorizontal = 15.sdp,
                                    paddingTop = 10.sdp
                                ) {

                                }
                            }
                        }

                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    FitnessUiComposeTheme {

        Scaffold(
            topBar = {
                AppToolBar(
                    toolbarTitle = "Account settings",
                    size = 22.sdp,
                    backgroundColor = lightestPink,
                    onClick = {

                    },
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = lightestPink)
                    .padding(it)
                    .padding(top = 20.sdp)

            ) {

                val settingData = listOf(

                    SettingItem("Email", "studiopidea@hotmail.com"),
                    SettingItem("Phone", "Please add a valid phone number"),
                    SettingItem("Password", "Change password"),
                    SettingItem("Notifications", "Change notification settings"),
                    SettingItem("Deactivate Account", "Reactivate your account anytime")
                )

                LazyColumn(modifier = Modifier) {
                    items(settingData) { item ->
                        SettingListComponent(
                            titleText = item.title,
                            bodyText = item.body,
                            paddingHorizontal = 15.sdp,
                            paddingTop = 10.sdp
                        ) {

                        }
                    }
                }

            }
        }
    }
}