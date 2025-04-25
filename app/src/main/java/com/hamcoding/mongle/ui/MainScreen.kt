package com.hamcoding.mongle.ui

import androidx.collection.mutableIntSetOf
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hamcoding.mongle.domain.model.Bucket
import com.hamcoding.mongle.ui.icon.MongleIcons
import com.hamcoding.mongle.ui.screens.AchievedScreen
import com.hamcoding.mongle.ui.screens.ListScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var selectedItem by rememberSaveable { mutableIntStateOf(0) }
    val buckets = listOf(
        Bucket(content = "버킷 아이템 1"),
        Bucket(content = "버킷 아이템 2"),
        Bucket(content = "버킷 아이템 3"),
        Bucket(content = "버킷 아이템 4"),
        Bucket(content = "버킷 아이템 5"),
        Bucket(content = "버킷 아이템 6"),
        Bucket(content = "버킷 아이템 7"),
    )

    Scaffold(
        bottomBar = {
            BottomBar(
                onTabSelected = { selectedItem = it },
                selectedItem = selectedItem
            )
        }
    ) { innerPadding ->
        when (selectedItem) {
            0 -> {
                ListScreen(
                    bucketList = buckets,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                )
            }
            1 -> {
                AchievedScreen()
            }
        }
    }
}

@Composable
private fun BottomBar(
    onTabSelected: (Int) -> Unit,
    selectedItem: Int
) {
    val items = listOf("List", "Achieved")
    val icons = listOf(
        MongleIcons.List,
        MongleIcons.Star
    )
    BottomAppBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = icons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { onTabSelected(index) },
            )
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}