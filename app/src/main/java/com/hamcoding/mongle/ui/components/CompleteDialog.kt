package com.hamcoding.mongle.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CompleteDialog() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .background(Color.White)
    ) {
        Text("완료하였습니까?")
        Spacer(modifier = Modifier.padding(4.dp))
        BucketItem()
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text("네")
        }
    }
}

@Preview
@Composable
fun CompleteDialogPreview() {
    CompleteDialog()
}