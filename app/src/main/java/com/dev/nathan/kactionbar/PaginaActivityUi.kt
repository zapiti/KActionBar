package com.dev.nathan.kactionbar

import android.graphics.Color


import org.jetbrains.anko.*


class PaginaUi :AnkoComponent<PaginaActivity>{
    override fun createView(ui: AnkoContext<PaginaActivity>)= with(ui){

        relativeLayout{
            toolbar {
                setTitleTextColor(Color.WHITE) // so far still needed
                backgroundColor = Color.BLACK
                id = MainUI.toolbar
            }.lparams(width = matchParent, height = wrapContent)
        }

    }

}