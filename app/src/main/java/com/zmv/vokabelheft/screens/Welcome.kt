package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme

@Composable
fun Welcome(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
       Column(horizontalAlignment = Alignment.CenterHorizontally) {
           Button(onClick = { }) {
               Text(text = "English")
           }
           Spacer(modifier = Modifier.height(20.dp))
           Button(onClick = { }) {
               Text(text = "Deutsch")
           }
       }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomePreview() {
    VokabelheftTheme {
        Welcome(navController = rememberNavController())
    }
}