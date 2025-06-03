package com.zmv.vokabelheft.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.utils.getAnswer
import com.zmv.vokabelheft.utils.getCheck
import com.zmv.vokabelheft.R

@Composable
fun WordResult(navController: NavHostController,
               check: Boolean,
               results: List<String>,
               wrong: String = "bad") {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (check) {
            Text(text = stringResource(R.string.true_label),
                color = Color.Green,
                style = MaterialTheme.typography.headlineLarge)
        } else {
            Text(text = stringResource(R.string.false_label),
                color = Color.Red,
                style = MaterialTheme.typography.headlineLarge)
            Text(text = wrong,
                textDecoration = TextDecoration.LineThrough)
        }
        Box(modifier = Modifier.padding(10.dp).height(1.dp).fillMaxWidth().background(Color.Black))
        Box(modifier = Modifier.padding(10.dp).height(1.dp).fillMaxWidth().background(Color.Black))
        Text(text = results[0],
            style = MaterialTheme.typography.headlineSmall)
        Text(text = "("+results[5]+")")
        Text(text = "["+results[1]+"]",
            style = MaterialTheme.typography.bodyLarge)
        Box(modifier = Modifier.padding(10.dp).height(1.dp).fillMaxWidth().background(Color.Black))
        if (results[3].isNotEmpty()) {
            Text(text = stringResource(R.string.forms),
                style = MaterialTheme.typography.bodyLarge)
            Text(text = results[3],
                style = MaterialTheme.typography.headlineSmall)
        }
        if (results[4].isNotEmpty()) {
            Text(text = stringResource(R.string.plural),
                style = MaterialTheme.typography.bodyLarge)
            Text(text = results[4],
                style = MaterialTheme.typography.headlineSmall)
        }
        Text(text = stringResource(R.string.translate),
            style = MaterialTheme.typography.bodyLarge)
        Text(text = results[2],
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(50.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {}) {
                Text(text = stringResource(R.string.next))
            }
            Button(onClick = {}) {
                Text(text = stringResource(R.string.stop))
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WordResultPreview(){
    WordResult(navController = rememberNavController(), getCheck(1), getAnswer(4))
}