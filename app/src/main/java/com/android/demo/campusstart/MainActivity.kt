package com.android.demo.campusstart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.android.demo.campusstart.navigation.CampusStartNavigation
import com.android.demo.campusstart.ui.theme.CampusStartTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CampusStartTheme {
                CampusStartNavigation()
            }
        }
    }
}