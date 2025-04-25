package com.hamcoding.mongle.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.hamcoding.mongle.domain.model.Bucket

@Composable
fun AchievedItem(bucket: Bucket) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
    ) {
        AsyncImage(
            model = bucket.image,
            contentDescription = "My Achieved Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(400.dp)
        )
        Text(
            text = bucket.content
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "date icon"
            )
            Text(
                text = bucket.achievedDate.toString()
            )
        }
    }
}

@Composable
@Preview
fun AchievedItemPreview() {
    val sample = Bucket(
        content = "성심당 가기",
        achievedDate = "2023.09.12"
    )
    AchievedItem(sample)
}