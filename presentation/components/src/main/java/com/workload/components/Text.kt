package com.workload.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextDisplayLarge(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.displayLarge,
        color = color
    )
}

@Composable
fun TextDisplayMedium(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.displayMedium,
        color = color
    )
}

@Composable
fun TextDisplaySmall(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.displaySmall,
        color = color
    )
}

@Composable
fun TextHeadlineLarge(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.headlineLarge,
        color = color
    )
}

@Composable
fun TextHeadlineMedium(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium,
        color = color
    )
}

@Composable
fun TextHeadlineSmall(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall,
        color = color
    )
}

@Composable
fun TextTitleLarge(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge,
        color = color
    )
}

@Composable
fun TextTitleMedium(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.titleMedium,
        color = color
    )
}

@Composable
fun TextTitleSmall(
    modifier: Modifier,
    text: String = "",
    fontSize: TextUnit = TextUnit.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier,
        style = MaterialTheme.typography.titleSmall,
        color = color
    )
}

@Preview(apiLevel = 34)
@Composable
fun PreviewText(){
    Column {
        TextDisplayLarge(modifier = Modifier, text = "Display Large")
        TextDisplayMedium(modifier = Modifier, text = "Display Medium")
        TextDisplaySmall(modifier = Modifier, text = "Display Small")
        TextHeadlineLarge(modifier = Modifier, text = "Headline Large")
        TextHeadlineMedium(modifier = Modifier, text = "Headline Medium")
        TextHeadlineSmall(modifier = Modifier, text = "Headline Small")
        TextTitleLarge(modifier = Modifier, text = "Title Large")
        TextTitleMedium(modifier = Modifier, text = "Title Medium")
        TextTitleSmall(modifier = Modifier, text = "Title Small")
    }
}