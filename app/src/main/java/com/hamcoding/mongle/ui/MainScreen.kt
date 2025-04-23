package com.hamcoding.mongle.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hamcoding.mongle.domain.model.Bucket
import com.hamcoding.mongle.ui.screens.ListScreen

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
    ListScreen(buckets)
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}