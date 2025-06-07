package com.zmv.vokabelheft.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.NavRoutes
import com.zmv.vokabelheft.R
import com.zmv.vokabelheft.utils.getResults

@Composable
fun Results(navController: NavHostController, answers: List<Int>, drawing: Int) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = stringResource(R.string.time_training),
            style = MaterialTheme.typography.bodyLarge)
        Text(text = answers[0].toString(),
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleLarge)
        Text(text = stringResource(R.string.questions),
            style = MaterialTheme.typography.bodyLarge)
        Text(text = answers[1].toString(),
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleLarge)
        Text(text = stringResource(R.string.right_answers),
            style = MaterialTheme.typography.bodyLarge)
        Text(text = answers[2].toString(),
            color = Color.Green,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleLarge)
        Text(text = stringResource(R.string.wrong_answers),
            style = MaterialTheme.typography.bodyLarge)
        Text(text = answers[3].toString(),
            fontWeight = FontWeight.SemiBold,
            color = Color.Red,
            style = MaterialTheme.typography.titleLarge)
        Box(modifier = Modifier.padding(10.dp).height(1.dp).fillMaxWidth().background(Color.Black))
        Text(text = "Comment",
            style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(15.dp))
        Image(painter = painterResource(drawing),
            contentDescription = "image")
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            navController.navigate(NavRoutes.Words.route)
        }) {
            Text(text = stringResource(R.string.to_dictionary))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ResultsPreview(){
    Results(navController = rememberNavController(), getResults(), R.drawable.bad148)
}
