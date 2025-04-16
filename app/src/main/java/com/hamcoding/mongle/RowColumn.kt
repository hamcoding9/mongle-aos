package com.hamcoding.mongle

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hamcoding.mongle.ui.theme.DreamCatcherTheme

@Composable
fun RowColumnDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Hello world!")
        Text("Hello world!")
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun RowColumnDemoPreview() {
    DreamCatcherTheme {
        RowColumnDemo()
    }
}