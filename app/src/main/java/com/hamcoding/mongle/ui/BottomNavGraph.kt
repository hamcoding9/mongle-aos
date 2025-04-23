package com.hamcoding.mongle.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hamcoding.mongle.ui.screens.AchievedScreen
import com.hamcoding.mongle.ui.screens.ListScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.List.route
    ) {
        composable(route = BottomBarScreen.List.route) {
            //ListScreen()
        }
        composable(route = BottomBarScreen.Achieved.route) {
            AchievedScreen()
        }
    }
}