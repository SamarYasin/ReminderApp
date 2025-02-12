package com.workload.reminderapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import com.workload.screens.ui.home.RouteHomeScreen
import com.workload.screens.ui.makeReminder.RouteMakeReminderScreen
import com.workload.style.ReminderAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var navGraph: NavGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReminderAppTheme {

                val navController = rememberNavController()
                navGraph = navController.createGraph(
                    startDestination = "HomeScreen"
                ) {
                    composable("HomeScreen") {
                        RouteHomeScreen(modifier = Modifier,
                            onFABClick = {
                                navController.navigate("MakeReminderScreen")
                            }
                        )
                    }
                    composable("MakeReminderScreen") {
                        RouteMakeReminderScreen(modifier = Modifier)
                    }
                }

                NavHost(navController = navController, graph = navGraph)

            }
        }
    }
}