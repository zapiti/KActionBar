package com.dev.nathan.kactionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView

class PaginaActivity : AppCompatActivity() {

    private lateinit var ui :PaginaUi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = PaginaUi()
        ui.setContentView(this)




    }
}
