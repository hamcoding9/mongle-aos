package com.hamcoding.mongle.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hamcoding.mongle.domain.model.Bucket

@Composable
fun BucketItem(bucket: Bucket) {
    var targetBucket by remember { mutableStateOf<Bucket?>(null) }
    var isDialogShown by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .clickable {
                targetBucket = bucket
                isDialogShown = true
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.White),
        ) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Favorite Icon",
                tint = Color.Magenta
            )
        }
        Text(
            modifier = Modifier
                .padding(start = 5.dp),
            text = bucket.content,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }

    if (isDialogShown) {
        targetBucket?.let {
            CompleteDialog(
                bucket = it,
                onDismissRequest = { isDialogShown = false }
            )
        }
    }
}

@Preview
@Composable
fun BucketItemPreview() {
    val sample = Bucket(content = "sample")
    BucketItem(sample)
}