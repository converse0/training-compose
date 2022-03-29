package com.example.designcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.designcompose.ui.theme.DesignComposeTheme
import com.example.designcompose.view.LaunchTrainingScreen
import com.example.designcompose.view.NewTrainingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.DarkGray
                ) {
                    LaunchTrainingScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewTrainingScreenPreview() {
    DesignComposeTheme {
        NewTrainingScreen()
    }
}
