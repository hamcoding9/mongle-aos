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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AchievedItem() {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .size(400.dp)
                .background(color = Color.LightGray)
        )
        Text(
            text = "비싼 레스토랑 가기"
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "date icon"
            )
            Text(
                text = "2024.12.04"
            )
        }
    }
}

@Composable
@Preview
fun AchievedItemPreview() {
    AchievedItem()
}