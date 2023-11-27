package com.example.multimodulenav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.book_datasource.destinations.ProfileScreenDestination
import com.example.multimodulenav.ui.theme.MultiModuleNavTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MultiModuleNavTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)


            }
        }
    }

}

@RootNavGraph(start = true) // sets this as the start destination of the default nav graph
@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {
    /*...*/
    navigator.navigate(ProfileScreenDestination(id = 7, groupName = "Kotlin programmers"))
}




