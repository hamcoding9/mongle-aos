package com.hamcoding.mongle.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hamcoding.mongle.domain.model.Bucket
import com.hamcoding.mongle.ui.components.BucketItem
import com.hamcoding.mongle.ui.components.CompleteDialog

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    bucketList: List<Bucket>
) {
    var targetBucket by remember { mutableStateOf<Bucket?>(null) }
    var isDialogShown by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ) {
        item {
            bucketList.forEach { item ->
                BucketItem(item)
            }
        }
    }

    if (isDialogShown) {
        targetBucket?.let { bucket ->
            CompleteDialog(
                bucket = bucket,
                onDismissRequest = { isDialogShown = false }
            )
        }
    }
}

@Preview
@Composable
fun ListScreenPreview() {
    val buckets = listOf(
        Bucket(content = "버킷 아이템 1"),
    )
    ListScreen(bucketList = buckets)
}