package com.example.catalog.core.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.catalog.R
import com.example.catalog.core.presentation.navigation.CoreNavGraph
import com.example.catalog.databinding.ActivityCoreBinding
import com.example.catalog.ui.theme.CatalogTheme

class MainActivity : ComponentActivity() {
    private val binding by viewBinding(ActivityCoreBinding::bind)
    private lateinit var navHost: NavHostFragment
    private val navGraph = CoreNavGraph() // TODO - inject with Hilt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)
        navHost = binding.coreNavFragment.getFragment()
        navGraph.setupNavGraphCore(navHost)
        setupNavBar(navHost.navController)
    }

    private fun setupNavBar(nacController: NavController){
        binding.bottomNav.setContent {
            CatalogTheme {
                TODO("bottomNAV")
            }
        }
    }
}