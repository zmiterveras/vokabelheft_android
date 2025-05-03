package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddEditPreview() {
    VokabelheftTheme {
        AddEdit(navController = rememberNavController(), 1, emptyList())
    }
}


@Composable
fun AddEdit(navController: NavHostController,
            language: Int,
            word: List<String>,
            modifier: Modifier = Modifier
) {
    Column(modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Translate:")
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = "Form of Verbs:")
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = "Plural:")
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = "Part:")
        TextField(
            value = "test",
            onValueChange = {}
        )
        Row {
            Button(onClick = {}) {
                Text(text = "Add/Edit")
            }
            Button(onClick = {}) {
                Text(text = "Cancel")
            }
        }
    }
}