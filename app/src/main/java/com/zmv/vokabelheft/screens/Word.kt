package com.zmv.vokabelheft.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.R
import com.zmv.vokabelheft.utils.getTestWord


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WordPreview() {
    Word(navController = rememberNavController(), word = getTestWord())
}

@Composable
fun Word(navController: NavHostController, word: List<String>, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OriginWord(word[0], word[5])
        PhoneticWord(word[1])
        Box(modifier = Modifier.padding(10.dp).height(1.dp).fillMaxWidth().background(Color.Black))
        if (word[3].isNotEmpty()) {
            VerbForms(word[3])
        }
        if (word[4].isNotEmpty()) {
            Plural(word[4])
        }
        TranslateWord(word[2])
        Spacer(modifier = modifier.height(50.dp))
        ButtonsBox()
    }
}

@Composable
fun OriginWord(originWord: String, part: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Text(text = originWord,
                Modifier.alignByBaseline(),
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.bodyLarge)
            Text(text = " ($part)", Modifier.alignByBaseline())
        }

    }
}

@Composable
fun PhoneticWord(phoneticWord: String) {
    Spacer(modifier = Modifier.height(3.dp))
    Row  {
        Text(text = "[ ")
        Text(text = phoneticWord, fontWeight = FontWeight.SemiBold)
        Text(text = " ]")
    }
}

@Composable
fun TranslateWord(translateWord: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(R.string.translate))
        Text(text = translateWord,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
fun VerbForms(verbForms: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(R.string.forms))
        Text(text = verbForms,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
fun Plural(plural: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(R.string.plural))
        Text(text = plural,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.bodyLarge)
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