package com.kuldeep.momento.ui.navigation

sealed class MomentoRoute(val route: String) {
    data object Home : MomentoRoute("home")
}
