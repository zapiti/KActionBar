package com.dev.nathan.kactionbar

import android.graphics.Color
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.view.Gravity
import android.view.View
import android.widget.*
import com.dev.nathan.kactionbar.component.NTActionBar
import com.dev.nathan.kactionbar.component.ntActionBar


import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.sdk25.coroutines.onItemLongClick
import org.jetbrains.anko.support.v4.drawerLayout

class MainUI : AnkoComponent<MainActivity> {


    lateinit var mainLayout: RelativeLayout
lateinit var ntActionBar: NTActionBar
    lateinit var mensageBtn: Button

    lateinit var mainDrawer: DrawerLayout


    companion object {
        var toolbar = 1
        var idBtnMensage = 2
    }


    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {


    drawerLayout {
        mainDrawer = this
                 mainLayout = relativeLayout {

                ntActionBar = ntActionBar(){
                    imageView.visibility = View.VISIBLE
                    imageView.imageResource = R.drawable.ic_menu_8dp
                }
                mensageBtn = button("essebotao top") {
                    View.generateViewId()
                    id = idBtnMensage
                }.lparams {
                below(ntActionBar)
                }
            }
            //drawer dos filtros
            navigationView {

            }.lparams {
                width = matchParent
                height = matchParent
                gravity = Gravity.START

                isVerticalScrollBarEnabled = false
            }

        }

    }
    }



