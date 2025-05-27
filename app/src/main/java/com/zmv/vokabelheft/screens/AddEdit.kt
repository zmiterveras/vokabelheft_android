package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme
import androidx.compose.ui.unit.dp
import com.zmv.vokabelheft.utils.getDropDownItems


@Composable
fun AddEdit(navController: NavHostController,
            language: Int,
            word: List<String>,
            modifier: Modifier = Modifier
) {
    Column(modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        when (language) {
            1 -> EnWord()
            2 -> DeWord()
        }
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


@Composable
fun EnWord(){
    Column(Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Word:")
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = "Phonetic:")
        DropDownBox(getDropDownItems("phonetic"))
    }
}

@Composable
fun DeWord(){
    Column(Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Word:")
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = "Note: Set deutsch keyboard for special letter",
            fontWeight = FontWeight.Light,
            style = MaterialTheme.typography.bodySmall)
        Text(text = "Article:")
        DropDownBox(getDropDownItems("article"))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownBox(dropDownList: List<String>) {
    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf(dropDownList[0]) }

    Column(
        Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            TextField(
                modifier = Modifier.menuAnchor(MenuAnchorType.PrimaryEditable),
                value = selectedItem,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) }
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                dropDownList.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(item) },
                        onClick = {
                            selectedItem = item
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddEditPreview() {
    VokabelheftTheme {
        AddEdit(navController = rememberNavController(), 2, emptyList())
    }
}