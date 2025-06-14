package com.zmv.vokabelheft.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.R

@Composable
fun Question(navController: NavHostController,
             translate: String){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(R.string.translate_word),
            style = MaterialTheme.typography.bodyLarge)
        Spacer(Modifier.height(7.dp))
        Text(text = translate,
            style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(15.dp))
        TextField(
            value = "",
            onValueChange = {}
        )
        Spacer(Modifier.height(15.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {}) {
                Text(text = stringResource(R.string.ok))
            }
            Button(onClick = {}) {
                Text(text = stringResource(R.string.skip))
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuestionPreview(){
    Question(navController = rememberNavController(), "test")
}