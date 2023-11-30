package com.example.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

//            MultiModuleNavTheme {
            DestinationsNavHost(navGraph = NavGraph.root)
//
//
//            }
        }
    }

}

@RootNavGraph(start = true)
@Destination
@Composable
fun WelcomeScreen(
    navigator: DestinationsNavigator
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Welcome Text
        Text(
            text = "Welcome",
            modifier = Modifier.padding(bottom = 32.dp)
        )

        // Next Button
        Button(
            onClick = {
                 navigator.navigate(WelcomeScreen(1))
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Next")

        }
    }
}






