package com.workload.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextInputField(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        value = value,
        onValueChange = {
            onValueChange.invoke(it)
        },
        enabled = true,
        singleLine = true,
        maxLines = 1,
        placeholder = {

        },
        label = {

        },
        leadingIcon = {

        },
        trailingIcon = {

        },
        colors = TextFieldDefaults.colors(
            focusedTextColor = MaterialTheme.colorScheme.onPrimary,
            unfocusedTextColor = MaterialTheme.colorScheme.onPrimary,
            focusedContainerColor = MaterialTheme.colorScheme.primary,
            unfocusedContainerColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = MaterialTheme.colorScheme.primary
        )
    )

}

@Preview(apiLevel = 34)
@Composable
fun PreviewTextInputField(modifier: Modifier = Modifier) {
    TextInputField(
        modifier = modifier
            .wrapContentSize(),
        value = "",
        onValueChange = {

        }
    )
}