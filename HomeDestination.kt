package com.kuldeep.momento.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kuldeep.momento.ui.screens.HomeScreen

fun NavGraphBuilder.homeDestination() {
    composable(MomentoRoute.Home.route) {
        HomeScreen()
    }
}
