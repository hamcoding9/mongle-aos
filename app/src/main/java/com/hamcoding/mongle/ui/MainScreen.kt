package com.hamcoding.mongle.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hamcoding.mongle.domain.model.Bucket
import com.hamcoding.mongle.ui.screens.ListScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
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
        floatingActionButton = {
            FloatingActionButton(
                onClick = {

                }
            ) {
               Icon(
                   imageVector = Icons.Default.Add,
                   contentDescription = "add bucket"
               )
            }
        },
        bottomBar = {
            BottomBar()
        }
    ) { innerPadding ->
        ListScreen(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            bucketList = buckets
        )
    }
}

@Composable
private fun BottomBar() {
    BottomAppBar {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "list bar"
                )
            },
            label = {
                Text("List")
            }
        )
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "achieved bar"
                )
            },
            label = {
                Text("Achieved")
            }
        )
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}