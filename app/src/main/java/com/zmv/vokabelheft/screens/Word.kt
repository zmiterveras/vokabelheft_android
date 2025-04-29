package com.zmv.vokabelheft.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WordPreview() {
    Word(navController = rememberNavController())
}

@Composable
fun Word(navController: NavHostController, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize(),
//        modifier = modifier.width(IntrinsicSize.Max),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OriginWord()
        PhoneticWord()
        Box(modifier = Modifier.padding(10.dp).height(1.dp).fillMaxWidth().background(Color.Black))
        TranslateWord()
        Spacer(modifier = modifier.height(50.dp))
        ButtonsBox()
    }
}

@Composable
fun OriginWord() {
    Row {
        Text(text = "Word: ", fontWeight = FontWeight.SemiBold)
        Text(text = "Original word")
    }
}

@Composable
fun PhoneticWord() {
    Spacer(modifier = Modifier.height(3.dp))
    Row {
        Text(text = "[ ", fontWeight = FontWeight.SemiBold)
        Text(text = "phonetic word")
        Text(text = " ]", fontWeight = FontWeight.SemiBold)
    }
}

@Composable
fun TranslateWord() {
    Row {
        Text(text = "Translate: ", fontWeight = FontWeight.SemiBold)
        Text(text = "Translate word")
    }
}

@Composable
fun ButtonsBox() {
    Row {
        Button(onClick = { }) {
            Text(text = stringResource(R.string.back))
        }
        Spacer(modifier = Modifier.width(15.dp))
        Button(onClick = { }) {
            Text(text = stringResource(R.string.edit))
        }
    }
}