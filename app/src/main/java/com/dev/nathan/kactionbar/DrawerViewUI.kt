package com.dev.nathan.usandooframework

import android.annotation.SuppressLint
import android.app.ActionBar
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.*
import com.dev.nathan.kactionbar.DrawerView
import com.dev.nathan.kactionbar.R


import org.jetbrains.anko.*

/**
 * Created by natha on 16/02/2018.
 */

class DrawerViewUI : AnkoComponent<DrawerView>{


    lateinit var filtersList : ListView
    lateinit var mainFiltersActionBar : LinearLayout
    lateinit var applyButton : TextView
    lateinit var backButton : ImageView



    companion object {
        var idListView = 1

    }

    @SuppressLint("ResourceType")
    override fun createView(ui: AnkoContext<DrawerView>) = with(ui) {
        verticalLayout {
            lparams {
                width = matchParent
                height = matchParent
            }

            //barra de ações
            mainFiltersActionBar = linearLayout {


                //
//                //Texto Filtrosb
//                profileImageView = imageView {
//                    generateViewId()
//                    if (SKApplication.images.containsKey("USER_IMAGE")) {
//                        imageBitmap = SKApplication.images["USER_IMAGE"]
//                    }
//                }.lparams(dip(80), dip(80)) {
//                    margin = dip(10)
//                }
//
//
                //botão voltar
                backButton = imageView(
                        imageResource = R.drawable.ic_clear_gray
                ).lparams {
                    width = wrapContent
                    height = matchParent
                    gravity = Gravity.CENTER
                    contentDescription = resources.getString(R.string.back)
                    marginEnd = dip(10)
                    marginStart = dip(10)

                }

            }.lparams{
                width = matchParent
                height = dip(56)
                gravity = Gravity.CENTER
            }

            verticalLayout {
                linearLayout {
                    //      backgroundResource = R.drawable.bottom_shadow
                }.lparams{
                    width = matchParent
                    height = dip(4)
                }
                scrollView {
                    //lista de filtros
                    verticalLayout {
                        //                        filtersList = listView {
//                            id = idListView
//                            divider = resources.getDrawable(R.drawable.list_divider, null)
//                            visibility = View.GONE
//                            //overscrollFooter = resources.getDrawable(R.color.transparent, resources.newTheme())
//                        }.lparams{
//                            width = matchParent
//                            height = matchParent
//                        }
//                        exercise = skOptionLayout{
//                            isClickable = true
//                        }
//
//                        indicator = skOptionLayout {
//                            isClickable = true
//                        }
//
//                        referenceDate = skOptionLayout{
//                            isClickable = true
//                        }


                    }.lparams{
                        width = matchParent
                        height = matchParent
                    }
                }.lparams{
                    width = matchParent
                }
            }.lparams{
                width = matchParent
                height = matchParent
            }
        }
    }

}