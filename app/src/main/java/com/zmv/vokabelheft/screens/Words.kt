package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme
import com.zmv.vokabelheft.utils.getRandomList


@Composable
fun Words(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        val randomItems = getRandomList("String")
        LazyColumn {
            items(randomItems) { randomItem ->
                Text(text = randomItem)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WordsPreview() {
    VokabelheftTheme {
        Words(navController = rememberNavController())
    }
}