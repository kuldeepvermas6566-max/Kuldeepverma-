package com.kuldeep.momento.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun MomentoNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MomentoRoute.Home.route
    ) {
        homeDestination()
    }
}
