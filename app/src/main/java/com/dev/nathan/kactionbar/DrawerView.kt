package com.dev.nathan.kactionbar

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.nathan.usandooframework.DrawerViewUI
import org.jetbrains.anko.AnkoContext


/**
 * Created by natha on 16/02/2018.
 */


class DrawerView : Fragment() {
    //region <! Elementos da UI !>
    lateinit var ui: DrawerViewUI
    //private lateinit var mainUi : MainUI
    lateinit var mainUi: MainUI

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        ui = DrawerViewUI()
        this.mainUi = (activity as MainActivity).ui

     val view =  ui.createView(AnkoContext.Companion.create(context!!, this))
        //region <! Botão de fechar Drawer !>
        ui.backButton.isClickable = true
        ui.backButton.setOnClickListener{
            mainUi.mainDrawer.closeDrawer(Gravity.START)
        }
        //endregion



        return view
    }

    //region <! Criando a view !>

//        ui = DrawerViewUI()
//       ui.createView(AnkoContext.Companion.create(context, this))
//        this.mainUi = (activity as MainActivity).ui
//        //endregion
//
//


}
