package com.hamcoding.dreamcatcher.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hamcoding.dreamcatcher.ui.screens.AchievedScreen
import com.hamcoding.dreamcatcher.ui.screens.ListScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.List.route
    ) {
        composable(route = BottomBarScreen.List.route) {
            ListScreen()
        }
        composable(route = BottomBarScreen.Achieved.route) {
            AchievedScreen()
        }
    }
}