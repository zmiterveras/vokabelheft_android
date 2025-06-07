package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme
import androidx.compose.ui.unit.dp
import com.zmv.vokabelheft.utils.getDropDownItems
import com.zmv.vokabelheft.composables.DropDownBox
import com.zmv.vokabelheft.R


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
        Text(text = stringResource(R.string.translate))
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = stringResource(R.string.forms))
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = stringResource(R.string.plural))
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = stringResource(R.string.part))
        TextField(
            value = "test",
            onValueChange = {}
        )
        Row {
            Button(onClick = {}) {
                Text(text = stringResource(R.string.add))
            }
            Button(onClick = {}) {
                Text(text = stringResource(R.string.cancel))
            }
        }
    }
}


@Composable
fun EnWord(){
    Column(Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(R.string.word))
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = stringResource(R.string.phonetic))
        DropDownBox(getDropDownItems("phonetic"))
    }
}

@Composable
fun DeWord(){
    Column(Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(R.string.word))
        TextField(
            value = "test",
            onValueChange = {}
        )
        Text(text = stringResource(R.string.note_deutsch),
            fontWeight = FontWeight.Light,
            style = MaterialTheme.typography.bodySmall)
        Text(text = stringResource(R.string.article))
        DropDownBox(getDropDownItems("article"))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddEditPreview() {
    VokabelheftTheme {
        AddEdit(navController = rememberNavController(), 2, emptyList())
    }
}