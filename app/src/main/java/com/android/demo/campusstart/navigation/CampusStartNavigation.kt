package com.android.demo.campusstart.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.demo.campusstart.ui.screens.HomeScreen
import com.android.demo.campusstart.ui.screens.OnboardingScreen
import com.android.demo.campusstart.ui.screens.SplashScreen
import com.android.demo.campusstart.ui.screens.WelcomeScreen

@Composable
fun CampusStartNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {

        // Splash Screen
        composable("splash") {

            SplashScreen(
                onSplashFinished = {
                    navController.navigate("welcome") {
                        popUpTo("splash") {
                            inclusive = true
                        }
                    }
                }
            )
        }

        // Welcome Screen
        composable("welcome") {

            WelcomeScreen(
                onGetStarted = {
                    navController.navigate("onboarding")
                }
            )
        }

        // Student Onboarding
        composable("onboarding") {

            OnboardingScreen(
                onComplete = {
                    navController.navigate("home") {
                        popUpTo("welcome") {
                            inclusive = true
                        }
                    }
                }
            )
        }

        // Home Dashboard
        composable("home") {

            HomeScreen()
        }
    }
}