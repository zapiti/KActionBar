package com.dev.nathan.kactionbar

import android.graphics.*
import android.support.v4.content.ContextCompat
import android.support.v4.widget.DrawerLayout
import android.view.Gravity
import android.view.View
import android.widget.*
import com.dev.nathan.kactionbar.component.NTActionBar
import com.dev.nathan.kactionbar.component.NTListCard
import com.dev.nathan.kactionbar.component.ntActionBar
import com.dev.nathan.kactionbar.component.ntListCard


import org.jetbrains.anko.*
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4.drawerLayout

class MainUI : AnkoComponent<MainActivity> {


    lateinit var mainLayout: RelativeLayout
    lateinit var ntActionBar: NTActionBar
    lateinit var btn1 : NTListCard
    lateinit var btn2:NTListCard
    lateinit var btn3: NTListCard
    lateinit var btn4: NTListCard
    lateinit var mensageBtn: Button
    lateinit var drawerActionbar :NTActionBar


    lateinit var mainDrawer: DrawerLayout
    lateinit var titleUser: TextView

    lateinit var imageViewUser: ImageView

    lateinit var relativeLayoutUser: RelativeLayout

    companion object {
        var toolbar = 1
        var idBtnMensage = 2
    }


    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {


    drawerLayout {
        mainDrawer = this

            mainLayout = relativeLayout {

                ntActionBar = ntActionBar() {
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
                relativeLayout {
                    relativeLayoutUser = relativeLayout {
                        id = View.generateViewId()
                        gravity = Gravity.CENTER_VERTICAL
                        backgroundColor = ContextCompat.getColor(context, R.color.colorActionBar)

                        imageViewUser = imageView {
                            isClickable = true
                            id = View.generateViewId()
                            imageResource = R.drawable.nathan

                        }.lparams {
                            topMargin = dip(24)
                       //     bottomMargin = dip(14)
                            marginStart = dip(24)
                            height = dip(64)
                            width = dip(64)


                        }
                        titleUser = textView {
                            id = View.generateViewId()

                            textSize = dip(8).toFloat()
                            textColor = ContextCompat.getColor(context, R.color.white)
                            text = resources.getText(R.string.app_name)


                        }.lparams {
                            marginEnd= dip(16)
                            below(imageViewUser)



                            topMargin = dip(8)
                            bottomMargin = dip(8)
                            leftMargin = dip(8)
                            height = matchParent
                            width = matchParent
                        }





                    }.lparams {

                        width = matchParent
                        val  heights = dip(128)
                        height   =  heights
                        gravity = Gravity.END
                        elevation = dip(8).toFloat()

                     //


                    }
                      btn1 = ntListCard {

                      }.lparams{
                          below(relativeLayoutUser)
                      }
                      btn2 = ntListCard {

                      }.lparams{
                          below(btn1)
                      }

                      btn3 = ntListCard {

                      }.lparams{
                          below(btn2)
                      }
                      btn4 = ntListCard {

                      }.lparams{
                          below(btn3)
                      }
                      linearLayout{
                          backgroundColor = Color.GRAY
                      }.lparams{
                          width = matchParent
                          height = dip(1)
                          below(btn4)
                          elevation = dip(8).toFloat()
                      }
                  }

            }.lparams {
                width = matchParent
                height = matchParent
             //   rightMargin =
                gravity = Gravity.START



                isVerticalScrollBarEnabled = false
            }

    }

    }




}



