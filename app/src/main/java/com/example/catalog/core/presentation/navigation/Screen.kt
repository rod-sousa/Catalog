package com.example.catalog.core.presentation.navigation

import androidx.annotation.StringRes
import com.example.catalog.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    data object Profile : Screen("profile", R.string.bottom_nav_profile)
    data object Home : Screen("home", R.string.bottom_nav_home)
    data object Search : Screen("search", R.string.bottom_nav_search)
}