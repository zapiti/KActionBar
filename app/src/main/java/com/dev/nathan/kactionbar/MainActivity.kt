package com.dev.nathan.kactionbar


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat

import android.view.Gravity

import org.jetbrains.anko.sdk25.coroutines.onClick

import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    lateinit var ui : MainUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        ui = MainUI()

       ui.setContentView(this)

       ui.ntActionBar.imageView.onClick {
           openUser()
       }

        ui.mensageBtn.onClick {


            val intent = Intent(this@MainActivity,PaginaActivity::class.java)
            startActivity(intent)
        }


    }

    private fun openUser() {
        if (!ui.mainDrawer.isDrawerOpen(Gravity.START)) {
            // setFragment(0)

            DrawerView()
            ui.mainDrawer.openDrawer(GravityCompat.START)
        }
    }
}
