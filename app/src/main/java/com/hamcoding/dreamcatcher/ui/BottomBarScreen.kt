package com.hamcoding.dreamcatcher.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object List : BottomBarScreen(
        route = "list",
        title = "List",
        icon = Icons.Filled.List
    )

    object Achieved : BottomBarScreen(
        route = "achieved",
        title = "Achieved",
        icon = Icons.Filled.Favorite
    )
}