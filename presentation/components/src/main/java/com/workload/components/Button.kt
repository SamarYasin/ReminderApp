package com.workload.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FullWidthButton(
    modifier: Modifier,
    buttonText: String,
    onBtnClick: () -> Unit
) {
    Button(
        onClick = {
            onBtnClick.invoke()
        },
        modifier = modifier,
        enabled = true,
        shape = RoundedCornerShape(16.dp),
        elevation = ButtonDefaults.buttonElevation(
            8.dp
        )
    ) {
        TextTitleSmall(
            modifier = Modifier,
            text = buttonText,
            color = Color.White,
            fontSize = 14.sp
        )
    }
}

@Preview(apiLevel = 34)
@Composable
fun PreviewFullWidthButton(modifier: Modifier = Modifier) {
    FullWidthButton(
        modifier = modifier,
        buttonText = "Button",
        onBtnClick = {

        }
    )
}