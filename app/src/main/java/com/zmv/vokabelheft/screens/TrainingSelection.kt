package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zmv.vokabelheft.composables.DropDownBox

@Composable
fun TrainingSelection(card: Boolean = false) {
    val variants: List<String> = listOf<String>(
        "accidentally",
        "last 40",
        "last 20",
        "seit"
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Choose training mode:")
        DropDownBox(variants)
        Row {
            Button(onClick = {}) {
                Text(text = "choose")
            }
            Button(onClick = {}) {
                Text(text = "cancel")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TrainingSelectionPreview(){
    TrainingSelection()
}