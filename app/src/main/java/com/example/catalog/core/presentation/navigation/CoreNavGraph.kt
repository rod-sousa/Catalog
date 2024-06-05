package com.example.catalog.core.presentation.navigation

import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.fragment
import com.example.catalog.feature.home.presentation.view.HomeFragment
import com.example.catalog.feature.profile.presentation.view.ProfileFragment
import com.example.catalog.feature.search.presentation.view.SearchFragment

const val APP_ROUTE = "catalog_app"
class CoreNavGraph {
    fun setupNavGraphCore(navHost: NavHostFragment){
        navHost.navController.apply {
            graph = createGraph(
                route = APP_ROUTE,
                startDestination = Screen.Home.route
            ){
                fragment<HomeFragment>(Screen.Home.route)

                fragment<ProfileFragment>(Screen.Profile.route)

                fragment<SearchFragment>(Screen.Search.route)
            }
        }
    }
}