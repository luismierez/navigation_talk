package com.mierez.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.navigation_acitivty_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.navigation_acitivty_layout)
        setSupportActionBar(toolbar)

        // From -ktx
        setupActionBarWithNavController(findNavController(R.id.nav_host_fragment))

        // Otherwise need to call
        // NavigationUI.setupActionBarWithNavController(this,
        //         Navigation.findNavController(this, R.id.nav_host_fragment))
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp()
    }
}