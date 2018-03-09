package com.dev.nathan.kactionbar.component

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.View
import android.view.ViewManager
import android.widget.*
import com.dev.nathan.kactionbar.R
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView

/**
 * Created by natha on 08/03/2018.
 */

fun ViewManager.ntActionBar(): NTActionBar = ntActionBar {}

inline fun ViewManager.ntActionBar(init: (@AnkoViewDslMarker NTActionBar).() -> Unit): NTActionBar =
        ankoView({ ctx: Context -> NTActionBar(ctx) }, theme = 0) { init() }

class NTActionBar(ctx: Context) : _RelativeLayout(ctx) {


    lateinit var title: TextView

    lateinit var imageView: ImageView

    lateinit var relativeLayout: RelativeLayout

    init {


        id = View.generateViewId()


            relativeLayout = relativeLayout {
                id = View.generateViewId()


                imageView = imageView {
                    isClickable = true
                    id = View.generateViewId()
                    visibility = View.GONE

                }.lparams {

                    topMargin = dip(16)
                    bottomMargin = dip(16)
                    height = dip(24)
                    width = dip(24)
                    marginStart = dip (24)


                }
                title = textView {
                    id = View.generateViewId()
                    textSize = dip(10).toFloat()
                    textColor = ContextCompat.getColor(context, R.color.white)
                    text = resources.getText(R.string.app_name)
                    this.gravity = Gravity.CENTER_VERTICAL

                }.lparams {

                 marginStart = dip (72)



                    topMargin = dip(8)
                    bottomMargin = dip(8)

                    height = matchParent
                    width = matchParent
                }





        }.lparams {

            width = matchParent

               height   =   dip(56)
            gravity = Gravity.END
            elevation = dip(8).toFloat()

            backgroundColor = ContextCompat.getColor(context, R.color.colorActionBar)


        }

    }
}
