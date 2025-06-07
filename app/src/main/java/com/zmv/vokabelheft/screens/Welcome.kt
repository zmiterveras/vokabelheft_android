package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.NavRoutes
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme
import com.zmv.vokabelheft.R

@Composable
fun Welcome(navController: NavHostController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
       Column(
           modifier = modifier,
           horizontalAlignment = Alignment.CenterHorizontally) {
           Text(text = stringResource(R.string.welcome),
               fontSize = 20.sp,
               fontWeight = FontWeight.SemiBold)

           Spacer(modifier = modifier.height(20.dp))

           Text(text = stringResource(R.string.choose_language))

           Spacer(modifier = modifier.height(20.dp))

           Button(onClick = {
               navController.navigate(NavRoutes.Words.route)
           }) {
               Text(text = stringResource(R.string.en_button))
           }
           Spacer(modifier = modifier.height(20.dp))
           Button(onClick = {
               navController.navigate(NavRoutes.Words.route)
           }) {
               Text(text = stringResource(R.string.de_button))
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