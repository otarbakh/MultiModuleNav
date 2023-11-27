package com.example.multimodulenav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.book_datasource.destinations.SecondFragmentDestination
import com.example.book_list.destinations.FirstFragmentDestination
import com.example.multimodulenav.destinations.MainScreenDestination
import com.example.multimodulenav.ui.theme.MultiModuleNavTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.ramcosta.composedestinations.spec.Route


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appNavGraph = object : NavGraphSpec {
            override val route: String = "appNavGraph"
            override val startRoute: Route = MainScreenDestination
            override val destinationsByRoute: Map<String, DestinationSpec<*>> = mapOf(
                "main_screen" to MainScreenDestination,
                "first_fragment" to FirstFragmentDestination,
                "second_fragment" to SecondFragmentDestination
            )
        }

        setContent {

            MultiModuleNavTheme {
                DestinationsNavHost(navGraph = appNavGraph)


            }
        }
    }

}

@RootNavGraph(start = true)
@Destination
@Composable
fun MainScreen(
    navigator: DestinationsNavigator
) {
    Button(
        onClick = { navigator.navigate(FirstFragmentDestination) }) {
        Text("Go to First Fragment")
    }
}




