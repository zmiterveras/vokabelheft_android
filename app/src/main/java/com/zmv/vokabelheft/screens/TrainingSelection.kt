package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.NavRoutes
import com.zmv.vokabelheft.composables.DropDownBox
import com.zmv.vokabelheft.R

@Composable
fun TrainingSelection(navController: NavHostController, card: Boolean = false) {
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
        Text(text = stringResource(R.string.choose_training_mode))
        DropDownBox(variants)
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {
                navController.navigate(NavRoutes.Question.route)
            }) {
                Text(text = stringResource(R.string.choose))
            }
            Button(onClick = {
                navController.navigate(NavRoutes.Words.route)
            }) {
                Text(text = stringResource(R.string.cancel))
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TrainingSelectionPreview(){
    TrainingSelection(navController = rememberNavController())
}