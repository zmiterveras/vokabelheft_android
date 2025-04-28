package com.zmv.vokabelheft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zmv.vokabelheft.screens.MainScreen
import com.zmv.vokabelheft.ui.theme.VokabelheftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VokabelheftTheme {
                MainScreen()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun TestPreview() {
    VokabelheftTheme {
        MainScreen()
    }
}