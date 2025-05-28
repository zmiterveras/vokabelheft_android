package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme
import com.zmv.vokabelheft.utils.getRandomList

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WordsPreview() {
    VokabelheftTheme {
        Words(navController = rememberNavController())
    }
}

@Composable
fun Words(navController: NavHostController, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        val randomItems: List<List<String>> = getRandomList("String")
        LazyColumn(modifier.fillMaxWidth().fillMaxHeight(0.9f)) {
            items(randomItems) { randomItem ->
                WordCell(randomItem[0], randomItem[1])
                Spacer(modifier.height(10.dp))
            }
        }
        ButtonsRow()
    }
}

@Composable
fun WordCell(textItem: String, translate: String, modifier: Modifier = Modifier) {
    Column(modifier.padding(15.dp)) {
        Text(style = MaterialTheme.typography.bodyLarge,
            text = textItem)
        Spacer(modifier.height(7.dp))
        Text(text = translate,
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis,
            softWrap = false
            )
    }
}

@Composable
fun ButtonsRow() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(onClick = {}) {
            Text(text = "Add")
        }
        Button(onClick = {}) {
            Text(text = "Training")
        }
        Button(onClick = {}) {
            Text(text = "Delete")
        }
    }
}

