package com.info.navigationdrawerkullanimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.drawer_baslik.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.NavigationFragment) as NavHostFragment
        NavigationUI.setupWithNavController(navigationView,navHostFragment.navController)

        toolbar.title = "Baslık"
        val toggle = ActionBarDrawerToggle(this,drawer,toolbar,0,0)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        val baslik = navigationView.inflateHeaderView(R.layout.drawer_baslik)
        baslik.textViewBaslik.text = "Merhaba"
    }

    override fun onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else{
            val newIntent = Intent(Intent.ACTION_MAIN)
            newIntent.addCategory(Intent.CATEGORY_HOME)
            newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(newIntent)
        }
    }
}