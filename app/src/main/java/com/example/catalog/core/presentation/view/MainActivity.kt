package com.example.catalog.core.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.catalog.R
import com.example.catalog.databinding.ActivityCoreBinding
import com.example.catalog.ui.theme.CatalogTheme

class MainActivity : ComponentActivity() {
    private val binding by viewBinding(ActivityCoreBinding::bind)
    private lateinit var navHost: NavHostFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)
        navHost = binding.coreNavFragment.getFragment()

        binding.bottomNav.setContent {
            CatalogTheme {
                TODO("bottomNAV")
            }
        }
    }
}