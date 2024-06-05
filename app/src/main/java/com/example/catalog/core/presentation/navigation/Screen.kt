package com.example.catalog.core.presentation.navigation

sealed class Screen(val route: String) {
    data object Profile : Screen("profile")
    data object Home : Screen("home")
    data object Search : Screen("search")
}